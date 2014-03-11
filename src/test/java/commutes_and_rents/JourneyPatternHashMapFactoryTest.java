package commutes_and_rents;

import io.github.andyljones.commutes_and_rents.JourneyPatternHashMapFactory;

import java.util.HashMap;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

import uk.org.transxchange.JourneyPatternStructure;
import uk.org.transxchange.ServiceStructure;
import uk.org.transxchange.TransXChange;

public class JourneyPatternHashMapFactoryTest 
{
    @Test
    public void build_GivenAListOfTwoServiceStructures_ShouldReturnAHashMapWithTwoEntries()
    {
        // Setup
        TransXChange root = TestTools.getTransXChangeRoot(this, "/linear-timetable.xml");
        List<ServiceStructure> services = root.getServices().getService();
        
        // Execution 
        HashMap<String, JourneyPatternStructure> result = JourneyPatternHashMapFactory.build(services);
        
        // Verification
        Assert.assertEquals(2, result.size());
    }
    
    @Test
    public void build_GivenAListOfTwoServiceStructures_ShouldReturnAHashMapContainingTheCorrectIDs()
    {
        // Setup
        TransXChange root = TestTools.getTransXChangeRoot(this, "/linear-timetable.xml");
        List<ServiceStructure> services = root.getServices().getService();
        
        // Execution 
        HashMap<String, JourneyPatternStructure> result = JourneyPatternHashMapFactory.build(services);
        
        // Verification
        Assert.assertTrue(result.keySet().contains("jp_1"));
        Assert.assertTrue(result.keySet().contains("jp_r1"));
    }
}
