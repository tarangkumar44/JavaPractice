/*
Task
👉 Write a LinkedHashSet demo program with the following requirements:
Create a LinkedHashSet<String> to store names of 5 cities.
Add them in order (Delhi, Mumbai, Kolkata, Chennai, Bangalore).
Print the set directly and also with an enhanced for loop to show that insertion order is preserved.
Remove one city (say "Kolkata") and print the updated set.
Check whether "Delhi" exists in the set.
Finally, add a duplicate city (like "Delhi") and print the set again to prove no duplicates allowed.
*/

import java.util.*;

public class LinkedHashSetBasicDemo {
    public static void main(String[] args) {
        try(Scanner scanner = new Scanner(System.in)){
            LinkedHashSet<String> cities = new LinkedHashSet<>();
            System.out.print("How many cities you want to add: ");
            int size = scanner.nextInt();
            scanner.nextLine();
            System.out.println("Enter " + size + " cities: ");
            for(int i = 0; i < size; i++){
                System.out.print(i+1 + "). ");
                String city = scanner.nextLine();
                cities.add(city.trim().toLowerCase());
            }
            System.out.println("Printing LinkedHashSet directly: " + cities);
            System.out.println("Printing LinkedHashSet with enhanced forEach: ");
            cities.forEach(System.out::println);
            System.out.println("Removing the city \"Kolkata\".. ");
            cities.remove("kolkata");
            System.out.println("Printing the updated LinkedHashSet: " + cities);
            System.out.println("Checking if \"Delhi\" exists in the set: " + cities.contains("delhi"));
            System.out.println("Adding the duplicate city \"Delhi\" to prove if duplicates allowed or not...");
            cities.add("delhi");
            System.out.println("Final printing the set: " + cities);
        } catch (Exception e){
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}
