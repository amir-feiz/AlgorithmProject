package com.company;
import com.company.File.JSonFileWriter;
import com.company.File.JsonFileReader;
import com.company.models.Carpet;
import com.company.models.GFGGraph;
import com.company.models.Node;
import com.company.models.SequenceCheck;

import java.util.Random;

import static com.company.models.Knapsack.knapSack;
import static com.company.models.Knapsack.knapsackForCount;

public class Main {
    public static void main(String[] args) {
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
        */}
    }
}
