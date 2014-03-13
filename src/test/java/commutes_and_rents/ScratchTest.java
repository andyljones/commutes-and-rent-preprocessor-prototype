package commutes_and_rents;

import java.util.Map;

import io.github.andyljones.commutes_and_rents.NaptanFetcher;
import io.github.andyljones.commutes_and_rents.Node;
import io.github.andyljones.commutes_and_rents.TimetableFetcher;
import io.github.andyljones.commutes_and_rents.TransitGraphFactory;

import org.junit.Test;

public class ScratchTest {

    @Test
    public void test()
    {
        Map<String, Node> graph = TransitGraphFactory.build();
        
        System.out.println(graph.size());
    }
}
