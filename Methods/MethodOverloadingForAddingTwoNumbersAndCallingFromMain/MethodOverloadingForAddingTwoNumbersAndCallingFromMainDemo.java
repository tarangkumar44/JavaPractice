import java.util.Scanner;

public class MethodOverloadingForAddingTwoNumbersAndCallingFromMainDemo {
    public static int addNumbers(int firstNumber, int secondNumber){
        return firstNumber+secondNumber;
    }
    public static int addNumbers(int firstNumber, int secondNumber, int thirdNumber){
        return firstNumber+secondNumber+thirdNumber;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int firstNumber = scanner.nextInt();
        System.out.print("Enter second number: ");
        int secondNumber = scanner.nextInt();
        System.out.print("Enter third number: ");
        int thirdNumber = scanner.nextInt();
        System.out.println("Sum of first two numbers: " + addNumbers(firstNumber, secondNumber));
        System.out.println("Sum of all three numbers: " + addNumbers(firstNumber, secondNumber, thirdNumber));
        scanner.close();
    }
}
