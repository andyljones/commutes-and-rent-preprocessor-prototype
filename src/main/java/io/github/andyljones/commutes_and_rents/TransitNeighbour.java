package io.github.andyljones.commutes_and_rents;

import javax.xml.datatype.Duration;

public class TransitNeighbour {
    
    final public String stopCodeRef;
    final public Duration travelTime;
    
    public TransitNeighbour(String stopCodeRef, Duration travelTime)
    {
        this.stopCodeRef = stopCodeRef;
        this.travelTime = travelTime;
    }
}
