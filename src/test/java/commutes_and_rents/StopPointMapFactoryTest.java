package commutes_and_rents;

import java.io.File;
import java.util.Map;

import io.github.andyljones.commutes_and_rents.NaptanUnmarshaller;
import io.github.andyljones.commutes_and_rents.StopPointMapFactory;

import org.junit.Assert;
import org.junit.Test;

import uk.org.naptan.NaPTAN;
import uk.org.naptan.StopPointStructure;

public class StopPointMapFactoryTest {

    @Test
    public void build_GivenSampleData_ShouldReturnAHashMapWith2247Entries()
    {
        // Setup
        File file = TestTools.getTestFile(this, "/underground-naptan.xml");
        NaPTAN testData = NaptanUnmarshaller.unmarshall(file);
        
        // Execution
        Map<String, StopPointStructure> result = StopPointMapFactory.build(testData);
        
        // Verification
        int expected = 2247;
        int actual = result.size();
        
        Assert.assertEquals(expected, actual);
    }
}
