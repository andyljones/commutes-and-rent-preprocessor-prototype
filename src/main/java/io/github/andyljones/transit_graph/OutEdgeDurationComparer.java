package io.github.andyljones.transit_graph;

import java.util.Comparator;

public class OutEdgeDurationComparer implements Comparator<OutEdge> {

    @Override
    public int compare(OutEdge a, OutEdge b) {
        
        if (a.getDuration() > b.getDuration()) 
        { 
            return 1; 
        }
        else if (a.getDuration() == b.getDuration()) 
        { 
            return 0; 
        }
        else 
        { 
            return -1; 
        }
    }

}
