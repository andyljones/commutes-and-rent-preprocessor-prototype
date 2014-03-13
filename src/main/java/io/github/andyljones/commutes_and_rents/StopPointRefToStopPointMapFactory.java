package io.github.andyljones.commutes_and_rents;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import uk.org.naptan.NaPTAN;
import uk.org.naptan.StopPointStructure;

/**
 * Factory for building a map from StopPointRefs to their StopPoints.
 * @author andy
 *
 */
public class StopPointRefToStopPointMapFactory {
    
    /**
     * Extracts a map from StopPointRefs to StopPoints from a NaPTAN model.
     * @param root The root of the NaPTAN model.
     * @return A map from StopPointRefs to StopPoints.
     */
    public static Map<String, StopPointStructure> build(NaPTAN root)
    {
        List<StopPointStructure> stopPoints = root.getStopPoints().getStopPoint();
        
        Map<String, StopPointStructure> result = new HashMap<>();
        for (StopPointStructure stopPoint : stopPoints)
        {
            result.put(stopPoint.getAtcoCode(), stopPoint);
        }
        
        return result;
    }
    
    //TODO: Not tested
    public static Map<String, StopPointStructure> build(List<NaPTAN> roots)
    {
        Map<String, StopPointStructure> result = new HashMap<>();
        for (NaPTAN root : roots)
        {
            Map<String, StopPointStructure> map = build(root);
            result.putAll(map);
        }
        
        return result;
    }
}
