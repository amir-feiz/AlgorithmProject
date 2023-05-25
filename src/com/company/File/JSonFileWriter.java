package com.company.File;
import java.io.FileWriter;
import java.io.PrintWriter;

import com.company.Dijkstra.Dijkstra;
import com.company.Dijkstra.Graph;
import org.json.JSONException;
import org.json.JSONObject;


public class JSonFileWriter {
    public static void WriteJSONGraph(){
        //path
        String path = ".\\ex.json" ;
        JSONObject json = new JSONObject();
        try {
            Graph graph = Dijkstra.generateRandomGraph(15);
            json.put("vertices" ,graph.getVertices());
            json.put("edges",graph.getEdges());
        } catch (JSONException e) {
            e.printStackTrace();
        }
        try (PrintWriter out = new PrintWriter(new FileWriter(path))) {
            out.write(json.toString());
//            ObjectMapper mapper = new ObjectMapper();
//            final String inputJson = json.toString();
//            out.write(mapper.writerWithDefaultPrettyPrinter().writeValueAsString(mapper.readTree(inputJson)));
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("\nthe file was written...\n");
    }
}
