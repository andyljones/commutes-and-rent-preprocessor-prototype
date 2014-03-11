package commutes_and_rents;

import java.util.HashMap;
import java.util.List;

import javax.xml.datatype.Duration;

import io.github.andyljones.commutes_and_rents.TravelTimeHashMap;
import io.github.andyljones.commutes_and_rents.TravelTimeHashMapFactory;

import org.junit.*;

import uk.org.transxchange.TransXChange;

public class TravelTimeHashMapFactoryTest {

    @Test
    public void TravelTimeHashMap_OnTimetableWithFiveStops_ShouldHaveFiveEntries()
    {
        // Setup
        TransXChange root = TestTools.getTransXChangeRoot(this, "/linear-timetable.xml");
        TravelTimeHashMapFactory factory = new TravelTimeHashMapFactory(root);
        
        // Execution
        TravelTimeHashMap result = factory.getTraversalTimes();
        
        // Verification
        int expected = 5;
        int actual = result.size();
        Assert.assertEquals(expected, actual);
    }
    
    @Test
    public void TravelTimeHashMap_OnLinearRoute_EachKeyShouldHaveAHashMapWithOneOrTwoValues()
    {
        // Setup
        TransXChange root = TestTools.getTransXChangeRoot(this, "/linear-timetable.xml");
        TravelTimeHashMapFactory factory = new TravelTimeHashMapFactory(root);
        
        // Execution
        TravelTimeHashMap result = factory.getTraversalTimes();
        
        // Verification
        for (HashMap<String, List<Duration>> hashMap : result.values())
        {
            Assert.assertTrue(1 <= hashMap.size() && hashMap.size() <= 2);
        }
    }
}
