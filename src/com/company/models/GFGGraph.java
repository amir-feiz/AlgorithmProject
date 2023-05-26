package com.company.models;

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;

public class GFGGraph {
    private final int V;   // No. of vertices
    private final Node[] allNodes;

    public GFGGraph(int v) {
        this.V = v;
        allNodes = new Node[v];
        for (int i=0; i<v; ++i)
            allNodes[i] = new Node();
    }

    //Function to add an edge into the graph
    public void addEdge(int v, int w) {
        allNodes[v].getAdj().add(w);
        allNodes[w].getAdj().add(v); //Graph is undirected
    }


    public void greedyColoring() {
        int[] result = new int[V];

        Arrays.fill(result, -1);

        result[0] = 0;

        boolean[] available = new boolean[V];

        Arrays.fill(available, true);

        for (int u = 1; u < V; u++) {
            for (int i : allNodes[u].getAdj()) {
                if (result[i] != -1)
                    available[result[i]] = false;
            }

            int cr;
            for (cr = 0; cr < V; cr++) {
                if (available[cr])
                    break;
            }

            result[u] = cr;

            Arrays.fill(available, true);
        }

        // print the result
        for (int u = 0; u < V; u++)
            System.out.println("Vertex " + u + " --->  Color "
                    + result[u]);
    }

    public void show(){
        for (int i=0;i<this.allNodes.length;i++)
            System.out.println("Adjacency of node " + i + " is: " + allNodes[i].getAdj());
    }


}