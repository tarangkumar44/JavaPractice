class Printer {
    public void printMessage(){
        System.out.println("Printing from Printer");
    }
}

class ColorPrinter extends Printer {
    public void printMessage(){
        super.printMessage();
        System.out.println("Printing from ColorPrinter");
    }
}

public class MethodOverridingUsingSuperDemo {
    public static void main(String[] args) {
        Printer colorPrinter = new ColorPrinter();
        colorPrinter.printMessage();
    }
}
