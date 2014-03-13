package io.github.andyljones.commutes_and_rents;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/**
 * Factory for building the union of several graphs.
 * @author andy
 *
 */
public class GraphUnionFactory {
    
    /**
     * Builds the union of several graphs, each represented by a map from node IDs to nodes.
     * @param serviceGraphs A collection of graphs
     * @return The union of the input graphs.
     */
    public static Map<String, Node> build(Collection<Map<String, Node>> serviceGraphs)
    {
        Map<String, Node> multiServiceGraph = new HashMap<>();
        for (Map<String, Node> serviceGraph : serviceGraphs)
        {
            multiServiceGraph.putAll(serviceGraph);
        }
        
        return multiServiceGraph;
    }
}
