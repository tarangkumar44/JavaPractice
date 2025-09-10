/*
📝 Task:
Write a Java program that takes two integers from the user and performs division.
Use a try-catch block to handle the case when the denominator is zero.

🔹 Class Name: BasicTryCatchDemo
🧠 Concepts Covered: Basic try, catch, ArithmeticException, input handling.
*/

import java.util.*;

class Division {
    private int firstNumber;
    private int secondNumber;
    public Division(int firstNumber, int secondNumber){
        this.firstNumber = firstNumber;
        this.secondNumber = secondNumber;
    }
    public void divide() {
        try{
            int result = this.firstNumber/this.secondNumber;
            System.out.println("Result: " + result);
        } catch (ArithmeticException e){
            System.out.println("Error: Division by zero is not allowed.");
        }
    }
}

public class BasicTryCatchDemo {
    public static void main(String[] args) {
        try(Scanner scanner = new Scanner(System.in)){
            System.out.print("Enter the first number: ");
            int firstNumber = scanner.nextInt();
            System.out.print("Enter the second number: ");
            int secondNumber = scanner.nextInt();
            Division division = new Division(firstNumber, secondNumber);
            division.divide();
        } catch (InputMismatchException e){
            System.out.println("Please enter only integer value");
        }
    }
}
