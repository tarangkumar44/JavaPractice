/*
🧪 Task:
Write a Java program that creates a file named message.txt and writes the text
"Learning Java Character Streams!"
into it using FileWriter. 
*/

import java.io.*;
// import java.nio.charset.StandardCharsets;      // No need to handle charset explicitly (FileWriter handles it internally as characters).

public class BasicFileWritingUsingCharacterStreamDemo {
    public static void main(String[] args) {
        File filePath = new File("message.txt");
        try(FileWriter fw = new FileWriter(filePath)){
            fw.write("Learning Java Character Streams!");
            System.out.println("File is successfully written");
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}
