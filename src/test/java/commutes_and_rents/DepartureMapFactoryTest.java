package commutes_and_rents;

import java.util.List;
import java.util.Map;

import io.github.andyljones.commutes_and_rents.OutEdge;
import io.github.andyljones.commutes_and_rents.DepartureMapFactory;

import org.junit.*;

import uk.org.transxchange.TransXChange;

public class DepartureMapFactoryTest {

    @Test
    public void travelTimeMap_OnTimetableWithFiveStops_ShouldHaveFiveEntries()
    {
        // Setup
        TransXChange root = TestTools.getTransXChangeRoot(this, "/linear-timetable.xml");
        DepartureMapFactory factory = new DepartureMapFactory(root);
        
        // Execution
        Map<String, List<OutEdge>> result = factory.getTraversalTimes();
        
        // Verification
        int expected = 5;
        int actual = result.size();
        Assert.assertEquals(expected, actual);
    }
    
    @Test
    public void travelTimeMap_OnLinearRoute_EachKeyShouldHaveAListWithOneOrTwoValues()
    {
        // Setup
        TransXChange root = TestTools.getTransXChangeRoot(this, "/linear-timetable.xml");
        DepartureMapFactory factory = new DepartureMapFactory(root);
        
        // Execution
        Map<String, List<OutEdge>> result = factory.getTraversalTimes();
        
        // Verification
        int expectedMinimum = 1;
        int expectedMaximum = 2;
        
        Assert.assertTrue(result.values().stream().allMatch(list -> list.size() >= expectedMinimum));
        Assert.assertTrue(result.values().stream().allMatch(list -> list.size() <= expectedMaximum));
    }
}
