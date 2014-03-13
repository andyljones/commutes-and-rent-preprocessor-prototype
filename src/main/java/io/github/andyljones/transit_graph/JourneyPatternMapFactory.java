package io.github.andyljones.transit_graph;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import uk.org.transxchange.JourneyPatternStructure;
import uk.org.transxchange.ServiceStructure;
import uk.org.transxchange.TransXChange;

public class JourneyPatternMapFactory {

    public static Map<String, JourneyPatternStructure> build(TransXChange root)
    {     
        List<ServiceStructure> services = root.getServices().getService();
        
        Map<String, JourneyPatternStructure> wholeMap = new HashMap<String, JourneyPatternStructure>();
        for (ServiceStructure service : services)
        {
            Map<String, JourneyPatternStructure> serviceMap = buildJourneyPatternMap(service);
            
            wholeMap.putAll(serviceMap);   
        }
        
        return wholeMap;
    }

    private static Map<String, JourneyPatternStructure> buildJourneyPatternMap(ServiceStructure service)
    {
        List<JourneyPatternStructure> patterns = service.getStandardService().getJourneyPattern();
        
        Map<String, JourneyPatternStructure> map = new HashMap<String, JourneyPatternStructure>();
        for (JourneyPatternStructure pattern : patterns)
        {
            map.put(pattern.getId(), pattern);
        }
        
        return map;
    }
}
