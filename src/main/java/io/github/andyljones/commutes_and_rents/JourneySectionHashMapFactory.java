package io.github.andyljones.commutes_and_rents;

import java.util.HashMap;
import java.util.List;

import uk.org.transxchange.JourneyPatternSectionStructure;
import uk.org.transxchange.TransXChange;

public class JourneySectionHashMapFactory {

    public static HashMap<String, JourneyPatternSectionStructure> build(TransXChange root)
    {     
        List<JourneyPatternSectionStructure> sections = root.getJourneyPatternSections().getJourneyPatternSection();
        
        HashMap<String, JourneyPatternSectionStructure> wholeHashmap = new HashMap<String, JourneyPatternSectionStructure>();
        for (JourneyPatternSectionStructure section : sections)
        {            
            wholeHashmap.put(section.getId(), section);   
        }
        
        return wholeHashmap;
    }
}
