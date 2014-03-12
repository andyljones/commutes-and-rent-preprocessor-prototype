package io.github.andyljones.commutes_and_rents;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import uk.org.naptan.NaPTAN;
import uk.org.naptan.StopPointStructure;

public class StopPointMapFactory {

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
}
