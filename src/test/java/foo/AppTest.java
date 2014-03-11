package foo;

import org.junit.*;
import org.junit.runner.*;
import org.junit.runners.*;

@RunWith(JUnit4.class)
public class AppTest 
{
    @Test
    public void testParse() 
            throws Exception
    {
        App.parse();
    }
}
