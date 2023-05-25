package com.company.File;

import com.company.View.PrintColor;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;


public class TxtFileReader {
    public static ArrayList<String[]> FileReader() {
        String fileName = ".\\numbers.txt";

        String[] arr ;
        ArrayList<String[]> arrayList = new ArrayList<>();
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                arr = line.split(" ");
                arrayList.add(arr);
            }

        } catch (IOException e) {
            PrintColor.printYel("An error occurred while reading the file.");
            e.printStackTrace();
        }
        return arrayList;
    }


}
