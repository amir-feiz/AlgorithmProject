package com.company.File;
import com.company.Dijkstra.Graph;

import java.io.FileReader;


import com.google.gson.Gson;

public class JsonFileReader {
    public static Graph ReaderJsonGraph() {
        Graph graph = null;
        try {
            Gson gson = new Gson();
            graph = gson.fromJson(new FileReader(".\\ex.json"), Graph.class);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return graph;
    }
}
