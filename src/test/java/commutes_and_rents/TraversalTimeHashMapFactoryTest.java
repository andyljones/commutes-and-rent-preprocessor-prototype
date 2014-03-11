package commutes_and_rents;

import java.util.HashMap;
import java.util.List;

import javax.xml.datatype.Duration;

import io.github.andyljones.commutes_and_rents.TransitLink;
import io.github.andyljones.commutes_and_rents.TraversalTimeHashMapFactory;

import org.junit.*;

import uk.org.transxchange.TransXChange;

public class TraversalTimeHashMapFactoryTest {

    //TODO: Add more tests.
    @Test
    public void TraversalTimes_OnTimetableWithEightLinks_ShouldHaveEightEntries()
    {
        // Setup
        TransXChange root = TestTools.getTransXChangeRoot(this, "/linear-timetable.xml");
        TraversalTimeHashMapFactory factory = new TraversalTimeHashMapFactory(root);
        
        // Execution
        HashMap<TransitLink, List<Duration>> result = factory.getTraversalTimes();
        
        // Verification
        int expected = 8;
        int actual = result.size();
        Assert.assertEquals(expected, actual);
    }
}
