package io.github.andyljones.commutes_and_rents;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import javax.xml.datatype.Duration;

import uk.org.transxchange.AbstractVehicleJourneyStructure;
import uk.org.transxchange.JourneyPatternRefStructure;
import uk.org.transxchange.JourneyPatternSectionRefStructure;
import uk.org.transxchange.JourneyPatternSectionStructure;
import uk.org.transxchange.JourneyPatternStructure;
import uk.org.transxchange.JourneyPatternTimingLinkStructure;
import uk.org.transxchange.TransXChange;

/**
 * Parses a TransXChange timetable into a HashMap whose keys are NaPTAN StopPointRef codes and whose values are lists
 * of edges out of that stop point, with one for each departure from the stop point.
 * @author andy
 *
 */
public class EdgeHashMapFactory 
{    
    /**
     * A HashMap whose keys are NaPTAN StopPointRef codes and whose values are lists of edges out of that stop point, 
     * with one for each departure from the stop point.
     * @return
     */
    public HashMap<String, List<OutEdge>> getTraversalTimes() { return travelTimes; }
    final HashMap<String, List<OutEdge>> travelTimes = new HashMap<>();
    
    final HashMap<String, JourneyPatternStructure> patternHashMap;
    final HashMap<String, JourneyPatternSectionStructure> sectionHashMap;
    
    /**
     * Parses the timetable and initializes the property getTraversalTimes().
     * @param timetableRoot
     */
    public EdgeHashMapFactory(TransXChange timetableRoot)
    {
        patternHashMap = JourneyPatternHashMapFactory.build(timetableRoot);
        sectionHashMap = JourneySectionHashMapFactory.build(timetableRoot);

        buildTravelTimesHashMap(timetableRoot);
    }
    
    private void buildTravelTimesHashMap(TransXChange timetableRoot)
    {
        List<AbstractVehicleJourneyStructure> journies = timetableRoot.getVehicleJourneys().getVehicleJourneyAndFlexibleVehicleJourney();

        for (AbstractVehicleJourneyStructure journey : journies)
        {
            JourneyPatternRefStructure patternRef = journey.getJourneyPatternRef();

            if (patternRef != null)
            {
                JourneyPatternStructure pattern = patternHashMap.get(patternRef.getValue());
                addTravelTimes(pattern);
            }
        }
    }

    private void addTravelTimes(JourneyPatternStructure pattern) 
    {        
        List<JourneyPatternSectionRefStructure> sectionRefs = pattern.getJourneyPatternSectionRefs();
        
        for (JourneyPatternSectionRefStructure sectionRef : sectionRefs)
        {
            JourneyPatternSectionStructure section = sectionHashMap.get(sectionRef.getValue());
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
        Duration travelTime = link.getRunTime();
                    
        if (!travelTimes.containsKey(originRef))
        {
            List<OutEdge> newList = new ArrayList<>();
            travelTimes.put(originRef, newList);
        }
        
        Node destination = new Node(destinationRef);
        travelTimes.get(originRef).add(new OutEdge(destination, travelTime));
    }
}
