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

public class TravelTimeHashMapFactory 
{    
    final HashMap<String, JourneyPatternStructure> patternHashMap;
    final HashMap<String, JourneyPatternSectionStructure> sectionHashMap;
    
    public TravelTimeHashMap getTraversalTimes() { return travelTimes; }
    final TravelTimeHashMap travelTimes = new TravelTimeHashMap();

    public TravelTimeHashMapFactory(TransXChange timetableRoot)
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
            String origin = link.getFrom().getStopPointRef().getValue();
            String destination = link.getTo().getStopPointRef().getValue();
            Duration travelTime = link.getRunTime();
            
            if (!travelTimes.containsKey(origin))
            {
                HashMap<String, List<Duration>> newHashMap = new HashMap<String, List<Duration>>();
                travelTimes.put(origin, newHashMap);
            }
            
            if (!travelTimes.get(origin).containsKey(destination))
            {
                List<Duration> newList = new ArrayList<Duration>();
                travelTimes.get(origin).put(destination, newList);
            }
           
            travelTimes.get(origin).get(destination).add(travelTime);
        }
    }
}
