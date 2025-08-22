/*
Task:

Write a Java program using ArrayList that does the following:
Adds five string elements: "Java", "Python", "C++", "JavaScript", "Go".
Prints the list.
Removes "C++" from the list.
Prints the updated list.
Checks if "Python" exists in the list and prints a message accordingly.
Retrieves and prints the element at index 2.



Constraints:

Use ArrayList<String>.
Apply best practices like meaningful method names and separation of logic.
Keep code clean and readable (this is important from Day 1). 
*/

import java.util.ArrayList;

public class SimpleArrayListDemo {
    public static void main(String[] args) {
        ArrayList<String> languages = new ArrayList<>();
        languages.add("Java");
        languages.add("Python");
        languages.add("C++");
        languages.add("JavaScript");
        languages.add("Go");
        System.out.println("Original List: " + languages);
        languages.remove("C++");
        System.out.println("After removing 'C++': " + languages);
        System.out.println("'Python' exists in list? " + languages.contains("Python"));
        System.out.println("Element at index 2: " + languages.get(2));
    }
}
