/*
Task:
Define a functional interface Calculator with a method int calculate(int a, int b).
Create a utility class MathUtils with a static method add(int a, int b) that returns the sum.
In main, use a static method reference (MathUtils::add) to implement the Calculator interface.
Demonstrate it by adding three pairs of numbers.
💡 Purpose: Practice static method references with user-defined methods.
*/

@FunctionalInterface
interface Calculator {
    public int calculate(int a, int b);
}

class MathUtils {
    public static int add(int a, int b){
        return a+b;
    }
}

public class StaticMethodReferenceCalculatorDemo {
    public static void main(String[] args) {
        Calculator calculator = MathUtils::add;
        System.out.println(calculator.calculate(5, 3));   
        System.out.println(calculator.calculate(10, 20)); 
        System.out.println(calculator.calculate(7, 9));   

    }
}
