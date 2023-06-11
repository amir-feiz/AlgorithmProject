package com.company.File.colorGraphFile;

import com.company.View.PrintColor;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class WriteColorGraph {

    Random random = new Random();
    int v1, v2;
    String str = "";
    Map<Integer, ArrayList<Integer>> integerArrayListMap;
    public void write() {
        int countOfNodes = random.nextInt(10, 20);
        int countOfEdges = random.nextInt((countOfNodes * (countOfNodes - 1) / 2));

        try {
            integerArrayListMap = new HashMap<>();

            str += String.valueOf(countOfNodes + " ");
            FileWriter out = new FileWriter(".\\Files\\colorGraph.txt", true);
            for (int i=0;i<countOfNodes;i++){
                integerArrayListMap.put(i,new ArrayList<Integer>());
            }
            for (int i = 0; i <= countOfEdges; i++) {

                v1 = random.nextInt(countOfNodes);
                v2 = random.nextInt(countOfNodes);
                if (hasAdjacency(v1,v2,integerArrayListMap) || v1 == v2){
                    i--;
                    continue;
                }
                str += (String.valueOf(v1) + " ");
                str += (String.valueOf(v2) + " ");
                integerArrayListMap.get(v1).add(v2);
                integerArrayListMap.get(v2).add(v1);
            }
            str += "\n";
            out.append(str);
            out.close();

        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

    public void costumeWrite(int countOfNodes) {
        int countOfEdges = random.nextInt((countOfNodes * (countOfNodes - 1) / 2));
        try {
            integerArrayListMap = new HashMap<>();

            str += String.valueOf(countOfNodes + " ");
            FileWriter out = new FileWriter(".\\Files\\colorGraph.txt", true);
            for (int i=0;i<countOfNodes;i++){
                integerArrayListMap.put(i,new ArrayList<Integer>());
            }
            PrintColor.printPur("Edges are like below:");
            for (int i = 0; i <= countOfEdges; i++) {
                v1 = random.nextInt(countOfNodes);
                v2 = random.nextInt(countOfNodes);
                if (hasAdjacency(v1,v2,integerArrayListMap) || v1 == v2){
                    i--;
                    continue;
                }
                PrintColor.printRed(v1 + " ---- " + v2);
                str += (String.valueOf(v1) + " ");
                str += (String.valueOf(v2) + " ");
            }
            str += "\n";
            out.append(str);
            out.close();

        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

    public boolean hasAdjacency(int vertex1, int vertex2, Map<Integer, ArrayList<Integer>> integerArrayListMap) {

        for(int i =0;i< integerArrayListMap.get(vertex1).size();i++){
            if (integerArrayListMap.get(vertex1).get(i) == vertex2)
                return true;
        }
        for(int i =0;i< integerArrayListMap.get(vertex2).size();i++){
            if (integerArrayListMap.get(vertex2).get(i) == vertex1)
                return true;
        }

        return false;
    }
}