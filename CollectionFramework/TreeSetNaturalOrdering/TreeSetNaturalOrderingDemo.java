/*
Create a TreeSet<Integer> and add 50, 10, 40, 20, 30.
Print it directly (should come out sorted).
Iterate using enhanced for loop.
Remove the smallest (first()) and largest (last()) elements, then print the updated set.
Check if 20 exists in the set.
*/

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.TreeSet;

public class TreeSetNaturalOrderingDemo {
    public static void main(String[] args) {
        // TreeSet does not allow null elements. Hence throw NullPointerException
        try (Scanner scanner = new Scanner(System.in)){
            TreeSet<Integer> numbers = new TreeSet<>();
            
            System.out.print("How many elements you want to enter: ");
            int numberOfElements = scanner.nextInt();
            
            for(int i = 0; i < numberOfElements; i++){
                System.out.print(i+1 + "). ");
                numbers.add(scanner.nextInt());
            }   
           
            System.out.println("TreeSet stores elements in ascending order by default: " + numbers);
            
            System.out.println("Printing using enhanced for loop:");
            for(Integer number : numbers){
                System.out.println(number);
            }
            
            System.out.println("Removing the smallest and largest elements...");
            Integer first = numbers.pollFirst();
            Integer last = numbers.pollLast();
            System.out.println("Removed first element: " + first);
            System.out.println("Removed last element: " + last);
            
            System.out.println("Printing the updated TreeSet directly: " + numbers);
            System.out.println("Checking if 20 exists in the set: " + numbers.contains(20));
        } catch (NullPointerException | InputMismatchException e){
            System.out.println("Error: " + e.getMessage());
        }
    }
}
