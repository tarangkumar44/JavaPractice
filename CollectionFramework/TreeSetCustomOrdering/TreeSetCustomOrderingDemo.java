/*
Create a TreeSet<String> with a custom Comparator that sorts strings by length first, 
then alphabetically if lengths are equal.

Add: "Java", "Python", "C", "Go", "JavaScript", "Ruby".
Print directly and iterate to show the custom order.
Demonstrate duplicate prevention still works.
*/

import java.util.Comparator;
import java.util.InputMismatchException;
import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;

class SortTreeSet implements Comparator<String> {
    @Override
    public int compare(String ts1, String ts2){
        if(ts1.length() < ts2.length()){
            return -1;
        } else if(ts1.length() == ts2.length()){
            return ts1.compareTo(ts2);
        } else {
            return 1;
        }
    }
}

public class TreeSetCustomOrderingDemo {
    public static void main(String[] args) {
        // Tree set does not allow null elements. Hence throw NullPointerException 
        try (Scanner scanner = new Scanner(System.in)){
            TreeSet<String> languages = new TreeSet<>(new SortTreeSet());   // TreeSet is a sorted set
            
            // System.out.print("How many elements you want to enter: ");
            // int size = scanner.nextInt();
            // scanner.nextLine();
            
            // System.out.println("Enetr the elements: ");
            // for (int i = 0; i < size; i++) {
            //     System.out.print(i+1 + "). ");
            //     languages.add(scanner.nextLine());
            // }
            
            languages.add("Java");
            languages.add("Python");
            languages.add("C");
            languages.add("Go");
            languages.add("JavaScript");
            languages.add("Ruby");
            languages.add("Java"); // duplicate


            System.out.println("Printing the TreeSet directly: " + languages);

            System.out.println("Printing using Iterator: ");
            Iterator<String> iterator = languages.iterator();
            while (iterator.hasNext()) {
                System.out.println(iterator.next());
            }
        } catch (NullPointerException e){
            System.out.println("Error: " + e.getMessage());
        } catch (InputMismatchException e){
            System.out.println("Error: " + e.getMessage());
        }
    }
}





/*
Improvements

Comparator Simplification
You can simplify your comparator by using Comparator.thenComparing:

class SortTreeSet implements Comparator<String> {
    @Override
    public int compare(String ts1, String ts2) {
        return Comparator
                .comparingInt(String::length)
                .thenComparing(Comparator.naturalOrder())
                .compare(ts1, ts2);
    }
}


✅ Cleaner and uses modern Java style.

*/