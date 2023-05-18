package com.company;
import com.company.File.JSonFileWriter;
import com.company.File.JsonFileReader;
import com.company.models.Carpet;
import com.company.models.GFGGraph;
import com.company.models.*;
import com.company.View.*;
import com.company.Dijkstra.*;

import javax.swing.text.View;
import java.util.Scanner;

import static com.company.Dijkstra.DijkstraGraphGenerator.applyDijkstra;
import static com.company.Dijkstra.DijkstraGraphGenerator.generateRandomGraph;
import static java.lang.System.exit;

public class Main {
    public static Scanner input =new Scanner(System.in);
    public static void main(String[] args) {
        //MainMenu();


        //Dijkstra
        /*int numVertices = 10; // تعداد رئوس مورد نیاز

        Graph graph = generateRandomGraph(numVertices);
        Vertex source = graph.getVertices().get(3); // رأس مبدأ

        PrintColor.printNorm("Randomly generated graph:");
        PrintColor.printNorm("Vertices: " + graph.getVertices().size());
        PrintColor.printNorm("Edges: " + graph.getEdges().size());

        PrintColor.printPur("\nApplying Dijkstra's algorithm:");
        applyDijkstra(graph, source);*/

	//coloring graph test
        {/*
            GFGGraph g1 = new GFGGraph(5);
            g1.addEdge(0, 1);
            g1.addEdge(0, 2);
            g1.addEdge(1, 2);
            g1.addEdge(1, 3);
            g1.addEdge(2, 3);
            g1.addEdge(3, 4);
            System.out.println("Coloring of graph 1");
            g1.greedyColoring();

            System.out.println();
            GFGGraph g2 = new GFGGraph(5);
            g2.addEdge(0, 1);
            g2.addEdge(0, 2);
            g2.addEdge(1, 2);
            g2.addEdge(1, 4);
            g2.addEdge(2, 4);
            g2.addEdge(4, 3);
            System.out.println("Coloring of graph 2 ");
            g2.greedyColoring();
        */}
    //knapsack for most value
        {/*
            Carpet c1 = new Carpet(60,10);
            Carpet c2 = new Carpet(100,20);
            Carpet c3 = new Carpet(120,30);
            int val[] = new int[] { c1.getPrice(), c2.getPrice(), c3.getPrice() };
            int wt[] = new int[] { c1.getWeigh(), c2.getWeigh(), c3.getWeigh() };
            int W = 50;
            int n = val.length;
            System.out.println("max value is: " + knapSack(W, wt, val, n));
            */}
    //knapsack test for most count
        {/*
            Carpet c1 = new Carpet(60,10);
            Carpet c2 = new Carpet(100,20);
            Carpet c3 = new Carpet(120,30);
            Carpet c4 = new Carpet(40,20);
            Carpet c5 = new Carpet(120,30);
            int val[] = new int[] { c1.getPrice(), c2.getPrice(), c3.getPrice() ,c4.getPrice(),c5.getPrice() };
            int max = 200;
            System.out.println("max value is: " + knapsackForCount(val,max));
        */}
    //
//        print with different color
//        PrintColor.printNorm("abc");
//        PrintColor.printBlu("abc");
//        PrintColor.printRed("abc");
//        PrintColor.printGre("abc");
//        PrintColor.printYel("abc");
//        PrintColor.printPur("abc");
//        PrintColor.printCya("abc");
    }
    public static void MainMenu(){
        while (true){
            // Here
            String select = input.next();
            switch (select){
                case "1" :

                    break;
                case "2" :

                    break;
                case "3" :

                    break;
                case "4" :

                    break;
                case "5" :

                    break;
                case "6" :

                    break;
                case "7" :

                    break;
                case "exit" :
                    PrintColor.printRed("Good luck");
                    exit(0);
            }
        }
    }
}
