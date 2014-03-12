package io.github.andyljones.commutes_and_rents;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import uk.org.naptan.StopAreaVersionedRefStructure;
import uk.org.naptan.StopPointStructure;

public class StopAreaMapFactory {

    public static Map<String, List<String>> build(Collection<String> stopPointRefs, Map<String, StopPointStructure> stopPointMap)
    {
        Map<String, List<String>> result = new HashMap<>();
        for (String stopPointRef : stopPointRefs)
        {            
            List<StopAreaVersionedRefStructure> stopAreaRefStructs = stopPointMap.get(stopPointRef).getStopAreas().getStopAreaRef();
            List<String> stopAreaRefs = stopAreaRefStructs.stream().map(struct -> struct.getValue()).collect(Collectors.toList());
            
            putValueInKeys(result, stopAreaRefs, stopPointRef);
        }
        
        return result;        
    }
    
    private static void putValueInKeys(Map<String, List<String>> map, List<String> keys, String value)
    {
        for (String key : keys)
        {
            if (!map.containsKey(key))
            {
                map.put(key, new ArrayList<String>());
            }
            
            map.get(key).add(value);
        }
    }
}
