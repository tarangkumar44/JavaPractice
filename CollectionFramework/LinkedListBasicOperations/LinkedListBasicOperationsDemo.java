/*
Task:
Write a Java program using LinkedList<String> that:
Adds elements: "Apple", "Banana", "Cherry".
Inserts "Mango" at the beginning and "Orange" at the end.
Removes the first and last elements.
Prints the final list using an enhanced for-each loop. 
*/

import java.util.LinkedList;

public class LinkedListBasicOperationsDemo {
    public static void main(String[] args) {
        LinkedList<String> fruits = new LinkedList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");
        fruits.addFirst("Mango");
        fruits.addLast("Orange");
        fruits.removeFirst();
        fruits.removeLast();
        System.out.println("Final LinkedList elements:");
        for(String fruit : fruits){
            System.out.println(fruit);
        }
    }
}
