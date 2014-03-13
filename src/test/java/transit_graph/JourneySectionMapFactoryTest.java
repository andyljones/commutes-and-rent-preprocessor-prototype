package transit_graph;

import io.github.andyljones.transit_graph.JourneySectionMapFactory;

import java.util.Map;

import org.junit.Assert;
import org.junit.Test;

import uk.org.transxchange.JourneyPatternSectionStructure;
import uk.org.transxchange.TransXChange;

public class JourneySectionMapFactoryTest {

    @Test
    public void build_GivenATimetableWithTwoJourneyPatterns_ShouldReturnAHashMapWithTwoEntries()
    {
        // Setup
        TransXChange root = TestTools.getTransXChangeRoot(this, "/linear-timetable.xml");
        
        // Execution 
        Map<String, JourneyPatternSectionStructure> result = JourneySectionMapFactory.build(root);
        
        // Verification
        Assert.assertEquals(2, result.size());
    }
    
    @Test
    public void build_GivenATimetableWithTwoJourneyPatterns_ShouldReturnAHashMapContainingTheCorrectIDs()
    {
        // Setup
        TransXChange root = TestTools.getTransXChangeRoot(this, "/linear-timetable.xml");
        
        // Execution 
        Map<String, JourneyPatternSectionStructure> result = JourneySectionMapFactory.build(root);
        
        // Verification
        Assert.assertTrue(result.keySet().contains("js_1"));
        Assert.assertTrue(result.keySet().contains("js_r1"));
    }
}
