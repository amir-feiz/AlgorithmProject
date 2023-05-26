package com.company.File.knapSackFile;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class ReadKnapsack1 {

    public static int[][] inputFromFile () throws FileNotFoundException {
        ArrayList<Integer> a1 = new ArrayList<>();
        ArrayList<Integer> a2 = new ArrayList<>();
        File text = new File("knapsack.txt");
        Scanner sc = new Scanner(text);

        int lineCounter = 0;
        while (sc.hasNext()) {

            sc.nextInt();
            sc.nextInt();


            lineCounter++;
        }
        int[][] answer = new int[2][lineCounter];

        sc= new Scanner(text);
        int i =0;
        while (sc.hasNext()) {
           answer[0][i] = (sc.nextInt());
           answer[1][i] = (sc.nextInt());
           i++;
        }
        return answer;
    }


}
