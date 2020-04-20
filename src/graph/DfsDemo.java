package graph;

import java.util.ArrayList;
import java.util.List;

/**
 * @author mchitrashekar
 */
public class DfsDemo {
    public static void  main(String args[]){
        GraphDemo.Node node = new GraphDemo.Node("A");
        List<String> dfsTraversalList = node.depthFirstSearch(new ArrayList<>());
        dfsTraversalList.forEach(s -> System.out.println(s));

    }
}
