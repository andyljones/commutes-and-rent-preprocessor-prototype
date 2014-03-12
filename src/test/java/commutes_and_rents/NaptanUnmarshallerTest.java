package commutes_and_rents;

import io.github.andyljones.commutes_and_rents.NaptanUnmarshaller;

import java.io.File;

import org.junit.Assert;
import org.junit.Test;

import uk.org.naptan.NaPTAN;

public class NaptanUnmarshallerTest 
{
    @Test
    public void Unmarshall_OnAValidTestFile_ShouldReturnARootObjectWithTheCorrectAttributes() 
    {
        // Setup
        File testFile = TestTools.getTestFile(this, "/underground-naptan.xml");
        
        // Execution
        NaPTAN result = NaptanUnmarshaller.unmarshall(testFile);
        
        // Verification        
        String expected = "NaPTAN940.xml";
        String actual = result.getFileName();
        Assert.assertEquals(expected, actual);
    }
}
