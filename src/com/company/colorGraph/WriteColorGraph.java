package com.company.colorGraph;

import com.company.models.GFGGraph;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Random;

public class WriteColorGraph {

    Random random = new Random();
    int v1,v2;
    String str ="";
    public void write() {
        int countOfNodes = random.nextInt(10,20);
        int countOfEdges = random.nextInt((countOfNodes*(countOfNodes-1)/2));
        try {
            Path path = Files.createTempFile("colorGraph", ".txt");
            if (Files.exists(path)) {

                BufferedWriter out = new BufferedWriter(new FileWriter("colorGraph.txt", true));

                FileOutputStream f = new FileOutputStream("colorGraph.txt");
                for (int i = 0; i <= countOfEdges; i++) {
                    v1 = random.nextInt(countOfNodes);
                    v2 = random.nextInt(countOfNodes);
//                    f.write(v1);
//                    f.write(v2);
                    str+= (String.valueOf(v1) + " ");
                    str+= (String.valueOf(v2) + " ");
                }
                out.append(str);
                out.close();

            } else {
                FileWriter myWriter = new FileWriter("colorGraph.txt");
                myWriter.write(String.valueOf(countOfNodes) + " ");
                System.out.println("Successfully wrote to the file.");


                for (int i = 0; i <= countOfEdges; i++) {
                    v1 = random.nextInt(countOfNodes);
                    v2 = random.nextInt(countOfNodes);
                    str+= (String.valueOf(v1) + " ");
                    str+= (String.valueOf(v2) + " ");
                }

                myWriter.write("\n");
                myWriter.close();

            }
        }catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }


}
