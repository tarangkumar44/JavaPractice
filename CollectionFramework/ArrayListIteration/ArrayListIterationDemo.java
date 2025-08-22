/*
Task:

Write a Java program that:
Creates an ArrayList<Integer> with numbers 10, 20, 30, 40, 50.
Iterates through the list using:
For loop (index-based)
Enhanced for-each loop
Iterator
Prints the elements in each approach with clear messages. 
*/

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListIterationDemo {
    public static void arrayListDemo(){
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        System.out.println("Iterating the list through index based for loop: ");
        for(int i = 0; i < list.size(); i++){
            System.out.println(list.get(i));
        }
        System.out.println("Iterating through enhanced for-each loop: ");
        for(Integer number : list){
            System.out.println(number);
        }
        System.out.println("Iterating the list through modern forEach loop: ");
        list.forEach(System.out::println);
        System.out.println("Iterating the list through Iterator: ");
        Iterator<Integer> iterator = list.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
    public static void main(String[] args) {
        arrayListDemo();
    }
}
