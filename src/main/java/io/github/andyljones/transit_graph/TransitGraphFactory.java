package io.github.andyljones.transit_graph;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import uk.org.naptan.NaPTAN;
import uk.org.naptan.StopPointStructure;
import uk.org.transxchange.TransXChange;

public class TransitGraphFactory {

    private final static long serviceChangeTime = 300_000;
    
    //TODO: Break this up.
    public static Map<String, Node> build()
    {
        List<TransXChange> timetableRoots = TimetableFetcher.fetch();
        
        List<Map<String, Node>> serviceGraphs = new ArrayList<>();
        for (TransXChange timetableRoot : timetableRoots)
        {
            DepartureMapFactory departuresFactory = new DepartureMapFactory(timetableRoot);
            Map<String, List<OutEdge>> departures = departuresFactory.build();
            Map<String, List<OutEdge>> edges = EdgeMapFactory.build(departures);
            
            PerServiceGraphFactory serviceGraphFactory = new PerServiceGraphFactory(edges);
            Map<String, Node> serviceGraph = serviceGraphFactory.build();
            
            serviceGraphs.add(serviceGraph);
        }

        Map<String, Node> finalGraph = GraphUnionFactory.build(serviceGraphs);
        
        List<NaPTAN> naptanRoot = NaptanFetcher.fetch();
        Map<String, StopPointStructure> stopPointMap = StopPointRefToStopPointMapFactory.build(naptanRoot);
        
        Collection<String> stopPointRefs = finalGraph.keySet();
        Map<String, List<String>> stopAreaMap = StopAreaRefToStopPointRefsMapFactory.build(stopPointRefs, stopPointMap);
        Collection<List<String>> stopPointCliques = stopAreaMap.values();
        
        TransitGraphUpdater cliqueUpdater = new TransitGraphUpdater(serviceChangeTime);
        cliqueUpdater.update(finalGraph, stopPointCliques);

        System.out.println("Number of stop areas: " + stopAreaMap.size());   
        System.out.println("Number of stop points: " + stopPointRefs.size());     
        
        return finalGraph;
    }
}
