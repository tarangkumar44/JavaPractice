/*
🧪 Task:
Write a Java program that reads the contents of 
message.txt (created in the last program) using FileReader and prints it to the console. 
*/

import java.io.*;

public class BasicFileReadingUsingCharacterStreamDemo {
    public static void main(String[] args) {
        File filePath = new File("/home/alien/Desktop/JavaPractice/JavaIO/BasicFileWritingUsingCharacterStream/message.txt");
        try(FileReader fr = new FileReader(filePath)){
            StringBuilder sb = new StringBuilder();
            int data = -1;
            while((data = fr.read()) != -1){
                sb.append((char)data);
            }
            String message = sb.toString();
            System.out.println("Message: " + message);
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}
