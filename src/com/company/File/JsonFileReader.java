package com.company.File;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.json.*;
import java.io.*;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;
import java.util.Iterator;
import java.io.FileReader;
import org.json.simple.parser.*;


import java.io.FileReader;
import com.google.gson.Gson;

public class JsonFileReader {
//    static ArrayList<User> fileReader3() throws IOException {
//        ObjectMapper objectMapper = new ObjectMapper();
//        User [] users = objectMapper.readValue(new File(".\\users.json"),User[].class);
//        ArrayList<User> users55 = new ArrayList<>();
//        for (int i = 0; i < users.length; i++) {
//            users55.add(users[i]);
//        }
//        return users55;
//    }
//    public static void fileReader23() {
//        JSONParser parser = new JSONParser();
//        try {
//            Object obj = parser.parse(new FileReader(".\\ex.json"));
//            JSONObject jsonObject = (JSONObject)obj;
//            String name = (String)jsonObject.get("name");
//            String employees = (String)jsonObject.get("employees");
//            JSONArray offices = (JSONArray)jsonObject.get("offices");
//
//            JSONArray array = new JSONArray();
//            array.put(obj);
//
//
//            System.out.println("name: " + name);
//            System.out.println("employees: " + employees);
//            System.out.println("offices:");
//            Iterator iterator = offices.iterator();
//            while (iterator.hasNext()) {
//                System.out.println(iterator.next());
//            }
//        } catch(Exception e) {
//            e.printStackTrace();
//        }
        //        Object o = new JSONParser().parse(new FileReader(".\\ex.json"));
//
//        JSONObject j = (JSONObject) o;
//
//        String Name = (String) j.get(“Name”);
//
//        String College = (String ) j.get(“College”);
//    }
    public static void fileReader() {
        try {
            Gson gson = new Gson();
            MYObject myObject = gson.fromJson(new FileReader(".\\ex.json"), MYObject.class);
            System.out.println(myObject);

        }catch(Exception e) {
            e.printStackTrace();
        }
    }

}
