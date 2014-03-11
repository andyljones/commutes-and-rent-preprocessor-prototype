package io.github.andyljones.commutes_and_rents;

import java.util.HashMap;
import java.util.List;

import uk.org.transxchange.JourneyPatternSectionStructure;

public class JourneySectionHashMapFactory {

    public static HashMap<String, JourneyPatternSectionStructure> build(List<JourneyPatternSectionStructure> sections)
    {     
        HashMap<String, JourneyPatternSectionStructure> wholeHashmap = new HashMap<String, JourneyPatternSectionStructure>();
        for (JourneyPatternSectionStructure section : sections)
        {            
            wholeHashmap.put(section.getId(), section);   
        }
        
        return wholeHashmap;
    }
}
