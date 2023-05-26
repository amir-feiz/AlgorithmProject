package com.company.File.sequence;

import com.company.View.PrintColor;
import com.company.models.Node;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;


public class SequenceReader {
    public static Node[][] FileReader() throws FileNotFoundException {
        File fileName = new File("numbers.txt");
        Scanner sc = new Scanner(fileName);
        Node[][] inputNodes = new Node[10][1200];
        String[] temp;
        int lineCounter = 0;
        while (sc.hasNext()){
            sc.nextLine();
            lineCounter++;
        }
        sc = new Scanner(fileName);
        for (int i = 0; i < 10; i++) {
            temp = sc.nextLine().split(" ");
            for (int j = 0; j < 1200; j++) {
                inputNodes[i][j] = new Node(Integer.parseInt(temp[j]));
            }
        }
        return inputNodes;
    }
}
