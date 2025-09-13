/*
Create a HashSet<String> and a LinkedHashSet<String>.
Add the same 5 elements ("Banana", "Apple", "Mango", "Cherry", "Orange").
Print both sets to show how HashSet doesn’t guarantee order but LinkedHashSet preserves insertion order.
Show that duplicates are not allowed in both.
*/

import java.util.HashSet;
import java.util.LinkedHashSet;

public class LinkedHashSetVsHashSetOrderingDemo {
    public static void main(String[] args) {
        HashSet<String> fruits1 = new HashSet<>();
        LinkedHashSet<String> fruits2 = new LinkedHashSet<>();
        fruits1.add("Banana");
        fruits1.add("Apple");
        fruits1.add("Mango");
        fruits1.add("Cherry");
        fruits1.add("Orange");
        fruits2.add("Banana");
        fruits2.add("Apple");
        fruits2.add("Mango");
        fruits2.add("Cherry");
        fruits2.add("Orange");

        // HashSet doesn't guarantee order of insertion.
        System.out.println("Directly printing HashSet: " + fruits1);

        // LinkedHashSet preserves insertion order
        System.out.println("Directly printing LinkedHashSet: " + fruits2);

        boolean added1 = fruits1.add("Banana");
        boolean added2 = fruits2.add("Banana");
        System.out.println("Was 'Banana' added to HashSet? " + added1);
        System.out.println("Was 'Banana' added to LinkedHashSet? " + added2);

        System.out.println("Iterating HashSet:");
        fruits1.forEach(System.out::println);

        System.out.println("Iterating LinkedHashSet:");
        fruits2.forEach(System.out::println);
    }
}
