package transit_graph;

import java.util.Map;

import io.github.andyljones.transit_graph.NaptanFetcher;
import io.github.andyljones.transit_graph.Node;
import io.github.andyljones.transit_graph.TimetableFetcher;
import io.github.andyljones.transit_graph.TransitGraphFactory;

import org.junit.Test;

public class ScratchTest {

    @Test
    public void test()
    {
        Map<String, Node> graph = TransitGraphFactory.build();
        
        System.out.println(graph.size());
    }
}
