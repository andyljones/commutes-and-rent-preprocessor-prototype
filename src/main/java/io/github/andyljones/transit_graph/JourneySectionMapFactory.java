package io.github.andyljones.transit_graph;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import uk.org.transxchange.JourneyPatternSectionStructure;
import uk.org.transxchange.TransXChange;

public class JourneySectionMapFactory {

    public static Map<String, JourneyPatternSectionStructure> build(TransXChange root)
    {     
        List<JourneyPatternSectionStructure> sections = root.getJourneyPatternSections().getJourneyPatternSection();
        
        Map<String, JourneyPatternSectionStructure> wholeMap = new HashMap<String, JourneyPatternSectionStructure>();
        for (JourneyPatternSectionStructure section : sections)
        {            
            wholeMap.put(section.getId(), section);   
        }
        
        return wholeMap;
    }
}
