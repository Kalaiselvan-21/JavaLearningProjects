package FileReadingOperations;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class UsingBufferedReader {

    public static void main (String[] args) throws IOException {
        String location = "UsingFOS.txt";

        FileReader fileReader = new FileReader(location);
        BufferedReader bufferedReader = new BufferedReader(fileReader);

        String readLines;
        while ((readLines = bufferedReader.readLine())!=null){
            System.out.println(readLines);
        }
    }
}
