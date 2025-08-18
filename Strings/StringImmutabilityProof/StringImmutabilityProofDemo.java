/*
🚀 Task:

Write a program named StringImmutabilityProof that:
Creates a string using a literal.
Modifies it using += or .concat().
Shows that original string is unchanged by printing identity hash codes before and after the modification.
Also create a string with StringBuilder, modify it, and show its reference doesn't change.
Comment clearly: why Strings are immutable, and why StringBuilder allows in-place modification.

*/

public class StringImmutabilityProofDemo {
    public static void main(String[] args) {
        String name = "Tarang";
        System.out.println("name: " + name);
        System.out.println(System.identityHashCode(name));
        
        name += " Kumar";
        System.out.println("name += \" Kumar\": " + name);
        System.out.println(System.identityHashCode(name));
        
        name = name.concat(" Tanwar");
        System.out.println("name.concat(\" Tanwar\"): " + name);
        System.out.println(System.identityHashCode(name));


        StringBuilder newName = new StringBuilder("Sagar");
        System.out.println("Unmodified newName: " + newName);
        System.out.println(System.identityHashCode(newName));
        newName.append("Tanwar");
        System.out.println("Modified newName: " + newName);
        System.out.println(System.identityHashCode(newName));
    }
}
