package commutes_and_rents;

import io.github.andyljones.commutes_and_rents.StopAreaMapFactory;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Assert;
import org.junit.Test;

import uk.org.naptan.StopAreaRefsStructure;
import uk.org.naptan.StopAreaVersionedRefStructure;
import uk.org.naptan.StopPointStructure;

public class StopAreaMapFactoryTest {

    @Test
    public void build_GivenTwoStopPointsThatMapToTheSameStopArea_ShouldReturnAMapWithOneEntry()
    {
        // Setup
        List<String> listData = Arrays.asList(new String[] {"point1", "point2"});
        
        Map<String, StopPointStructure> mapData = new HashMap<>();
        mapData.put("point1", buildStopPointWithStopArea("area1"));
        mapData.put("point2", buildStopPointWithStopArea("area1"));
        
        // Execution
        Map<String, List<String>> result = StopAreaMapFactory.build(listData, mapData);
        
        // Verification
        int expected = 1;
        int actual = result.size();
        
        Assert.assertEquals(expected, actual);
        
    }
    
    private static StopPointStructure buildStopPointWithStopArea(String stopAreaRef)
    {
        StopAreaVersionedRefStructure tmp1 = new StopAreaVersionedRefStructure() {{ setValue("area1"); }};
        StopAreaRefsStructure tmp2 = new StopAreaRefsStructure() {{ getStopAreaRef().add(tmp1); }};
        StopPointStructure tmp3 = new StopPointStructure() {{ setStopAreas(tmp2); }};
        
        return tmp3;
    }
}
