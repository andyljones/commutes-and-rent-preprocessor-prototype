package commutes_and_rents;

import io.github.andyljones.commutes_and_rents.Node;
import io.github.andyljones.commutes_and_rents.TransitGraphUpdater;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Assert;
import org.junit.Test;

public class TransitGraphUpdaterTest {

    @Test
    public void update_OnAPairOfVerticesAndAListContainingThem_ShouldConnectTheTwoVertices()
    {
        // Setup
        Node nodeA = new Node("nodeA");
        Node nodeB = new Node("nodeB");
        
        Map<String, Node> data1 = new HashMap<>();
        data1.put("nodeA", nodeA);
        data1.put("nodeB", nodeB);
        
        List<String> temp = new ArrayList<String>() {{ add("nodeA"); add("nodeB"); }}; 
        Collection<List<String>> data2 = new ArrayList<List<String>>() {{ add(temp); }};
        
        // Execution
        TransitGraphUpdater sut = new TransitGraphUpdater(0);
        sut.update(data1, data2);
        
        // Result        
        Assert.assertEquals(data1.get("nodeA").getNeighbours().get(0).getDestination(), nodeB);
        Assert.assertEquals(data1.get("nodeB").getNeighbours().get(0).getDestination(), nodeA);
    }
    
    @Test
    public void update_OnTwoVerticesAndAListContainingBoth_ShouldCreateEdgesWithTheRightEdgeLength()
    {
        // Setup
        Node nodeA = new Node("nodeA");
        Node nodeB = new Node("nodeB");
        
        Map<String, Node> data1 = new HashMap<>();
        data1.put("nodeA", nodeA);
        data1.put("nodeB", nodeB);
        
        List<String> temp = new ArrayList<String>() {{ add("nodeA"); add("nodeB"); }}; 
        Collection<List<String>> data2 = new ArrayList<List<String>>() {{ add(temp); }};
        
        int edgeLength = 7;
        
        // Execution
        TransitGraphUpdater sut = new TransitGraphUpdater(edgeLength);
        sut.update(data1, data2);
        
        // Result        
        Assert.assertEquals(data1.get("nodeA").getNeighbours().get(0).getDuration(), edgeLength);
        Assert.assertEquals(data1.get("nodeB").getNeighbours().get(0).getDuration(), edgeLength);
    }
}
