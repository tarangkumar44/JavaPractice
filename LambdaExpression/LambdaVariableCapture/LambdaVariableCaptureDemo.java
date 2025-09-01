/*
Task:
Write a Java program that:

Defines a functional interface Multiplier with a method int multiply(int number).
Inside main, declare a local variable factor = 5.
Use a lambda expression that captures this variable to multiply the input number by factor.
Demonstrate the lambda by multiplying three different numbers.
💡 Purpose: Learn variable capture in lambda expressions (closure concept).
*/

@FunctionalInterface
interface Multiplier {
    public int multiply(int number);
}

public class LambdaVariableCaptureDemo {
    public static void main(String[] args) {
        int factor = 5;
        Multiplier multiplierLambda = number -> number*factor;
        System.out.println(multiplierLambda.multiply(5));
        System.out.println(multiplierLambda.multiply(2));
        System.out.println(multiplierLambda.multiply(3));
    }
}
