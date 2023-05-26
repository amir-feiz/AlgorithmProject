package com.company.models;

import com.company.View.PrintColor;

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;

public class GFGGraph {
    private final int V;   // No. of vertices
    private final Node[] allNodes;

    //Constructor
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

    // Assign colors (starting from 0) to all vertices and
    // prints the assignment of colors
    public void greedyColoring() {
        int[] result = new int[V];

        // Initialize all vertices as unassigned
        Arrays.fill(result, -1);

        // Assign the first color to first vertex
        result[0] = 0;

        // A temporary array to store the available colors. False
        // value of available[cr] would mean that the color cr is
        // assigned to one of its adjacent vertices
        boolean[] available = new boolean[V];

        // Initially, all colors are available
        Arrays.fill(available, true);

        // Assign colors to remaining V-1 vertices
        for (int u = 1; u < V; u++) {
            // Process all adjacent vertices and flag their colors
            // as unavailable
            for (int i : allNodes[u].getAdj()) {
                if (result[i] != -1)
                    available[result[i]] = false;
            }

            // Find the first available color
            int cr;
            for (cr = 0; cr < V; cr++) {
                if (available[cr])
                    break;
            }

            result[u] = cr; // Assign the found color

            // Reset the values back to true for the next iteration
            Arrays.fill(available, true);
        }

        // print the result
        for (int u = 0; u < V; u++)
            System.out.println("Vertex " + u + " --->  Color "
                    + result[u]);
    }

    public void show(){
        for (int i=0;i<this.allNodes.length;i++){
            PrintColor.printBlu2("Adjacency of node ");
            PrintColor.printYel2(i);
            PrintColor.printBlu2(" is: ");
            PrintColor.printNorm2(allNodes[i].getAdj());
            PrintColor.printNorm("");
//            + i + " is: " + allNodes[i].getAdj());
        }
    }


}