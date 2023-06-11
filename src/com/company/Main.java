package com.company;

import com.company.Dijkstra.*;
import com.company.File.colorGraphFile.*;
import com.company.File.knapSackFile.*;
import com.company.File.sequence.*;
import com.company.models.*;
import com.company.View.*;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.*;
import static com.company.Dijkstra.Dijkstra.*;
import static java.lang.System.exit;

public class Main {
    public static Scanner input = new Scanner(System.in);
    static WriteColorGraph writeColorGraph = new WriteColorGraph();
    static ArrayList<GFGGraph> gfgGraphs;
    static int[][] knapsack ;
    static Node[][] allNodes ;
    static ReadColorGraph r = new ReadColorGraph();

    public static void main(String[] args) throws IOException {
        knapsack = ReadKnapsack1.inputFromFile();
        allNodes = SequenceReader.FileReader();
        SequenceWriter.RandomWriter();
        Main.mainMenu();
    }

    //MainMenu();
    public static void mainMenu() throws IOException {
        while (true) {
            // Here
            PrintColor.printCya("\n1.Find the best way to store.");
            PrintColor.printCya("2.Design new carpets.");
            PrintColor.printCya("3.How many carpets you can buy with your money?");
            PrintColor.printCya("4.How many carpets you can buy with your maximum weigh?");
            PrintColor.printCya("5.Find similar carpets.");
            PrintColor.printCya("6.Add new color graph for designing new carpets(coloringGraph).");
            PrintColor.printCya("7.Add new carpet for selling(knapSack).");
//            PrintColor.printCya("8.Add new carpet to find similars(Sequence check).");

            PrintColor.printCya("'exit' for exit");
            String select = input.next();
            switch (select) {
                case "1":
                    //Dijkstra
                    while (true) {
                        PrintColor.printCya("\n1.Create a random graph");
                        PrintColor.printCya("2.Read a graph from file ");
                        PrintColor.printCya("'back' for back");
                        select = input.next();
                        if (Objects.equals(select, "back"))
                            break;
                        else
                            caseOne(Integer.parseInt(select));
                    }
                    break;
                case "2":
                    gfgGraphs = r.readFile();
                    caseTwo();
                    break;
                case "3":
                    knapsack = ReadKnapsack1.inputFromFile();

                    caseThree();
                    break;
                case "4":
                    knapsack = ReadKnapsack1.inputFromFile();

                    caseFour();
                    break;
                case "5":
                    caseFive();
                    break;
                case "6":
                    caseSix();
                    break;
                case "7":
                    caseSeven();
                    break;
                case "exit":
                    PrintColor.printRed("Good luck");
                    exit(0);
            }
        }
    }
    static void caseOne(int n) throws IOException {
        if (n == 1) {
            Graph graph = Dijkstra.generateRandomGraph(15);

            PrintColor.printNorm("Randomly generated graph:");
            PrintColor.printNorm("Vertices: " + graph.getVertices().size());
            PrintColor.printNorm("Edges: " + graph.getEdges().size());

            PrintColor.printYel("\nThe stores are located at the top of 5, 7, 12");
            PrintColor.printNorm2("Select the origin vertex : ");
            int ver = input.nextInt();

            PrintColor.printPur("We will show you the best routes from the " +
                    "this vertex to the rest of the vertices");
            applyDijkstra(graph, graph.getVertices().get(ver));

            PrintColor.printPur("The best routes to the stores are:");
            List<Vertex> dis = new ArrayList<>();
            dis.add(graph.getVertices().get(5));
            dis.add(graph.getVertices().get(7));
            dis.add(graph.getVertices().get(12));
            applyDijkstra2(graph, graph.getVertices().get(ver), dis);
            mainMenu();
        }
        else if (n == 2) {
            //add a new graph
            Graph graph = new Graph();
            for (int i = 0; i < 5; i++) {
                Vertex vertex = new Vertex(i);
                graph.addVertex(vertex);
            }

            Edge edge = new Edge(graph.getVertices().get(0), graph.getVertices().get(2), 22);
            Edge edge1 = new Edge(graph.getVertices().get(2), graph.getVertices().get(0), 22);
            Edge edge2 = new Edge(graph.getVertices().get(1), graph.getVertices().get(4), 13);
            Edge edge3 = new Edge(graph.getVertices().get(4), graph.getVertices().get(1), 13);
            Edge edge4 = new Edge(graph.getVertices().get(1), graph.getVertices().get(3), 15);
            Edge edge5 = new Edge(graph.getVertices().get(3), graph.getVertices().get(1), 15);
            Edge edge6 = new Edge(graph.getVertices().get(2), graph.getVertices().get(3), 60);
            Edge edge7 = new Edge(graph.getVertices().get(3), graph.getVertices().get(2), 60);
            Edge edge8 = new Edge(graph.getVertices().get(0), graph.getVertices().get(4), 8);
            Edge edge9 = new Edge(graph.getVertices().get(4), graph.getVertices().get(0), 8);

            graph.addEdge(edge);
            graph.addEdge(edge1);
            graph.addEdge(edge2);
            graph.addEdge(edge3);
            graph.addEdge(edge4);
            graph.addEdge(edge5);
            graph.addEdge(edge6);
            graph.addEdge(edge7);
            graph.addEdge(edge8);
            graph.addEdge(edge9);

            PrintColor.printYel("The store is located at 2");

            PrintColor.printNorm2("Select the origin vertex : ");
            int ver = input.nextInt();
            applyDijkstra(graph, graph.getVertices().get(ver));
            List<Vertex> dis = new ArrayList<>();
            dis.add(graph.getVertices().get(2));
            applyDijkstra2(graph, graph.getVertices().get(ver), dis);
            mainMenu();

        }
        else {
            PrintColor.printYel("The input Should be between 1 - 2 ");
            mainMenu();
        }
    }
    static void caseTwo() throws IOException {
        for (int i=0;i< gfgGraphs.size();i++){
            PrintColor.printGre("Number: " + i);
            gfgGraphs.get(i).show();
        }
        PrintColor.printPur("Choose the carpet ");
        gfgGraphs.get(input.nextInt()).greedyColoring();
        mainMenu();
    }
    static void caseThree() throws IOException {
        PrintColor.printBlu("Prices are like: ");
        showPriceAndWeigh();

        PrintColor.printNorm("Enter your maximum price");
        PrintColor.printYel("You can buy  " + Knapsack.knapsackForCount(knapsack[0], input.nextInt()));
        mainMenu();
    }
    static void caseFour(){
        PrintColor.printBlu("Prices and weighs are like: ");
        showPriceAndWeigh();
        PrintColor.printNorm("Enter your maximum weigh");
        PrintColor.printYel("Max value for this weigh is: " + Knapsack.knapSack(input.nextInt(),knapsack[1],knapsack[0] ));
    }
    static void caseFive(){
        SequenceCheck.show(allNodes);
        PrintColor.printGre("Enter which carpet you want to compare with others.");
        int inputCarpet = input.nextInt();
        SequenceCheck.chooseMostSimilars(allNodes[inputCarpet],allNodes,inputCarpet);
    }
    static void caseSix() throws IOException {
        PrintColor.printGre("Enter count of nodes.");
        writeColorGraph.costumeWrite(input.nextInt());
        PrintColor.printYel("Done!");
        mainMenu();

    }
    static void caseSeven() throws IOException {
        PrintColor.printGre("Enter value");
        int value = input.nextInt();
        PrintColor.printGre("Enter weigh");
        int weigh = input.nextInt();
        WriteKnapsack1.writeCreatedToFile(value,weigh);
        PrintColor.printPur("Done!");
        mainMenu();
    }

    public static void showPriceAndWeigh(){
        for(int i=0;i< knapsack[0].length;i++){
            PrintColor.printGre2("Carpet " + i +" : ");
            PrintColor.printRed2("\tvalue: " );
            PrintColor.printNorm2(knapsack[0][i] );
            PrintColor.printBlu2("\tWeigh: " );
            PrintColor.printNorm2(knapsack[1][i] + "\n");
        }

    }
}