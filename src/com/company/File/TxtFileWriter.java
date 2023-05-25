package com.company.File;

import com.company.View.PrintColor;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

public class TxtFileWriter {
    public static void RandomWriter() {
        int count = 120000;
        int min = 1;
        int max = 10;

        try {
            FileWriter writer = new FileWriter(".\\numbers.txt" , true);

            Random random = new Random();
            for (int i = 0; i < count; i++) {
                int randomNumber = random.nextInt(max - min + 1) + min;
                writer.write(randomNumber + " ");
            }
            writer.write( "\n");

            writer.close();
//            System.out.println("Done!");
        } catch (IOException e) {
            PrintColor.printYel("Exception: " + e.getMessage());
        }
    }
}
