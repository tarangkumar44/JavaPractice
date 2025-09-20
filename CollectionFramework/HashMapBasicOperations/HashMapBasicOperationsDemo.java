/*
📌 Question #: HashMapBasicOperationsDemo
Create a HashMap<Integer, String> mapping roll numbers to student names.
Add 5 students.
Print the map directly.

Iterate using:
keySet()
entrySet()
values()

Remove one entry by key.
Check if a specific key and value exist.
*/

import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Map;
import java.util.Scanner;

class StudentDetails {
    HashMap<Integer, String> studentDetails = new HashMap<>();
    Scanner scanner = null;
    
    public StudentDetails(Scanner scanner){
        this.scanner = scanner;
    }
    
    public void enterStudentDetails(){
        try {
            System.out.print("How many records you want to enter: ");
            int numberOfRecords = scanner.nextInt();
            System.out.println("Enter " + numberOfRecords + " record: ");
            for (int i = 0; i < numberOfRecords; i++) {
                System.out.print("Enter roll number: ");
                int roll = scanner.nextInt();
                scanner.nextLine();
                System.out.print("Enter name: ");
                String name = scanner.nextLine();
                studentDetails.put(roll, name);
            }
        } catch (InputMismatchException e){
            System.out.println("Please enter integer as roll number and String as name " + e.getMessage());
        }

    }
    
    public void printDirectly(){
        System.out.println("Direct printing: " + studentDetails);
    }
    
    public void forEachLambdaPrinting(){
        System.out.println("Printing using forEach lambda expression: ");
        studentDetails.forEach((k, v) -> System.out.println(k + " : " + v));
    }
    
    public void printUsingKeySet(){
        System.out.println("Printing using keySet(): ");
        for(Integer key : studentDetails.keySet()){
            System.out.println(key + " : " + studentDetails.get(key));
        }
    }
    
    public void printUsingValues(){
        System.out.println("Printing using values(): ");
        for(String value : studentDetails.values()){
            System.out.println(value);
        }
    }
    
    public void printUsingEntrySet(){
        System.out.println("Printing using entrySet(): ");
        for(Map.Entry<Integer, String> entry : studentDetails.entrySet()){
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
    
    private int keyEntry(){
        int key = 0;
        while (true){
            try {
                key = scanner.nextInt();
                if(!studentDetails.containsKey(key)){
                    System.out.println("Invalid key input. Enter valid key");
                    continue;
                } else {
                    break;
                }
            } catch (InputMismatchException e) {
                System.out.println("Input is invalid. Enter integer in roll " + e.getMessage());
                scanner.nextLine();
            }   
        } 
        return key;
    }
    
    private String valueEntry(){
        String value = null;
        while(true){
            try {
                value = scanner.nextLine();
                if(!studentDetails.containsValue(value)){
                    System.out.println("The value entered does not exist in the HashMap. Enter the value that exist.");
                    continue;
                } else {
                    break;
                }
            } catch (InputMismatchException e) {
                System.out.println("Input is invalid. Enter string as name " + e.getMessage());
                scanner.nextLine();
            }   
        } 
        return value;
    }
    
    public void removeByKey(){
        System.out.print("Enter the key to remove it's entry: ");
        int key = keyEntry();
        System.out.println("Record at the key: " + studentDetails.get(key));
        studentDetails.remove(key);
        System.out.println("Record removed successfully.");
    }

    public void removeByValue(){
        System.out.print("Enter the value to remove: ");
        String value = valueEntry();
        // This removes only one occurrence. If multiple students share the same name, only the first is removed.
        studentDetails.values().remove(value);    
        // ✅ Better approach:
        // studentDetail.entrySet().removeIf(entry -> entry.getValue().equals(value));
        System.out.println("Record with value '" + value + "' removed successfully.");
    }

    
    public void checkKeyAndValueExist(){
        try {
            System.out.print("Enter the key: ");
            int key = scanner.nextInt();
            scanner.nextLine();
            System.out.println("Key exist in the HashMap: " + studentDetails.containsKey(key));     
            System.out.print("Enter the value: ");
            String value = scanner.nextLine();
            System.out.println("Value exist in the HashMap: " + studentDetails.containsValue(value));   
        } catch (InputMismatchException e) {
            System.out.println("Input is invalid. Enter integer in roll and string in name " + e.getMessage());
            scanner.nextLine();
        }
    }

    public void updateRecord() {
        System.out.print("Enter roll number to update: ");
        int key = keyEntry();
        System.out.print("Enter new name: ");
        String newName = scanner.nextLine();
        studentDetails.put(key, newName);
        System.out.println("Record updated.");
    }

}

public class HashMapBasicOperationsDemo {
    public static void main(String[] args) {
        try(Scanner scanner = new Scanner(System.in)){
            StudentDetails studentDetails = new StudentDetails(scanner);
            studentDetails.enterStudentDetails();
            studentDetails.printDirectly();
            studentDetails.forEachLambdaPrinting();
            studentDetails.removeByKey();
            studentDetails.forEachLambdaPrinting();
            studentDetails.printUsingKeySet();
            studentDetails.printUsingValues();
            studentDetails.printUsingEntrySet();
            studentDetails.checkKeyAndValueExist();
        } catch (IllegalStateException e){
            System.out.println("Error occurred " + e.getMessage());
        }
    }
}
