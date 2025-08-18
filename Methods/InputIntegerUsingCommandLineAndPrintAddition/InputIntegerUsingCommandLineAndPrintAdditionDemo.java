public class InputIntegerUsingCommandLineAndPrintAdditionDemo {
    public static void add(int firstNumber, int secondNumber){
        System.out.println("Sum: " + (firstNumber+secondNumber));
    }
    public static void main(String[] args) {
        if(args.length < 2 || args.length > 2){
            System.out.println("Please provide exactly two integer arguments.");
            return;
        }
        try{
            int firstNumber = Integer.parseInt(args[0]);
            int secondNumber = Integer.parseInt(args[1]);
            add(firstNumber,secondNumber);
        } catch (NumberFormatException e){
            System.out.println("Both arguments must be valid integers.");
        }
    }    
}
