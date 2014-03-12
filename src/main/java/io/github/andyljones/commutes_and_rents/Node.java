package io.github.andyljones.commutes_and_rents;

import java.util.ArrayList;
import java.util.List;

public class Node {

    public String getStopCodeRef() { return stopCodeRef; }
    final private String stopCodeRef;
    
    public List<OutEdge> getNeighbours() { return neighbours; }
    final private List<OutEdge> neighbours = new ArrayList<>();
    
    public Node(String stopCodeRef)
    {
        this.stopCodeRef = stopCodeRef;
    }
}
