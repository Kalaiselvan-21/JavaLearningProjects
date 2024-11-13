package FileReadingOperations;

import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class JsonReadingExample {

    public static void main (String[] args) throws IOException, org.json.simple.parser.ParseException {  // Declare both exceptions
        JSONParser jsonParser = new JSONParser();

        // Read the JSON file and parse it
        FileReader fileReader = new FileReader("kalai.json");
        Object parsedObject = jsonParser.parse(fileReader);

        // Cast to JSONObject
        JSONObject jsonObject = (JSONObject) parsedObject;

        // Extract values from JSONObject
        String name = (String) jsonObject.get("Name");
        Long age = (Long) jsonObject.get("Age");
        JSONArray array = (JSONArray) jsonObject.get("Fruits Own");

        // Print extracted values
        System.out.println("Name is: " + name);
        System.out.println("Age is: " + age);

        // Use iterator to loop through the JSONArray
        Iterator iterator = array.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
