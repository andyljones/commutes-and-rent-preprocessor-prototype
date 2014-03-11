package commutes_and_rents;

import io.github.andyljones.commutes_and_rents.JourneySectionHashMapFactory;

import java.util.HashMap;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

import uk.org.transxchange.JourneyPatternSectionStructure;
import uk.org.transxchange.TransXChange;

public class JourneySectionHashMapFactoryTest {

    @Test
    public void build_GivenATimetableWithTwoJourneyPatterns_ShouldReturnAHashMapWithTwoEntries()
    {
        // Setup
        TransXChange root = TestTools.getTransXChangeRoot(this, "/linear-timetable.xml");
        List<JourneyPatternSectionStructure> sections = root.getJourneyPatternSections().getJourneyPatternSection();
        
        // Execution 
        HashMap<String, JourneyPatternSectionStructure> result = JourneySectionHashMapFactory.build(sections);
        
        // Verification
        Assert.assertEquals(2, result.size());
    }
    
    @Test
    public void build_GivenATimetableWithTwoJourneyPatterns_ShouldReturnAHashMapContainingTheCorrectIDs()
    {
        // Setup
        TransXChange root = TestTools.getTransXChangeRoot(this, "/linear-timetable.xml");
        List<JourneyPatternSectionStructure> sections = root.getJourneyPatternSections().getJourneyPatternSection();
        
        // Execution 
        HashMap<String, JourneyPatternSectionStructure> result = JourneySectionHashMapFactory.build(sections);
        
        // Verification
        Assert.assertTrue(result.keySet().contains("js_1"));
        Assert.assertTrue(result.keySet().contains("js_r1"));
    }
}
