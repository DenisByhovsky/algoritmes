package com.byhovsky.algoritmes;

import java.util.LinkedList;

/**
 * Adjacency List (Graph)
 *
 * @author Denis Byhovsky
 */
public class Graph {
    int V;
    LinkedList<Integer> nodesArray[];

    Graph(int V) {
        this.V = V;
        nodesArray = new LinkedList[V];
        for (int i = 0; i < V; i++) {
            nodesArray[i] = new LinkedList();
        }
    }

    static void addEdge(Graph graph, int src, int dest) {
        graph.nodesArray[src].addFirst(dest);
        graph.nodesArray[dest].addFirst(src);
    }

    public void printGraph(Graph graph) {
        addEdge(graph, 0, 1);
        addEdge(graph, 0, 4);
        addEdge(graph, 1, 2);
        addEdge(graph, 1, 3);
        addEdge(graph, 1, 4);
        addEdge(graph, 2, 3);
        addEdge(graph, 3, 4);

        for (int v = 0; v < graph.V; v++) {
            System.out.print("head");
            for (Integer pCrawl : graph.nodesArray[v]) {
                System.out.print(" -> " + pCrawl);
            }
            System.out.println("\n");
        }
    }
}
