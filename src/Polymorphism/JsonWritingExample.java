package Polymorphism;


import org.json.JSONArray;
import org.json.JSONObject;

import java.io.FileWriter;
import java.io.IOException;

public class JsonWritingExample {

    public static void main (String[] args) throws IOException {

        JSONObject jsonObject = new JSONObject();
        jsonObject.put("Name","Kalai");
        jsonObject.put("Age",20);

        JSONArray jsonArray = new JSONArray();
        jsonArray.put("apple");
        jsonArray.put("orange");

        jsonObject.put("Fruits Own",jsonArray);

        FileWriter fileWriter = new FileWriter("kalai.json");
        fileWriter.write(jsonObject.toString());
        fileWriter.close();


    }
}
