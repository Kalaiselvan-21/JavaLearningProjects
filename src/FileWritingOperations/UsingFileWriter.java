package FileWritingOperations;

import java.io.FileWriter;
import java.io.IOException;

public class UsingFileWriter {

    public static void main(String[] args) throws IOException {
        String location = "FileWriter.txt";
        String content = "Learning Java";

        FileWriter fileWriter = new FileWriter(location);
        fileWriter.write(content);
        fileWriter.close();



    }
}
