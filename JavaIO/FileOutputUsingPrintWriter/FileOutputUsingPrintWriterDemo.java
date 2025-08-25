/*
🧪 Task:
Write a Java program that uses PrintWriter to write to a file called printwriter_demo.txt.

Requirements:
Use PrintWriter (directly wrapping FileWriter).
Write different types of data (String, int, double, boolean) using println().
Print a confirmation message after writing.
Use try-with-resources and handle exceptions properly. 
*/

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.charset.StandardCharsets;

public class FileOutputUsingPrintWriterDemo {
    public static void main(String[] args) {
        File filePath = new File("printwriter_demo.txt");
        try(PrintWriter pw = new PrintWriter(new FileWriter(filePath, StandardCharsets.UTF_8))){
            int age = 23;
            String name = "Tarang";
            double percentage = 92.88034;
            boolean active = true;
            pw.println(name);
            pw.println(age);
            pw.println(percentage);
            pw.println(active);
            System.out.println("Content in file written successfully");
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}




/*
Simplification Option:
Since PrintWriter can take a File directly, you could shorten:

try (PrintWriter pw = new PrintWriter(filePath)) {
    ...
}


This avoids explicitly wrapping FileWriter. Both are valid — approach is fine for showing the relationship.

Floating Point Formatting (Optional Polish):
pw.println(percentage); writes the raw double. If wanted formatted output (e.g., 2 decimal places), you could use printf:
pw.printf("Percentage: %.2f%n", percentage);


Encoding Awareness (Later Advanced Note):
PrintWriter also has a constructor with charset:
new PrintWriter(new FileWriter(filePath, StandardCharsets.UTF_8)) 
*/
