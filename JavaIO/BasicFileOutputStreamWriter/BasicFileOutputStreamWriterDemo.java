/*
🧪 Task:
Write a Java program that creates a file named output.txt and 
writes the string "Welcome to Java I/O Streams!" into it using FileOutputStream.
*/

import java.io.*;
import java.nio.charset.StandardCharsets;

public class BasicFileOutputStreamWriterDemo {
    public static void main(String[] args) {
        File filePath = new File("output.txt"); 
        try(FileOutputStream fos = new FileOutputStream(filePath)){
            String message = "Welcome to Java I/O Streams!";
            fos.write(message.getBytes(StandardCharsets.UTF_8));
            System.out.println("File has been written successfully");
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}





/*
Character Encoding (Real-World Best Practice):

.getBytes() uses the platform’s default charset, which can cause inconsistent results across 
    environments (e.g., Linux vs Windows).
Always specify the encoding explicitly in production code:
fos.write(message.getBytes(StandardCharsets.UTF_8));
(You’d need import java.nio.charset.StandardCharsets;)
*/
