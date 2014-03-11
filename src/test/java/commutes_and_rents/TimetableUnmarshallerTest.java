package commutes_and_rents;

import java.io.File;

import org.junit.*;
import org.junit.runner.*;
import org.junit.runners.*;

import uk.org.transxchange.TransXChange;

@RunWith(JUnit4.class)
public class TimetableUnmarshallerTest 
{
    @Test
    public void testUnmarshall() 
    {
        // Setup
        File testFile = new File("src/test/resources/linear-timetable.xml");
        
        // Execution
        TransXChange result = TimetableUnmarshaller.unmarshall(testFile);
        
        // Verification        
        String expected = "linear.xml";
        String actual = result.getFileName();
        Assert.assertEquals(expected, actual);
    }
}
