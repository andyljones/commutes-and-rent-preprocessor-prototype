package commutes_and_rents;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import io.github.andyljones.commutes_and_rents.EdgeMapFactory;
import io.github.andyljones.commutes_and_rents.Node;
import io.github.andyljones.commutes_and_rents.OutEdge;

import org.junit.Assert;
import org.junit.Test;

public class EdgeMapFactoryTest {

    @Test
    public void build_GivenTwoEdgesToTheSameNode_ShouldReturnAMapWithOnlyOneEdge()
    {
        // Setup
        OutEdge edgeA = new OutEdge(new Node("nodeA"), 1);
        OutEdge edgeB = new OutEdge(new Node("nodeA"), 2);
        
        Map<String, List<OutEdge>> data = new HashMap<>(); 
        data.put("keyA", Arrays.asList(new OutEdge[] {edgeA, edgeB}));
        
        // Execution
        Map<String, List<OutEdge>> result = EdgeMapFactory.build(data);
        
        // Verification
        int expected = 1;
        int actual = result.values().stream().findFirst().get().size();
        
        Assert.assertEquals(expected, actual);
    }
    
    @Test
    public void build_GivenTwoEdgesToTheSameNode_ShouldReturnAMapWithTheLongerEdge()
    {
        // Setup
        OutEdge edgeA = new OutEdge(new Node("nodeA"), 1);
        OutEdge edgeB = new OutEdge(new Node("nodeA"), 2);
        
        Map<String, List<OutEdge>> data = new HashMap<>(); 
        data.put("keyA", Arrays.asList(new OutEdge[] {edgeA, edgeB}));
        
        // Execution
        Map<String, List<OutEdge>> result = EdgeMapFactory.build(data);
        
        // Verification
        long expected = 2;
        long actual = result.values().stream().findFirst().get().get(0).getDuration();
        
        Assert.assertEquals(expected, actual);
    }
    
    @Test
    public void build_GivenTwoEdgesToDifferentNodes_ShouldReturnAMapWithTwoEdges()
    {
        // Setup
        OutEdge edgeA = new OutEdge(new Node("nodeA"), 1);
        OutEdge edgeB = new OutEdge(new Node("nodeB"), 2);
        
        Map<String, List<OutEdge>> data = new HashMap<>(); 
        data.put("keyA", Arrays.asList(new OutEdge[] {edgeA, edgeB}));
        
        // Execution
        Map<String, List<OutEdge>> result = EdgeMapFactory.build(data);
        
        // Verification
        int expected = 2;
        int actual = result.values().stream().findFirst().get().size();
        
        Assert.assertEquals(expected, actual);
    }
}
