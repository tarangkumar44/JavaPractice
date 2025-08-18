import java.util.Scanner;

public class CallingParameterizedMultiplicationOfTwoNumberMethodFromMainDemo {
    public int multiply(int firstNumber, int secondNumber){
        return firstNumber*secondNumber;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CallingParameterizedMultiplicationOfTwoNumberMethodFromMainDemo object = new CallingParameterizedMultiplicationOfTwoNumberMethodFromMainDemo();
        System.out.print("Enter first number: ");
        int firstNumber = scanner.nextInt();
        System.out.print("Enter second number: ");
        int secondNumber = scanner.nextInt();
        System.out.println("Result: " + object.multiply(firstNumber, secondNumber));
        scanner.close();
    }
}
