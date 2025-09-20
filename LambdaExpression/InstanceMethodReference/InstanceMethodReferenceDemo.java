/*
Task:
Define a functional interface StringProcessor with a method String process(String input).
Create a class TextUtils with a non-static method toUpperCase(String input) that returns the uppercase version of the input string.
In main, create an instance of TextUtils.
Use an instance method reference (textUtilsInstance::toUpperCase) to implement the StringProcessor interface.
Demonstrate it with three different strings.
💡 Purpose: Practice instance method references (using object’s method instead of static method).
*/

@FunctionalInterface
interface StringProcessor {
    public String process(String input);
}

class TextUtils {
    public String toUpperCase(String input){
        return input.toUpperCase();
    }
}

public class InstanceMethodReferenceDemo {
    public static void main(String[] args) {
        TextUtils textUtils = new TextUtils();
        StringProcessor processor = textUtils::toUpperCase;
        System.out.println(processor.process("Tarang Kumar"));
        System.out.println(processor.process("Rohan Tyagi"));
        System.out.println(processor.process("Tushar Tyagi"));
    }
}
