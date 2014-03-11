package commutes_and_rents;

import io.github.andyljones.commutes_and_rents.HashMapTools;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

public class HashMapToolsTest {

    @Test
    public void Union_GivenHashmapsWithDisjointKeys_ShouldReturnTheirUnion()
    {
        // Setup
        HashMap<String, List<String>> a = new HashMap<String, List<String>>();
        List<String> valuesA = new ArrayList<String>();
        valuesA.add("valueA1");
        a.put("keyA", valuesA);

        HashMap<String, List<String>> b = new HashMap<String, List<String>>();
        List<String> valuesB = new ArrayList<String>();
        valuesB.add("valueB1");
        b.put("keyB", valuesB);
        
        // Execution
        HashMap<String, List<String>> result = HashMapTools.Union(a, b);

        // Validation
        Assert.assertTrue(result.containsKey("keyA"));
        Assert.assertTrue(result.get("keyA").equals(valuesA));
        
        Assert.assertTrue(result.containsKey("keyB"));
        Assert.assertTrue(result.get("keyB").equals(valuesB));
    }
    
    @Test
    public void Union_GivenHashmapsWithIntersectingKeys_ShouldReturnTheirUnion()
    {
        // Setup
        HashMap<String, List<String>> a = new HashMap<String, List<String>>();
        List<String> valuesA = new ArrayList<String>();
        valuesA.add("valueA");
        a.put("keyC", valuesA);

        HashMap<String, List<String>> b = new HashMap<String, List<String>>();
        List<String> valuesB = new ArrayList<String>();
        valuesB.add("valueB");
        b.put("keyC", valuesB);
        
        // Execution
        HashMap<String, List<String>> result = HashMapTools.Union(a, b);

        // Validation
        Assert.assertTrue(result.containsKey("keyC"));
        Assert.assertTrue(result.get("keyC").contains("valueA"));
        Assert.assertTrue(result.get("keyC").contains("valueB"));
    }
}
