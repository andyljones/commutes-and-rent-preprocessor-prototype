package io.github.andyljones.commutes_and_rents;

/**
 * Structure representing a transit link.
 */
public class TransitLink {
    
    public TransitLink(String origin, String destination)
    {
        this.origin = origin;
        this.destination = destination;
    }
    
    /** 
     * The origin of the link as a NaPTAN StopPointRef
     */
    public String getOrigin() { return origin; }
    private final String origin;
    
    /** 
     * The destination of the link as a NaPTAN StopPointRef
     */
    public String getDestination() { return destination; }
    private final String destination;
    
    @Override
    public boolean equals(Object that)
    {
        if (this == that) { return true; }
        
        if (!(that instanceof TransitLink)) { return false; }
        
        TransitLink thatLink = (TransitLink)that;
        
        return this.origin.equals(thatLink.origin) && this.destination.equals(thatLink.destination);
    }
    
    @Override
    public int hashCode()
    {
        return origin.hashCode() ^ destination.hashCode();
    }
}
