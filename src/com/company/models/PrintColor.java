package com.company.models;

public class PrintColor {
    public static void printNorm(Object obj){
        System.out.println(obj);
    }
    public static void printRed(Object obj){
        String ANSI_RESET = "\u001B[0m";
        String ANSI_RED = "\u001B[31m";
        System.out.println(ANSI_RED
                + obj
                + ANSI_RESET);
    }
    public static void printYel(Object obj){
        String ANSI_RESET = "\u001B[0m";
        String ANSI_YEl = "\u001B[33m";
        System.out.println(ANSI_YEl
                + obj
                + ANSI_RESET);
    }
    public static void printGre(Object obj){
        String ANSI_RESET = "\u001B[0m";
        String ANSI_GRE = "\u001B[32m";
        System.out.println(ANSI_GRE
                + obj
                + ANSI_RESET);
    }
    public static void printBlu(Object obj){
        String ANSI_RESET = "\u001B[0m";
        String ANSI_BLU = "\u001B[34m";
        System.out.println(ANSI_BLU
                + obj
                + ANSI_RESET);
    }
    public static void printPur(Object obj){
        String ANSI_RESET = "\u001B[0m";
        String ANSI_PUR = "\u001B[35m";
        System.out.println(ANSI_PUR
                + obj
                + ANSI_RESET);
    }
    public static void printCya(Object obj){
        String ANSI_RESET = "\u001B[0m";
        String ANSI_CYA = "\u001B[36m";
        System.out.println(ANSI_CYA
                + obj
                + ANSI_RESET);
    }

}
