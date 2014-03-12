package io.github.andyljones.commutes_and_rents;

public class OutEdge {
    
    public Node getDestination() { return destination; }
    final private Node destination;
    
    public long getDuration() { return travelTime; }
    final private long travelTime;
    
    public OutEdge(Node destination, long travelTime)
    {
        this.destination = destination;
        this.travelTime = travelTime;
    }

}
