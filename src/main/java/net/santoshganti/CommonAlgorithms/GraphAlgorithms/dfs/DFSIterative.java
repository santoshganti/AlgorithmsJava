package net.santoshganti.CommonAlgorithms.GraphAlgorithms.dfs;

import net.santoshganti.Base.GraphNode.GraphNode;

import java.util.ArrayList;
import java.util.Stack;

public class DFSIterative {
    ArrayList<GraphNode> nodeList = new ArrayList<>();

    public DFSIterative(ArrayList<GraphNode> nodeList) {
        this.nodeList = nodeList;
    }

    public static void main(String[] args) {

        ArrayList<GraphNode> nodeList = new ArrayList<>();

        //create 10 nodes: v1-v10
        for (int i = 1; i < 11; i++) {
            nodeList.add(new GraphNode("V" + i));
        }

        //Constructor
        DFSIterative graph = new DFSIterative(nodeList);

        //add edges following graph in graph.docx
        graph.addUndirectedEdge(1, 2);
        graph.addUndirectedEdge(1, 4);
        graph.addUndirectedEdge(2, 3);
        graph.addUndirectedEdge(2, 5);
        graph.addUndirectedEdge(3, 6);
        graph.addUndirectedEdge(3, 10);
        graph.addUndirectedEdge(4, 7);
        graph.addUndirectedEdge(5, 8);
        graph.addUndirectedEdge(6, 9);
        graph.addUndirectedEdge(7, 8);
        graph.addUndirectedEdge(8, 9);
        graph.addUndirectedEdge(9, 10);

        //dfs from v1
        System.out.println("Printing DFS from source: V1");
        graph.dfs();
    }

    void dfs() {
        for (GraphNode node : nodeList) {
            if (!node.isVisited()) {
                dfsVisit(node);
            }
        }
    }

    private void dfsVisit(GraphNode node) {
        //make an empty stack
        Stack<GraphNode> stack = new Stack<>();
        //add the source to the stack
        stack.add(node);

        //while the stack is not empty pop the first element
        while (!stack.isEmpty()) {
            GraphNode currentNode = stack.pop();
            currentNode.setVisited(true);

            System.out.println(currentNode.getName() + " ");

            for (GraphNode neighbor : currentNode.getNeighbors()) {
                if (!neighbor.isVisited()) {
                    stack.add(neighbor);
                    neighbor.setVisited(true);
                }
            }
        }
    }

    public void addUndirectedEdge(int i, int j) {
        GraphNode first = nodeList.get(i - 1);
        GraphNode second = nodeList.get(j - 1);
        first.getNeighbors().add(second);
        second.getNeighbors().add(first);
    }
}
