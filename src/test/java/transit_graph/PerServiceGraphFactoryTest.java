package transit_graph;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Assert;
import org.junit.Test;

import io.github.andyljones.transit_graph.Node;
import io.github.andyljones.transit_graph.OutEdge;
import io.github.andyljones.transit_graph.PerServiceGraphFactory;

public class PerServiceGraphFactoryTest {

    @Test
    public void getNodeMap_OnAMapOfASingleKeyPointingToANodeWithTheKeyAsItsReference_ShouldReturnACircleGraph()
    {
        // Setup
        Node nodeA = new Node("nodeA");
        OutEdge edgeA = new OutEdge(nodeA, 0); 
        Map<String, List<OutEdge>> data = new HashMap<>();
        
        data.put("nodeA", Arrays.asList(new OutEdge[] { edgeA }));
        
        // Execution
        Map<String, Node> result = new PerServiceGraphFactory(data).build();
        
        // Verification
        Node expected = result.values().stream().findFirst().get();
        Node actual = expected.getNeighbours().get(0).getDestination();
        
        Assert.assertEquals(expected, actual);
    }
}
