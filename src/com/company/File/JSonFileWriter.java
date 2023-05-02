package com.company.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.List;
import org.json.*;
import org.json.JSONException;
import org.json.JSONObject;
public class JSonFileWriter {
    public static void WriteJSONExample(){
        //path
        String path = ".\\ex.json" ;

        // Create a new JSON object
        JSONObject jsonObject = new JSONObject();

        // Put data in the JSON object
        jsonObject.put("name", "John");
        jsonObject.put("age", 30);
        jsonObject.put("city", "New York");

        // Create a new JSON array
        JSONArray jsonArray = new JSONArray();

        // Add items to the array
//        jsonArray.add("apple");
//        jsonArray.add("banana");
//        jsonArray.add("orange");
        jsonArray.put(jsonObject);



        // Put the array in the JSON object
        jsonObject.put("fruits", jsonArray);

        // Write the JSON object to a file
//        try (FileWriter file = new FileWriter("output.json")) {
//            file.write(jsonObject.toJSONString());
//        } catch (IOException e) {
//            e.printStackTrace();
//        }

        JSONObject json = new JSONObject();
        try {
            json.put("name", "Google");
            json.put("employees", 140000);
            json.put("offices", List.of("Mountain View", "Los Angeles", "New York"));
        } catch (JSONException e) {
            e.printStackTrace();
        }
        try (PrintWriter out = new PrintWriter(new FileWriter(path))) {
            out.write(json.toString());
        } catch (Exception e) {
            e.printStackTrace();
        }


        System.out.println("\nthe file was written...\n");
    }
}
