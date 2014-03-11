package commutes_and_rents;

import java.util.List;

/**
 * Structure for holding a list of the time taken to traverse a transit link.
 */
public class LinkTraversalTimes {
    
    /** 
     * The origin of the link as a NaPTAN StopPointRef
     */
    public String Origin;
    
    /** 
     * The destination of the link as a NaPTAN StopPointRef
     */
    public String Destination;
    
    /**
     * The times taken to traverse the link, described in standard W3C duration format.
     */
    public List<String> TraversalTimes; 
}
