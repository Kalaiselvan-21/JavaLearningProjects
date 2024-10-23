package FileReadingOperations;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;


import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;

public class JsonReadingExample {

    public static void main (String[] args) throws IOException, ParseException {
        JSONParser jsonParser = new JSONParser();

        FileReader fileReader = new FileReader("kalai.json");

        Object parsedobject = jsonParser.parse(fileReader);

        JSONObject jsonObject = (JSONObject) parsedobject;
        String name = (String) jsonObject.get("Name");
        Long age = (Long) jsonObject.get("Age");
        JSONArray array = (JSONArray) jsonObject.get("Fruits Own");

        System.out.println("Name is: "+name);
        System.out.println("Age is: "+age);

        Iterator iterator = array.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

    }
}
