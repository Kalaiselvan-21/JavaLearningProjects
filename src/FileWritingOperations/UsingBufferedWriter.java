package FileWritingOperations;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class UsingBufferedWriter {

    public static void main(String[] args) throws IOException {
        String location = "BufferedWriter.txt";
        String content = "Learning Java - BufferedWriter";

        FileWriter fileWriter = new FileWriter(location);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        bufferedWriter.write(content);
        bufferedWriter.close();



    }
}
