package io.github.andyljones.commutes_and_rents;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class PerServiceGraphFactory {

    /**
     * @return The graph constructed by the factory, indexed by stop reference.
     */
    public Map<String, Node> getNodeMap() { return nodeMap; }    
    private final Map<String, Node> nodeMap;
    
    /**
     * Takes a graph, represented as a mapping from StopPointRefs to outbound edges, and converts it to a grap
     * which can be retrieved with getNodeMap()
     * @param edgeMap The source graph, usually a tree.
     */
    public PerServiceGraphFactory(Map<String, List<OutEdge>> edgeMap)
    {
        nodeMap = createNodes(edgeMap);
        
        createEdges(edgeMap);
    }

    private static Map<String, Node> createNodes(Map<String, List<OutEdge>> edgeMap) 
    {
        return edgeMap.keySet().stream().collect(Collectors.toMap(k -> k, k -> new Node(k)));
    }
    
    private void createEdges(Map<String, List<OutEdge>> edgeMap)
    {
        for (String stopPointRef : edgeMap.keySet())
        {
            createEdgesAroundPoint(edgeMap, stopPointRef);
        }
    }
    
    private void createEdgesAroundPoint(Map<String, List<OutEdge>> edgeMap, String stopPointRef)
    {
        Node originNode = nodeMap.get(stopPointRef);
        List<OutEdge> oldEdges = edgeMap.get(stopPointRef);
        
        for (OutEdge oldEdge : oldEdges)
        {
            Node destinationNode = nodeMap.get(oldEdge.getDestination().getStopCodeRef());
            OutEdge newEdge = new OutEdge(destinationNode, oldEdge.getDuration());
            
            originNode.getNeighbours().add(newEdge);                
        }
    }
}
