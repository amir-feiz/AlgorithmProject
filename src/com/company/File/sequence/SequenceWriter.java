package com.company.File.sequence;

import com.company.View.PrintColor;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

public class SequenceWriter {
    public static void RandomWriter() {
        int count = 1200;
        int min = 0;
        int max = 9;

        try {
            FileWriter writer = new FileWriter(".\\Files\\numbers.txt" );

            Random random = new Random();
            for (int j =0; j<10;j++) {
                for (int i = 0; i < count; i++) {
                    int randomNumber = random.nextInt(max - min + 1) + min;
                    writer.write(randomNumber + " ");
                }
                writer.write("\n");
            }
            writer.close();
//            System.out.println("Done!");
        } catch (IOException e) {
            PrintColor.printYel("Exception: " + e.getMessage());
        }
    }
}