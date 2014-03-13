package io.github.andyljones.transit_graph;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * Adds new cliques to a graph, using the specified edge weight for the new edges.
 * @author andy
 *
 */
public class TransitGraphUpdater {

    private final long newEdgeWeight;
    
    public TransitGraphUpdater(long newEdgeWeight)
    {
        this.newEdgeWeight = newEdgeWeight;
    }
    
    /**
     * Builds new cliques in a graph.
     * @param graph Graph that will be altered.
     * @param cliquesToAdd Cliques to add.
     */
    public void update(Map<String, Node> graph, Collection<List<String>> cliquesToAdd)
    {
        for (Collection<String> clique : cliquesToAdd)
        {
            addClique(graph, clique);
        }
    }
    
    private void addClique(Map<String, Node> graph, Collection<String> cliqueToAdd)
    {
        for (String nodeRef : cliqueToAdd)
        {
            Collection<String> otherNodeRefs = cliqueToAdd.stream().filter(ref -> ref != nodeRef).collect(Collectors.toList());
            
            if (!otherNodeRefs.isEmpty())
            {
                addEdges(graph, nodeRef, otherNodeRefs);
            }
        }
    }

    private void addEdges(Map<String, Node> graph, String originRef, Collection<String> destinationNodeRefs)
    {
        for (String otherNodeRef : destinationNodeRefs)
        {
            addEdge(graph, originRef, otherNodeRef);
        }
    }

    private void addEdge(Map<String, Node> graph, String originNodeRef, String destinationNodeRef) 
    {
        Node originNode = graph.get(originNodeRef);
        Node destinationNode = graph.get(destinationNodeRef);
        
        OutEdge newEdge = new OutEdge(destinationNode, newEdgeWeight);
        
        originNode.getNeighbours().add(newEdge);
    }
    
}
