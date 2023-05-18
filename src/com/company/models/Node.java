package com.company.models;

import java.util.LinkedList;

public class Node {

    int value;
    private LinkedList<Integer> adj;
    public Node(){
        adj = new LinkedList<>();
    }
    public Node(int value){
        adj = new LinkedList<>();
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public LinkedList<Integer> getAdj() {
        return adj;
    }

    public void setAdj(LinkedList<Integer> adj) {
        this.adj = adj;
    }
}
