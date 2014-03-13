package commutes_and_rents;

import io.github.andyljones.commutes_and_rents.GraphUnionFactory;
import io.github.andyljones.commutes_and_rents.Node;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.junit.Assert;
import org.junit.Test;

public class GraphUnionFactoryTest {

    @Test
    public void build_GivenTwoKeyDisjointMapsOfSizeOne_ShouldReturnAMapOfSizeTwo()
    {
        // Setup 
        Map<String, Node> data1 = new HashMap<>();
        data1.put("key1", new Node("node1"));
        Map<String, Node> data2 = new HashMap<>();
        data2.put("key2", new Node("node2"));
        
        Collection<Map<String, Node>> data = new ArrayList<Map<String, Node>>() {{ add(data1); add(data2); }};
        
        // Execution
        Map<String, Node> result = GraphUnionFactory.build(data);
        
        // Result
        int expected = 2;
        int actual = result.size();
        
        Assert.assertEquals(expected, actual);
    }
}
