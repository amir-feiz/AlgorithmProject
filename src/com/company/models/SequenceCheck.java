package com.company.models;

import com.company.View.PrintColor;


public class SequenceCheck {

    public static int differencePercentage(Node[] carpet1, Node[] carpet2) {

        int counter = 0;

        for (int i = 0; i < carpet1.length; i++) {
            if (carpet1[i].getValue() == carpet2[i].getValue())
                counter++;
        }

        return counter;
    }

    public static int[] chooseMostSimilars(Node[] carpet1, Node[][] carpet2,int n) {
        int imax1 = 0, imax2 = 0, imax3 = 0;
        int max1 = 0, max2 = 0, max3 = 0;

        int[] results = new int[carpet2.length];
        for (int i = 0; i < carpet2.length; i++) {
            if(i==n)
                continue;
            results[i] = differencePercentage(carpet1, carpet2[i]);
        }

        for (int i = 0; i < carpet2.length; i++) {
            if (results[i] > max3) {
                if (results[i] > max2) {
                    if (results[i] > max1) {
                        max3 = max2;
                        max2 = max1;
                        max1 = results[i];
                        imax3 = imax2;
                        imax2 = imax1;
                        imax1 = i;
                    } else {
                        max3 = max2;
                        max2 = results[i];
                        imax3 = imax2;
                        imax2 = i;
                    }
                } else {
                    max3 = max2;
                    imax3 = i;
                }
            } else {
                continue;
            }
        }
        int[] answer = {imax3, imax2, imax1};
        PrintColor.printNorm2("First most similar is carpet:\t");
        PrintColor.printBlu2(imax1);
        PrintColor.printNorm2(" with similarity of: ");
        PrintColor.printRed2(results[imax1]);
        PrintColor.printNorm(" Nodes");

        PrintColor.printNorm2("Second most similar is carpet:\t");
        PrintColor.printBlu2(imax2);
        PrintColor.printNorm2(" with similarity of: ");
        PrintColor.printRed2(results[imax2]);
        PrintColor.printNorm(" Nodes");

        PrintColor.printNorm2("Third most similar is carpet:\t");
        PrintColor.printBlu2(imax3);
        PrintColor.printNorm2(" with similarity of: ");
        PrintColor.printRed2(results[imax3]);
        PrintColor.printNorm(" Nodes");

        return answer;
    }

    public static void show(Node[][] allNodes) {
        int counter;
        for (int i = 0; i < allNodes.length; i++) {
            PrintColor.printBlu("Carpet " + i);
            counter = 0;
            for (int j = 0; j < 30; j++) {
                for (int z = 0; z < 40; z++) {
                    PrintColor.printNorm2(allNodes[i][counter++].getValue() + " ");
                }
                PrintColor.printNorm("");
            }
        }
    }
}