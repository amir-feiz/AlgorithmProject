package com.company.Graph;

import java.util.HashMap;
import java.util.Map;

public class Vertex {
    private final int element; // i dont know why :)
    private final Map<Vertex, Edge> edges;

    public Vertex(int element) {
        this.element = element;
        edges = new HashMap<>();
    }

    public int getElement() {
        return element;
    }
    public Map<Vertex, Edge> getEdges() {
        return edges;
    }
}
