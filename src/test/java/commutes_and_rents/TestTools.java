package commutes_and_rents;

import java.io.File;
import java.net.URL;

public class TestTools {

    /**
     * Get a file using a relative path.
     * @param origin Object that's requesting the resource
     * @param resourcePath Relative path
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
}
