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

public class TraversalTimeHashMapFactory 
{    
    final HashMap<String, JourneyPatternStructure> patternHashMap;
    final HashMap<String, JourneyPatternSectionStructure> sectionHashMap;
    
    public HashMap<TransitLink, List<Duration>> getTraversalTimes() { return traversalTimes; }
    final HashMap<TransitLink, List<Duration>> traversalTimes = new HashMap<TransitLink, List<Duration>>();

    public TraversalTimeHashMapFactory(TransXChange timetableRoot)
    {
        patternHashMap = JourneyPatternHashMapFactory.build(timetableRoot);
        sectionHashMap = JourneySectionHashMapFactory.build(timetableRoot);

        buildTraversalTimesHashMap(timetableRoot);
    }
    
    private void buildTraversalTimesHashMap(TransXChange timetableRoot)
    {
        List<AbstractVehicleJourneyStructure> journies = timetableRoot.getVehicleJourneys().getVehicleJourneyAndFlexibleVehicleJourney();

        for (AbstractVehicleJourneyStructure journey : journies)
        {
            JourneyPatternRefStructure patternRef = journey.getJourneyPatternRef();

            if (patternRef != null)
            {
                JourneyPatternStructure pattern = patternHashMap.get(patternRef.getValue());
                AddTraversalTimes(pattern);
            }
        }
    }
    
    private void AddTraversalTimes(JourneyPatternStructure pattern) 
    {        
        List<JourneyPatternSectionRefStructure> sectionRefs = pattern.getJourneyPatternSectionRefs();
        
        for (JourneyPatternSectionRefStructure sectionRef : sectionRefs)
        {
            JourneyPatternSectionStructure section = sectionHashMap.get(sectionRef.getValue());
            AddTraversalTimes(section);
        }
    }

    private void AddTraversalTimes(JourneyPatternSectionStructure section) 
    {
        List<JourneyPatternTimingLinkStructure> timingLinks = section.getJourneyPatternTimingLink();
        
        for (JourneyPatternTimingLinkStructure timingLink : timingLinks)
        {
            TransitLink transitLink = createTransitLink(timingLink);

            if (!traversalTimes.containsKey(transitLink))
            {
                List<Duration> newList = new ArrayList<Duration>();
                traversalTimes.put(transitLink, newList);
            }
           
            traversalTimes.get(transitLink).add(timingLink.getRunTime());
        }
    }

    private static TransitLink createTransitLink(JourneyPatternTimingLinkStructure timingLink) 
    {
        String origin = timingLink.getFrom().getStopPointRef().getValue();
        String destination = timingLink.getTo().getStopPointRef().getValue();
       
        TransitLink transitLink = new TransitLink(origin, destination);
        
        return transitLink;
    }
}
