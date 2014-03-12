package commutes_and_rents;

import java.util.HashMap;
import java.util.List;

import io.github.andyljones.commutes_and_rents.OutEdge;
import io.github.andyljones.commutes_and_rents.EdgeHashMapFactory;

import org.junit.*;

import uk.org.transxchange.TransXChange;

public class TravelTimeHashMapFactoryTest {

    @Test
    public void TravelTimeHashMap_OnTimetableWithFiveStops_ShouldHaveFiveEntries()
    {
        // Setup
        TransXChange root = TestTools.getTransXChangeRoot(this, "/linear-timetable.xml");
        EdgeHashMapFactory factory = new EdgeHashMapFactory(root);
        
        // Execution
        HashMap<String, List<OutEdge>> result = factory.getTraversalTimes();
        
        // Verification
        int expected = 5;
        int actual = result.size();
        Assert.assertEquals(expected, actual);
    }
    
    @Test
    public void TravelTimeHashMap_OnLinearRoute_EachKeyShouldHaveAListWithOneOrTwoValues()
    {
        // Setup
        TransXChange root = TestTools.getTransXChangeRoot(this, "/linear-timetable.xml");
        EdgeHashMapFactory factory = new EdgeHashMapFactory(root);
        
        // Execution
        HashMap<String, List<OutEdge>> result = factory.getTraversalTimes();
        
        // Verification
        int expectedMinimum = 1;
        int expectedMaximum = 2;
        
        Assert.assertTrue(result.values().stream().allMatch(list -> list.size() >= expectedMinimum));
        Assert.assertTrue(result.values().stream().allMatch(list -> list.size() <= expectedMaximum));
    }
}
