package io.github.andyljones.commutes_and_rents;

import java.util.Collection;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class EdgeHashMapFactory {

    /**
     * Takes a HashMap of departures from stop points and produces a HashMap of only the longest links to each 
     * destination. Effectively reduces a multigraph to a graph.
     * 
     * @param allDepartures Departures from stop points, represented by a HashMap from a StopPointRef to a list of OutEdges.
     * @return A HashMap of StopPointRefs to lists of the longest OutEdges.
     */
    public static HashMap<String, List<OutEdge>> build(HashMap<String, List<OutEdge>> allDepartures)
    {
        HashMap<String, List<OutEdge>> result = new HashMap<>();
        
        for (String stopPointRef : allDepartures.keySet())
        {
            List<OutEdge> departures = allDepartures.get(stopPointRef);
            Comparator<OutEdge> comparator = new OutEdgeDurationComparer();
            
            Collection<Optional<OutEdge>> possibleLongestEdges = departures.stream()
                    .collect(Collectors.groupingBy(edge -> edge.getDestination().getStopCodeRef(), Collectors.maxBy(comparator))).values();
            
            List<OutEdge> longestEdges = 
                    possibleLongestEdges.stream().map(optionalEdge -> optionalEdge.get()).collect(Collectors.toList());
            
            result.put(stopPointRef, longestEdges);
        }
        
        return result;
    }
}
