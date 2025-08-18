public class CallingVariableParameterizedMethodFromMainDemo {
    public static void sumAll(int ...numbers){
        if(numbers.length == 0){
            System.out.println("Sum with no numbers: " + 0);
            return;
        }
        int result = 0;
        for(int number : numbers){
            result += number;
        }
        System.out.println("Sum of " + numbers.length + " numbers: " + result);
    }
    public static void main(String[] args) {
        sumAll(1,2,3,4);
        sumAll(9,8);
        sumAll();
    }
}
