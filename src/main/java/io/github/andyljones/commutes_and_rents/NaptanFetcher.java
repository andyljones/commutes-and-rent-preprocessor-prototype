package io.github.andyljones.commutes_and_rents;

import java.io.File;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.file.Paths;

import uk.org.naptan.NaPTAN;

/**
 * Fetches the root element of the NaPTAN file.
 * @author andy
 *
 */
public class NaptanFetcher {
    
    private static final String naptanPath = "/underground-naptan.xml";

    /**
     * Fetches the root element of the NaPTAN file.
     * @return The root element.
     */
    public static NaPTAN fetch()
    {
        //****NOT UNDER TEST****//
     
        File naptanFile = getNaptanFile();
        NaPTAN result = NaptanUnmarshaller.unmarshall(naptanFile);
        
        System.out.println(result.getFileName());
        
        return result;
    }
    
    private static File getNaptanFile()
    {
        File naptanFile = null;
        try
        {
            URI naptanURI = TimetableFetcher.class.getResource(naptanPath).toURI();
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
