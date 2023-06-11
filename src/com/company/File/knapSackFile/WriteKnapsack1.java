package com.company.File.knapSackFile;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

public class WriteKnapsack1 {

    public static void writeRandomToFile() throws IOException {
        FileWriter file = new FileWriter("knapsack.txt");
        Random r = new Random();
        String str = "";
        for (int i = 0; i < 10; i++) {
            str += String.valueOf(r.nextInt(1, 1000)) + " ";
            str += String.valueOf(r.nextInt(1, 1000)) + "\n";
        }
        file.write(str);
        file.close();
    }

    public static void writeCreatedToFile(int value, int weigh) throws IOException {
        FileWriter file = new FileWriter("knapsack.txt",true);
        String str = "";
        str += String.valueOf(value) + " ";
        str += String.valueOf(weigh + "\n");

        try {

            file.write(str);
        } catch (IOException ioException) {

        }
        file.close();
    }
}