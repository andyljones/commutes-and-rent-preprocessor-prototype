package commutes_and_rents;

import io.github.andyljones.commutes_and_rents.TimetableUnmarshaller;

import java.io.File;

import org.junit.*;

import uk.org.transxchange.TransXChange;

public class TimetableUnmarshallerTest 
{
    @Test
    public void Unmarshall_OnAValidTestFile_ShouldReturnARootObjectWithTheCorrectAttributes() 
    {
        // Setup
        File testFile = TestTools.getTestFile(this, "/linear-timetable.xml");
        
        // Execution
        TransXChange result = TimetableUnmarshaller.unmarshall(testFile);
        
        // Verification        
        String expected = "linear.xml";
        String actual = result.getFileName();
        Assert.assertEquals(expected, actual);
    }
}
