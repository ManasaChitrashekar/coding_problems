package graph;

import java.util.ArrayList;
import java.util.List;

/**
 * Graph nOde
 * @author mchitrashekar
 */
public class GraphDemo {
    static class Node {
        String name;
        List<Node> children = new ArrayList<>();

        public Node(String name) {
            this.name = name;
        }

        public List<String> depthFirstSearch(List<String> array) {
            for(Node child : children)
            {
                child.depthFirstSearch(array);
            }
            return array;
        }

        public Node addChild(String name) {
            Node child = new Node(name);
            children.add(child);
            return this;
        }
    }
}
