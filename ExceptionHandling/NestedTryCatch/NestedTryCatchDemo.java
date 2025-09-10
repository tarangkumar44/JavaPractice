/*
📝 Task:
Write a program that demonstrates nested try-catch blocks.

The program should ask the user for:
An array size
Array elements
An index to divide the first element by

Handle these scenarios:
Outer try-catch → Handles InputMismatchException (if user enters non-integer input).
Inner try-catch → Handles ArrayIndexOutOfBoundsException (if index is invalid) and ArithmeticException (if division by zero occurs).

🧠 Concepts Covered: Nested try-catch, separation of responsibilities, clean handling of different exception sources.

⚡ Real-world note: While we rarely need nested try-catch in production (we prefer centralized handlers), practicing it builds intuition for scoping and exception isolation.
*/

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class NestedTryCatchDemo {
    private static final Logger logger = Logger.getLogger(NestedTryCatchDemo.class.getName());
    public static void main(String[] args) {
        try(Scanner scanner = new Scanner(System.in)){
            logger.info("Program started. Asking for array size.");
            System.out.print("Enter array size: ");
            int arraySize = scanner.nextInt();
            logger.fine("Entered " + arraySize + " as array size.");
            int[] array = new int[arraySize];
            System.out.println("Enter elements of array: ");
            for(int i = 0; i < arraySize; i++){
                System.out.print(i+1 + "). ");
                array[i] = scanner.nextInt();
                logger.fine("Element at index " + i + " entered " + array[i]);
            }
            try {
                System.out.print("Enter the index of the element to divide the first element by: ");
                int index = scanner.nextInt()-1;
                logger.info("Division requested: array[0] / array[" + index + "]");
                int result = array[0]/array[index];
                System.out.println("Result: " + result);
                logger.info("Division successful. Result: " + result);
            } catch (ArrayIndexOutOfBoundsException e){
                logger.log(Level.WARNING, "Invalid index entered", e);
                System.out.println("Error: Please enter valid index.");
            } catch (ArithmeticException e){
                logger.log(Level.SEVERE, "Division by zero attempted", e);
                System.out.println("Error: Division by zero is not allowed.");
            }
        } catch (InputMismatchException e){
            logger.log(Level.SEVERE, "Invalid input type entered", e);
            System.out.println("Error: Please enter only integer value.");
        }
        logger.info("Program ended");
    }
}
