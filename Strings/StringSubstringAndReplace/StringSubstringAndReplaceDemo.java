/*
🚀 Task:

Write a program named StringSubstringAndReplaceDemo that:
Creates a string: "Java Programming Language".
Extracts:
    "Java" using substring().
    "Programming" using substring().
    "Language" using substring().
Uses replace() to replace "Java" with "Kotlin".
Print identityHashCode of the string before and after replace().
Comment clearly: why does replace() not modify the original string? 
*/

public class StringSubstringAndReplaceDemo {
    public static void main(String[] args) {
        String str = "Java Programming Language";
        String subString1 = str.substring(0,str.indexOf(" "));
        String subString2 = str.substring(5, 17);
        String subString3 = str.substring(17, str.length());
        System.out.println("Substring 1: " + subString1);
        System.out.println("Substring 2: " + subString2);
        System.out.println("Substring 3: " + subString3);
        System.out.println("Before modifying hash: " + System.identityHashCode(str));
        str = str.replace("Java", "Kotlin");
        System.out.println("After modifying hash: " + System.identityHashCode(str));
        System.out.println("Modified original string: " + str);
    }
}
