package graph.topologicalSort;

import graph.bfs.GraphNode;
import java.util.ArrayList;
import java.util.Stack;

public class TopologicalSort {
    ArrayList<GraphNode> nodeList = new ArrayList<>();

    //Constructor
    public TopologicalSort(ArrayList<GraphNode> nodeList) {
        this.nodeList = nodeList;
    }

    void topologicalSort() {
        Stack<GraphNode> stack = new Stack<>();
        for (GraphNode node : nodeList) {
            if (!node.isVisited()) {
                topologicalSortVisit(node, stack);
            }
        }

        while (!stack.isEmpty()) {
            System.out.println(stack.pop().getName() + " ");
        }
    }

    private void topologicalSortVisit(GraphNode node, Stack<GraphNode> stack) {
        for (GraphNode neighbor : node.getNeighbors()) {
            if (!neighbor.isVisited()) {
                topologicalSortVisit(neighbor, stack);
            }
        }
        node.setVisited(true);
        stack.push(node);
    }

    public void addDirectedEdge(int i, int j) {
        GraphNode first = nodeList.get(i - 1);
        GraphNode second = nodeList.get(j - 1);
        first.getNeighbors().add(second);
    }

    public static void main(String[] args) {
        ArrayList<GraphNode> nodeList = new ArrayList<>();

        //create 10 nodes: v1-v10
        for (int i = 1; i < 11; i++) {
            nodeList.add(new GraphNode("V" + i));
        }

        TopologicalSort graph = new TopologicalSort(nodeList);

        //add edges following graph in graph.docx
        graph.addDirectedEdge(1, 2);
        graph.addDirectedEdge(1, 4);
        graph.addDirectedEdge(2, 3);
        graph.addDirectedEdge(2, 5);
        graph.addDirectedEdge(3, 6);
        graph.addDirectedEdge(3, 10);
        graph.addDirectedEdge(4, 7);
        graph.addDirectedEdge(5, 8);
        graph.addDirectedEdge(6, 9);
        graph.addDirectedEdge(7, 8);
        graph.addDirectedEdge(8, 9);
        graph.addDirectedEdge(9, 10);

        //dfs from v1
        System.out.println("Printing DFS from source: V1");
        graph.topologicalSort();
    }
}