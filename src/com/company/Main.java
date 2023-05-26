package com.company;

import com.company.Dijkstra.Dijkstra;
import com.company.Dijkstra.Edge;
import com.company.Dijkstra.Graph;
import com.company.Dijkstra.Vertex;
import com.company.File.colorGraphFile.ReadColorGraph;
import com.company.File.colorGraphFile.WriteColorGraph;
import com.company.File.knapSackFile.ReadKnapsack1;
import com.company.File.sequence.SequenceReader;
import com.company.File.sequence.SequenceWriter;
import com.company.models.GFGGraph;

import com.company.View.*;
import com.company.models.Knapsack;
import com.company.models.Node;
import com.company.models.SequenceCheck;

import java.io.IOException;
import java.util.*;
import java.util.ArrayList;

import static com.company.Dijkstra.Dijkstra.*;
import static java.lang.System.exit;

public class Main {
    public static Scanner input = new Scanner(System.in);
    WriteColorGraph w = new WriteColorGraph();
    static ArrayList<GFGGraph> gfgGraphs;
    static int[][] knapsack ;
    static Node[][] allNodes ;
    public static void main(String[] args) throws InterruptedException, IOException {
        ReadColorGraph r = new ReadColorGraph();

        gfgGraphs = r.readFile();
        knapsack = ReadKnapsack1.inputFromFile();
        allNodes = SequenceReader.FileReader();

        SequenceWriter.RandomWriter();


        Main.mainMenu();

        //Dijkstra
        {/*
            int numVertices = 10; // تعداد رئوس مورد نیاز

            Graph graph = generateRandomGraph(numVertices);
            Vertex source = graph.getVertices().get(0); // رأس مبدأ

            PrintColor.printNorm("Randomly generated graph:");
            PrintColor.printNorm("Vertices: " + graph.getVertices().size());
            PrintColor.printNorm("Edges: " + graph.getEdges().size());

            PrintColor.printPur("\nApplying Dijkstra's algorithm:");
            applyDijkstra(graph, source);
        */
        }
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
        */
        }
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
            */
        }
        //knapsack test for  most count
        {/*
            Carpet c1 = new Carpet(60,10);
            Carpet c2 = new Carpet(100,20);
            Carpet c3 = new Carpet(120,30);
            Carpet c4 = new Carpet(40,20);
            Carpet c5 = new Carpet(120,30);
            int val[] = new int[] { c1.getPrice(), c2.getPrice(), c3.getPrice() ,c4.getPrice(),c5.getPrice() };
            int max = 200;
            System.out.println("max value is: " + knapsackForCount(val,max));
        */
        }
        //sort algorithm test
        {/*
            Node n1 = new Node(1);
            Node n2 = new Node(2);
            Node n3 = new Node(3);
            Node n4 = new Node(4);
            Node n5 = new Node(5);
            Node n6 = new Node(6);
            Node n7 = new Node(7);
            Node n8 = new Node(8);
            Node n9 = new Node(9);
            Node n10 = new Node(10);

            Node mainNode[] = new Node[10];

            mainNode[0] = n1;
            mainNode[1] = n2;
            mainNode[2] = n3;
            mainNode[3] = n4;
            mainNode[4] = n5;
            mainNode[5] = n6;
            mainNode[6] = n7;
            mainNode[7] = n8;
            mainNode[8] = n9;
            mainNode[9] = n10;


    }


            Random random = new Random();
            Node n[][] = new Node[10][10];
            for (int i = 0; i < 10; i++) {
                for (int j = 0; j < 10; j++) {
                    n[i][j] = mainNode[random.nextInt(0, 10)];
                    System.out.print(n[i][j].getValue() + " ");
                }
                System.out.println();
            }
            int answer[] = SequenceCheck.chooseMostSimilars(mainNode, n);
            System.out.println(answer[0] + "  " + answer[1] + "  " + answer[2]);
        */
        }
    }

    //MainMenu();
    public static void mainMenu() {
        while (true) {
            // Here
            PrintColor.printCya("\n1.Find the best way to store.");
            PrintColor.printCya("\n2.Design new carpets.");
            PrintColor.printCya("\n3.How many carpets you can buy with your money?");
            PrintColor.printCya("\n4.How many carpets you can buy with your maximum weigh?");
            PrintColor.printCya("\n5.Find similar carpets.");
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
                    caseTwo();
                    break;

                case "3":
                    caseThree();
                    break;
                case "4":

                    break;
                case "5":

                    break;
                case "exit":
                    PrintColor.printRed("Good luck");
                    exit(0);
            }
        }
    }

    static void caseOne(int n) {
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
        } else if (n == 2) {
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

        } else {
            PrintColor.printYel("The input Should be between 1 - 2 ");
            mainMenu();
        }
    }
    static void caseTwo() {

        Scanner scanner = new Scanner(System.in);

        PrintColor.printGre("Choose the carpet ");
        for (int i=0;i< gfgGraphs.size();i++){
            PrintColor.printGre("Number: " + i);
            gfgGraphs.get(i).show();
        }
        gfgGraphs.get(scanner.nextInt()).greedyColoring();
        mainMenu();
    }
    static void caseThree(){
        Scanner scanner = new Scanner(System.in);

        PrintColor.printBlu("Prices are like: ");
        showPriceAndWeigh();

        PrintColor.printGre("Enter your maximum price");
        PrintColor.printYel("You can buy  " + Knapsack.knapsackForCount(knapsack[0], scanner.nextInt()));
        mainMenu();
    }

    public static void showPriceAndWeigh(){
        for(int i=0;i< knapsack[0].length;i++){
            System.out.println("Carpet" + i +":");
            System.out.println("value: " + knapsack[0][i] + "\tWeigh: " + knapsack[1][i]);
        }

    }


}