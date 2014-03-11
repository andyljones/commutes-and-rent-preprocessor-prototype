package commutes_and_rents;

import io.github.andyljones.commutes_and_rents.JourneyPatternHashMapFactory;

import java.util.HashMap;

import org.junit.Assert;
import org.junit.Test;

import uk.org.transxchange.JourneyPatternStructure;
import uk.org.transxchange.TransXChange;

public class JourneyPatternHashMapFactoryTest 
{
    @Test
    public void build_GivenAListOfTwoServiceStructures_ShouldReturnAHashMapWithTwoEntries()
    {
        // Setup
        TransXChange root = TestTools.getTransXChangeRoot(this, "/linear-timetable.xml");
        
        // Execution 
        HashMap<String, JourneyPatternStructure> result = JourneyPatternHashMapFactory.build(root);
        
        // Verification
        Assert.assertEquals(2, result.size());
    }
    
    @Test
    public void build_GivenAListOfTwoServiceStructures_ShouldReturnAHashMapContainingTheCorrectIDs()
    {
        // Setup
        TransXChange root = TestTools.getTransXChangeRoot(this, "/linear-timetable.xml");
        
        // Execution 
        HashMap<String, JourneyPatternStructure> result = JourneyPatternHashMapFactory.build(root);
        
        // Verification
        Assert.assertTrue(result.keySet().contains("jp_1"));
        Assert.assertTrue(result.keySet().contains("jp_r1"));
    }
}
