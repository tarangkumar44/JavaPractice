/*
Task:
Write a Java program that:

Defines a functional interface Printer with a method void print(String message).
Demonstrates method reference by:
Using System.out::println as the implementation of the Printer interface.
Prints three different messages using the method reference.
💡 Purpose: Understand method references (a cleaner alternative to lambdas when using existing methods).
*/

@FunctionalInterface
interface Printer {
    public void print(String message);
}

public class MethodReferencePrinterDemo {
    public static void main(String[] args) {
        Printer printer = System.out::println;
        printer.print("Hello.");
        printer.print("How are you?");
        printer.print("What are you doing?");
    }
}
