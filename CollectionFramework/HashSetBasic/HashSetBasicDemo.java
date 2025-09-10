/*
Task:
Write a program that shows:
Create a HashSet<String> and add some elements ("Java", "Python", "C++", "Java", "Go").

Notice: "Java" is added twice — check what happens.
Print the HashSet directly.
Emphasize that order is not guaranteed.
Check if a particular element exists ("Python").
Remove one element (say "C++") and print again.
Iterate through the set using an enhanced for loop.
*/

import java.util.HashSet;
import java.util.Scanner;

public class HashSetBasicDemo {
    public static void main(String[] args) {
        try(Scanner scanner = new Scanner(System.in)){
            HashSet<String> languages = new HashSet<>();
            int hashSetLength = 5;
            System.out.println("Enter " + hashSetLength + " computer languages: ");
            for(int i = 0; i < hashSetLength; i++){
                System.out.print(i+1 + "). ");
                String language = scanner.nextLine();
                languages.add(language.trim().toLowerCase());
            }
            System.out.println("\nNote: Order in HashSet is not guaranteed.");
            System.out.println("Printing HashSet directly: " + languages);
            System.out.println("Checking if python exists in HashSet: " + languages.contains("Python"));
            System.out.println("Removing C++ from the languages..");
            languages.remove("C++");
            System.out.println("Printing the HashSet using enhanced forEach:");
            languages.forEach(System.out::println);
        } catch (Exception e){
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}
