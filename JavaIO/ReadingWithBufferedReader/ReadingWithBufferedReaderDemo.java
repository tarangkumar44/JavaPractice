/*
🧪 Task:
Write a Java program that reads buffered_message.txt using BufferedReader and prints each line to the console.


🔍 Requirements:

Use BufferedReader (wrapped around a FileReader).
Read line by line with readLine().
Stop when readLine() returns null.
Print each line with a prefix like:

Line 1: Java I/O is powerful.
Line 2: Buffered streams improve efficiency.
Line 3: Always close your resources.

Use try-with-resources and proper exception handling. 
*/

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class ReadingWithBufferedReaderDemo {
    public static void main(String[] args) {
        File filePath = new File("/home/alien/Desktop/JavaPractice/JavaIO/WritingWithBufferedWriter/buffered_message.txt");
        try(FileReader fr = new FileReader(filePath); BufferedReader br = new BufferedReader(fr)){
            String message;
            int i = 1;
            while((message = br.readLine()) != null){
                System.out.println("Line " + (i++) + ": " + message);
            }
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}
