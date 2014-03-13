package io.github.andyljones.transit_graph;

import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import uk.org.transxchange.TransXChange;

/**
 * Fetches the root elements of each timetable in the timetable directory.
 * @author andy
 *
 */
public class TimetableFetcher {
    
    private static final String timetableDirectoryPath = "/timetables";

    /**
     * Fetches the root elements of each timetable in the timetable directory.
     * @return A list of root elements of timetables.
     */
    public static List<TransXChange> fetch()
    {
        //****NOT UNDER TEST****//
     
        List<Path> timetablePaths = getListOfTimetables();
        
        List<TransXChange> result = new ArrayList<>();
        for (Path path : timetablePaths)
        {
            File file = path.toFile();
            TransXChange root = TimetableUnmarshaller.unmarshall(file);
            result.add(root);
        }
        
        return result;
    }
    
    private static List<Path> getListOfTimetables()
    {
        List<Path> timetableFiles = null;
        try
        {
            URI timetablesDirectory = TimetableFetcher.class.getResource(timetableDirectoryPath).toURI();
            Stream<Path> timetableFilesStream = Files.list(Paths.get(timetablesDirectory));
            timetableFiles = timetableFilesStream.collect(Collectors.toList());
        }
        catch (URISyntaxException urie)
        {
            System.err.println("URI to timetables directory was malformed!");
            urie.printStackTrace();
        }
        catch (IOException ioe)
        {
            System.err.println("Failed to open the timetables directory!");
            ioe.printStackTrace();
        }
        
        return timetableFiles;
    }
}
