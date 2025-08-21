/*
🧪 Task:
Write a program that reads the contents of output.txt (the file you just wrote) using 
FileInputStream and prints the contents to the console. 
*/

import java.io.*;
import java.nio.charset.StandardCharsets;

public class BasicFileReadingUsingByteStreamDemo {
    public static void main(String[] args) {
        File filePath = new File("/home/alien/Desktop/JavaPractice/JavaIO/BasicFileOutputStreamWriter/output.txt");
        try(FileInputStream fis = new FileInputStream(filePath)){
            ByteArrayOutputStream baos = new ByteArrayOutputStream();
            int data = -1;
            while((data = fis.read()) != -1){
                baos.write(data);
            }
            String message = baos.toString(StandardCharsets.UTF_8);
            System.out.println("Message: " + message);
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}
