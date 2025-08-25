/*
Task:
Write a Java program using ArrayDeque<String> that:
Adds "Red", "Green", "Blue" to the deque.
Inserts "Yellow" at the front and "Black" at the rear.
Removes the first and last elements.
Prints the remaining elements using both:
Enhanced for-each loop
Iterator 
*/

import java.util.ArrayDeque;
import java.util.Iterator;

public class ArrayDequeOperationsDemo {
    public static void main(String[] args) {
        ArrayDeque<String> colors = new ArrayDeque<>();
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        colors.addFirst("Yellow");
        colors.addLast("Black");
        colors.removeFirst();
        colors.removeLast();
        System.out.println("Final ArrayDeque using enhanced for-each loop: ");
        for(String color : colors){
            System.out.println(color);
        }
        System.out.println("\nFinal ArrayDeque using Iterator: ");
        Iterator<String> iterator = colors.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }


        // for(Iterator<String> iterator = colors.iterator(); iterator.hasNext(); ){
        //     System.out.println(iterator.next());
        // }
    }
}
