package commutes_and_rents;

import io.github.andyljones.commutes_and_rents.TimetableUnmarshaller;

import java.io.File;
import java.net.URL;

import uk.org.transxchange.TransXChange;

public class TestTools {

    /**
     * Get a file using a relative path.
     * @param origin Object that's requesting the resource
     * @param resourcePath Relative path to resource
     * @return File at the path.
     */
    public static File getTestFile(Object origin, String resourcePath)
    {
        URL url = origin.getClass().getResource(resourcePath);
        File file = new File(url.getFile());
     
        if (!file.exists())
        {
            System.err.println("Test file " + resourcePath + "does not exist!");
        }
        
        return file;
    }
    
    //TODO: This violates test isolation.
    public static TransXChange getTransXChangeRoot(Object origin, String xmlFilePath)
    {
        File file = getTestFile(origin, xmlFilePath);
        
        TransXChange root = TimetableUnmarshaller.unmarshall(file);
        
        return root;
    }
}
