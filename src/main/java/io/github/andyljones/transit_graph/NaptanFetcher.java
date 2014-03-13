package io.github.andyljones.transit_graph;

import java.io.File;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

import uk.org.naptan.NaPTAN;

/**
 * Fetches the root element of the NaPTAN file.
 * @author andy
 *
 */
public class NaptanFetcher {
    
    private static final List<String> naptanPaths = new ArrayList<String>() {{ add("/NaPTAN940.xml"); }};

    /**
     * Fetches the root element of the NaPTAN file.
     * @return The root element.
     */
    public static List<NaPTAN> fetch()
    {
        //****NOT UNDER TEST****//
     
        List<NaPTAN> result = new ArrayList<>();
        
        for (String naptanPath : naptanPaths)
        {
            File naptanFile = getNaptanFile(naptanPath);
            NaPTAN root = NaptanUnmarshaller.unmarshall(naptanFile);
            
            result.add(root);
        }
        
        return result;
    }
    
    private static File getNaptanFile(String fileName)
    {
        File naptanFile = null;
        try
        {
            URI naptanURI = TimetableFetcher.class.getResource(fileName).toURI();
            naptanFile = Paths.get(naptanURI).toFile();
        }
        catch (URISyntaxException urie)
        {
            System.err.println("URI to timetables directory was malformed!");
            urie.printStackTrace();
        }
        
        return naptanFile;
    }
}
