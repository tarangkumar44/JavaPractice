/*
📜 Problem Statement

Write a terminal-based program that:
Prompts the user to enter a directory directoryPath.
Validates the directoryPath (must exist and be a directory).
Lists all immediate directoryPaths and subdirectories (not recursive yet).

For each entry, print:
Name
Type (directoryPath or Directory)
Size (in bytes, for directoryPaths)
Last modified date/time

Acceptance Criteria
Input: user can type relative (. or ..) or absolute directoryPathPaths.
Output: neatly formatted table/list.
If directoryPathPath is invalid or inaccessible, show a meaningful error without crashing.
Must run consistently on Linux, Windows, macOS.

Edge Cases
Directory is empty → print “No directoryPaths found”.
directoryPath points to a directoryPath instead of directory → show error.
No read permission → handle gracefully.
*/

import java.io.*;
import java.nio.*;
import java.text.SimpleDateFormat;
import java.util.*;

class DirectoryOperations {
    File directoryPath;
    public DirectoryOperations(){
        directoryPath = null;
    }
    public DirectoryOperations(File directoryPath){
        setDirectoryPath(directoryPath);
    }
    private void setDirectoryPath(File directoryPath){
        this.directoryPath = directoryPath;
    }
    public File getDirectoryPath(){
        return this.directoryPath;
    }
    public void printContent(){
        File[] contents = directoryPath.listFiles();
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy HH:mm");
        System.out.println("---------------------------------------------------------------------------------------------------------------------------------");
        System.out.printf("%-60s %-20s %-20s %-30s\n", "Name", "Type", "Size", "Last Modified");
        System.out.println("---------------------------------------------------------------------------------------------------------------------------------");
        for(File content : contents){
            String type = content.isDirectory() ? "DIRECTORY" : "FILE";
            String lastModified = sdf.format(new Date(content.lastModified()));
            long length = content.isFile() ? content.length() : getFolderSize(content);
            System.out.printf("%-60s %-20s %-20s %-30s\n", content.getName(), type, length, lastModified);
        }
    }
    private long getFolderSize(File folder){
        long length = 0;
        File[] files = folder.listFiles();
        if(files != null){
            for(File file : files){
                if(file.isFile()){
                    length += file.length();
                } else {
                    length += getFolderSize(file);
                }
            }
        }
        return length;
    }
}

public class DirectoryFileListerDemo {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {            
            File directoryPath;
            // while(true){
            System.out.print("Enter directory path: ");
            String path = scanner.nextLine();
            if(path.isEmpty() || path.isBlank() || path.length() == 0 || path.equals(".")){
                directoryPath = new File(System.getProperty("user.dir"));
                System.out.println("No directory path is provided. Selecting the current directory: " + directoryPath.getAbsolutePath());
            } else {
                if(!(directoryPath = new File(path)).exists()){
                    System.out.println("Path does not exist: " + directoryPath.getAbsolutePath());
                    return;
                } else if(!directoryPath.isDirectory()){
                    System.out.println("Provided path is not a directory: " + directoryPath.getAbsolutePath());
                    return;
                }
            }
            DirectoryOperations doo = new DirectoryOperations(directoryPath);
            doo.printContent();
            // }
        } catch (Exception e) {
            System.out.println("directoryPath not found.");
        }
    }
}
