import java.util.Scanner;

public class CallingParameterizedMethodFromMainDemo {
    public void greetUser(String name){
        System.out.println("Hello, " + name + "!");
    }
    public static void main(String[] args) {
        CallingParameterizedMethodFromMainDemo object = new CallingParameterizedMethodFromMainDemo();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        object.greetUser(name);
        scanner.close();
    }
}
