package FileWritingOperations;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class UsingFileOutputStream {

    public static void main(String[] args) throws IOException {
        String location = "UsingFOS.txt";
        String content = "Learning Java - FileOutputStream";

        FileOutputStream fileOutputStream = new FileOutputStream(location);
        byte[] writeThis =  content.getBytes();
        fileOutputStream.write(writeThis);
        fileOutputStream.close();
    }
}
