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

public class StringReplaceVsStringBuilderDemo {
    public static void main(String[] args) {
        // --- String (Immutable) ---
        String str = "Java Programming Language";
        System.out.println("Original String: " + str);
        System.out.println("Before modifying hash: " + System.identityHashCode(str));

        // replace() returns a NEW String object
        str = str.replace("Java", "Kotlin");
        System.out.println("Modified String: " + str);
        System.out.println("After modifying hash: " + System.identityHashCode(str));
        System.out.println();

        // --- StringBuilder (Mutable) ---
        StringBuilder sb = new StringBuilder("Java Programming Language");
        System.out.println("Original StringBuilder: " + sb);
        System.out.println("Before modifying hash: " + System.identityHashCode(sb));

        // replace(start, end, replacement) modifies the SAME object
        sb.replace(0, 4, "Kotlin");
        System.out.println("Modified StringBuilder: " + sb);
        System.out.println("After modifying hash: " + System.identityHashCode(sb));
    }
}
