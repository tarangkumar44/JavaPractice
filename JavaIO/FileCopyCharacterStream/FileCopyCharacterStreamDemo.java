/*
🧪 Task:
Write a program that copies the content of a text file (source.txt) into another file (destination.txt) 
using character streams.

Requirements:
Use FileReader and FileWriter.
Read character by character (or in a buffer of chars).
Handle exceptions properly.
Print a confirmation message after copying.
*/

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileCopyCharacterStreamDemo {
    public static void main(String[] args) {
        File source = new File("source.txt");
        File destination = new File("destination.txt");
        try(FileReader sourceContent = new FileReader(source); 
            FileWriter destinationContent = new FileWriter(destination)){
                StringBuilder content = new StringBuilder();
                int data = -1;
                System.out.println("Reading from the source...");
                while((data = sourceContent.read()) != -1){
                    content.append((char) data);
                }
                System.out.println("Done reading!");
                System.out.println("\nContent: " + content.toString());
                System.out.println("\nWriting into the destination...");
                destinationContent.write(content.toString());
                System.out.println("Written into the file successfully!!");
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}


/*
Improvement Suggestions

Direct Streaming (More Efficient):
Right now, you read everything into memory (StringBuilder) before writing.
For large files, this is not scalable.
Instead, write directly while reading:

int data;
while ((data = sourceContent.read()) != -1) {
    destinationContent.write(data);
}


This removes the need for StringBuilder.
🔹 Your version is still correct — but think in real-world backend apps: we avoid unnecessary memory use.


Buffer-Based Copy (Next Step):
Character-by-character is fine for learning, but buffered copy is much faster.
Example:

char[] buffer = new char[1024];
int charsRead;
while ((charsRead = sourceContent.read(buffer)) != -1) {
    destinationContent.write(buffer, 0, charsRead);
}

This reads/writes chunks instead of single characters.



Optional Polish:
If file doesn’t exist, you could add a check for source.exists() and show a user-friendly message.
For debugging, printing content is good, but in production, we’d skip printing the full file content to console.
*/
