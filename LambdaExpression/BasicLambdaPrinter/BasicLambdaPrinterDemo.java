/*
Task:
Write a Java program that defines a simple lambda expression to print "Hello, Lambda World!" 
using a functional interface.

📌 Requirements:
Define your own functional interface named Printer.
Use a lambda expression to implement its method.
Call the method to print the message.
💡 Purpose: Understand how to define and use a lambda expression with a basic functional interface.
*/

@FunctionalInterface
interface Printer {
    public void print();
}

public class BasicLambdaPrinterDemo {
    public static void main(String[] args) {
        Printer printer = ()-> System.out.println("Hello, Lambda World!");
        printer.print();
    }
}
