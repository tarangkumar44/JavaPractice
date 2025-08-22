/*
🧪 Task:
Write a Java program that creates a file named buffered_message.txt and writes 
the following three lines into it using BufferedWriter:

Java I/O is powerful.
Buffered streams improve efficiency.
Always close your resources.


🔍 Requirements:
Use BufferedWriter (wrapped around a FileWriter).
Write multiple lines, each ending with newLine().
Use try-with-resources for safety.
Print a confirmation message once done. 
*/

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WritingWithBufferedWriterDemo {
    public static void main(String[] args) {
        File filePath = new File("buffered_message.txt");
        try(FileWriter fw = new FileWriter(filePath); BufferedWriter bw = new BufferedWriter(fw)){
            bw.write("Java I/O is powerful.");
            bw.newLine();
            bw.write("Buffered streams improve efficiency.");
            bw.newLine();
            bw.write("Always close your resources.");
            bw.flush();
            System.out.println("File written successfully");
        } catch (IOException e){
            e.printStackTrace();
        }   
    }
}
