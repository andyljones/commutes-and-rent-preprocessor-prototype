package transit_graph;

import io.github.andyljones.transit_graph.JourneyPatternMapFactory;

import java.util.Map;

import org.junit.Assert;
import org.junit.Test;

import uk.org.transxchange.JourneyPatternStructure;
import uk.org.transxchange.TransXChange;

public class JourneyPatternMapFactoryTest 
{
    @Test
    public void build_GivenAListOfTwoServiceStructures_ShouldReturnAHashMapWithTwoEntries()
    {
        // Setup
        TransXChange root = TestTools.getTransXChangeRoot(this, "/linear-timetable.xml");
        
        // Execution 
        Map<String, JourneyPatternStructure> result = JourneyPatternMapFactory.build(root);
        
        // Verification
        Assert.assertEquals(2, result.size());
    }
    
    @Test
    public void build_GivenAListOfTwoServiceStructures_ShouldReturnAHashMapContainingTheCorrectIDs()
    {
        // Setup
        TransXChange root = TestTools.getTransXChangeRoot(this, "/linear-timetable.xml");
        
        // Execution 
        Map<String, JourneyPatternStructure> result = JourneyPatternMapFactory.build(root);
        
        // Verification
        Assert.assertTrue(result.keySet().contains("jp_1"));
        Assert.assertTrue(result.keySet().contains("jp_r1"));
    }
}
