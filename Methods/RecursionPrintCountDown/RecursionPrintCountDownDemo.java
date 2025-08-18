public class RecursionPrintCountDownDemo {
    public static void printCountdown(int num){
        if(num == 0){
            System.out.println("Blast off!");
            return;
        }
        System.out.println(num);
        printCountdown(num - 1);
    }    
    public static void main(String[] args) {
        printCountdown(10);
    }
}
