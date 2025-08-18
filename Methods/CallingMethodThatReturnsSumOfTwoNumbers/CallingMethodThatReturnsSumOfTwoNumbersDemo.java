import java.util.Scanner;
public class CallingMethodThatReturnsSumOfTwoNumbersDemo {
    public static int addNumbers(int firstNumber, int secondNumber){
        return firstNumber+secondNumber;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int firstNumber = scanner.nextInt();
        System.out.print("Enter the second number: ");
        int secondNumber = scanner.nextInt();
        System.out.println("Sum: " + addNumbers(firstNumber, secondNumber));
        scanner.close();
    }    
}
