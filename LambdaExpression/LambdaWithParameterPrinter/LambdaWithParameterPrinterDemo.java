/*
Task:
Write a Java program that:

Defines a functional interface MessagePrinter with a method printMessage(String message).
Uses a lambda expression to implement this interface.
Prints three different messages by passing them as arguments to the lambda.
💡 Purpose: Practice lambda parameters (passing values into lambdas).
*/

@FunctionalInterface
interface MessagePrinter {
    public void printMessage(String message);
}

public class LambdaWithParameterPrinterDemo {
    public static void main(String[] args) {
        String message1 = "Hello. My name is Tarang";
        String message2 = "I am a student";
        String message3 = "I will get a job by the end of this year";
        MessagePrinter messagePrinter = (message) -> System.out.println(message);     // Since there’s only one parameter, parentheses are optional.
        messagePrinter.printMessage(message1);
        messagePrinter.printMessage(message2);
        messagePrinter.printMessage(message3);
    }
}
