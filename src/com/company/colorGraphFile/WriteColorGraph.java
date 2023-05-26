package com.company.colorGraphFile;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

public class WriteColorGraph {

    Random random = new Random();
    int v1,v2;
    String str ="";
    public void write() {
        int countOfNodes = random.nextInt(10,20);
        int countOfEdges = random.nextInt((countOfNodes*(countOfNodes-1)/2));
        try {

            str+=String.valueOf(countOfNodes+" ");
            FileWriter out = new FileWriter("colorGraph.txt");
            for (int i = 0; i <= countOfEdges; i++) {
                v1 = random.nextInt(countOfNodes);
                v2 = random.nextInt(countOfNodes);
                str += (String.valueOf(v1) + " ");
                str += (String.valueOf(v2) + " ");
            }
            str += "\n";
            out.append(str);
            out.close();

        }catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }


}
