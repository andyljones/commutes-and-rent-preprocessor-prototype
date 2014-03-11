package io.github.andyljones.commutes_and_rents;

import java.util.HashMap;
import java.util.List;

import uk.org.transxchange.JourneyPatternStructure;
import uk.org.transxchange.ServiceStructure;

public class JourneyPatternHashMapFactory {

    public static HashMap<String, JourneyPatternStructure> build(List<ServiceStructure> services)
    {     
        HashMap<String, JourneyPatternStructure> wholeHashmap = new HashMap<String, JourneyPatternStructure>();
        for (ServiceStructure service : services)
        {
            HashMap<String, JourneyPatternStructure> serviceHashmap = buildJourneyPatternHashMap(service);
            
            wholeHashmap.putAll(serviceHashmap);   
        }
        
        return wholeHashmap;
    }

    private static HashMap<String, JourneyPatternStructure> buildJourneyPatternHashMap(ServiceStructure service)
    {
        List<JourneyPatternStructure> patterns = service.getStandardService().getJourneyPattern();
        
        HashMap<String, JourneyPatternStructure> hashmap = new HashMap<String, JourneyPatternStructure>();
        for (JourneyPatternStructure pattern : patterns)
        {
            hashmap.put(pattern.getId(), pattern);
        }
        
        return hashmap;
    }
}
