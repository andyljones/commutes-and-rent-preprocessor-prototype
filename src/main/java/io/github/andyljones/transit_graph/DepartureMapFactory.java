package io.github.andyljones.transit_graph;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import uk.org.transxchange.AbstractVehicleJourneyStructure;
import uk.org.transxchange.JourneyPatternRefStructure;
import uk.org.transxchange.JourneyPatternSectionRefStructure;
import uk.org.transxchange.JourneyPatternSectionStructure;
import uk.org.transxchange.JourneyPatternStructure;
import uk.org.transxchange.JourneyPatternTimingLinkStructure;
import uk.org.transxchange.TransXChange;

/**
 * Parses a TransXChange timetable into a Map whose keys are NaPTAN StopPointRef codes and whose values are lists
 * of edges out of that stop point, with one for each departure from the stop point.
 * @author andy
 *
 */
public class DepartureMapFactory 
{    
    /**
     * A Map whose keys are NaPTAN StopPointRef codes and whose values are lists of edges out of that stop point, 
     * with one for each departure from the stop point.
     * @return
     */
    public Map<String, List<OutEdge>> build() { return travelTimes; }
    private final Map<String, List<OutEdge>> travelTimes = new HashMap<>();
    
    private final Map<String, JourneyPatternStructure> patternMap;
    private final Map<String, JourneyPatternSectionStructure> sectionMap;
    
    private final Date arbitraryDate = new Date();
    
    /**
     * Parses the timetable and initializes the property getTraversalTimes().
     * @param timetableRoot
     */
    public DepartureMapFactory(TransXChange timetableRoot)
    {
        patternMap = JourneyPatternMapFactory.build(timetableRoot);
        sectionMap = JourneySectionMapFactory.build(timetableRoot);

        buildTravelTimesMap(timetableRoot);
    }
    
    private void buildTravelTimesMap(TransXChange timetableRoot)
    {
        List<AbstractVehicleJourneyStructure> journies = timetableRoot.getVehicleJourneys().getVehicleJourneyAndFlexibleVehicleJourney();

        for (AbstractVehicleJourneyStructure journey : journies)
        {
            JourneyPatternRefStructure patternRef = journey.getJourneyPatternRef();

            if (patternRef != null)
            {
                JourneyPatternStructure pattern = patternMap.get(patternRef.getValue());
                addTravelTimes(pattern);
            }
        }
    }

    private void addTravelTimes(JourneyPatternStructure pattern) 
    {        
        List<JourneyPatternSectionRefStructure> sectionRefs = pattern.getJourneyPatternSectionRefs();
        
        for (JourneyPatternSectionRefStructure sectionRef : sectionRefs)
        {
            JourneyPatternSectionStructure section = sectionMap.get(sectionRef.getValue());
            addTravelTimes(section);
        }
    }

    private void addTravelTimes(JourneyPatternSectionStructure section) 
    {
        List<JourneyPatternTimingLinkStructure> links = section.getJourneyPatternTimingLink();
        
        for (JourneyPatternTimingLinkStructure link : links)
        {
            addTravelTime(link);
        }
    }
    
    private void addTravelTime(JourneyPatternTimingLinkStructure link)
    {
        String originRef = link.getFrom().getStopPointRef().getValue();
        String destinationRef = link.getTo().getStopPointRef().getValue();
        long travelTime = link.getRunTime().getTimeInMillis(arbitraryDate);
                    
        if (!travelTimes.containsKey(originRef))
        {
            List<OutEdge> newList = new ArrayList<>();
            travelTimes.put(originRef, newList);
        }
        
        Node destination = new Node(destinationRef);
        travelTimes.get(originRef).add(new OutEdge(destination, travelTime));
    }
}
