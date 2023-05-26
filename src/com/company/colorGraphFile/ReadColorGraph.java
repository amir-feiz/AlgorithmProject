package com.company.colorGraphFile;

import com.company.models.GFGGraph;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class ReadColorGraph {


    //Creating Scanner instance to read File in Java


    public ArrayList<GFGGraph> readFile() throws FileNotFoundException {
        File text = new File("colorGraph.txt");
        Scanner sc = new Scanner(text);
        String s;
        String[] input;
        GFGGraph temp;
        ArrayList<GFGGraph> answer = new ArrayList<>();
        while (sc.hasNext()){
            s = sc.nextLine();
            input = s.split(" ");
            temp = new GFGGraph(Integer.parseInt(input[0]));
            for (int i=1;i<input.length;i+=2){
                temp.addEdge(Integer.parseInt(input[i]),Integer.parseInt(input[i+1]));
            }
            answer.add(temp);
        }
        return answer;
    }
}
