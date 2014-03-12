package io.github.andyljones.commutes_and_rents;

import javax.xml.datatype.Duration;

public class OutEdge {
    
    public Node getStopCodeRef() { return destination; }
    final private Node destination;
    
    public Duration getDuration() { return travelTime; }
    final private Duration travelTime;
    
    public OutEdge(Node destination, Duration travelTime)
    {
        this.destination = destination;
        this.travelTime = travelTime;
    }

}
