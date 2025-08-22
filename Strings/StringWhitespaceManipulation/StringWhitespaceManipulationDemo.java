/*
Write a Java program that takes the string
"  Hello,   Java World!   "

Demonstrates the use of the following methods:
trim()
strip()
stripLeading()
stripTrailing()
replaceAll("\\s+", " ") (to normalize multiple spaces)
Prints the original string and all transformed versions side by side.
Also show the hash code difference (via System.identityHashCode()) whenever a new string object is created. 
*/



public class StringWhitespaceManipulationDemo {
    public static void main(String[] args) {
        String message = "  Hello,   Java World!   ";
        System.out.println("Original message: " + message);
        System.out.println("Original identityHashCode: " + System.identityHashCode(message));
        System.out.println("message.trim(): " + message.trim());
        // System.out.println("Original identityHashCode: " + System.identityHashCode(message));
        System.out.println("message.strip(): " + message.strip());
        System.out.println("message.stripLeading(): " + message.stripLeading());
        System.out.println("message.stripTrailing(): " + message.stripTrailing());
        System.out.println("message.replaceAll(\"\\s+\", \" \"): " + message.replaceAll("\\s+", " "));
    }
}







/*
1. message.trim()
Removes leading and trailing whitespace (space, tab, newline, etc.).
But only ASCII whitespace (<= U+0020) is recognized.
So it cuts out the spaces at start and end → "Hello, Java World!".
The 3 spaces between words stay untouched.


2. message.strip()
Similar to trim(), but Unicode-aware.
Uses Character.isWhitespace() to detect all Unicode whitespace characters (including non-breaking spaces, zero-width spaces, etc.).
For your string (plain spaces), the result is same as trim(): "Hello, Java World!".


3. message.stripLeading()
Removes only leading (start) whitespace.
Output: "Hello, Java World! "
Notice trailing spaces at the end are still there.


4. message.stripTrailing()
Removes only trailing (end) whitespace.
Output: " Hello, Java World!"
Notice leading spaces remain.


5. message.replaceAll("\\s+", " ")
\\s = regex for any whitespace character (space, tab, newline, etc.).
\\s+ = one or more consecutive whitespace.
Replaces every run of whitespace with a single space.
So " Hello, Java World! " → " Hello, Java World! "
Extra spaces at start and end become single spaces.
Multiple spaces in the middle shrink to one.



✅ Summary Table

Method	                        What it does	                                            Result here
trim()	                        Removes ASCII leading/trailing spaces	                    "Hello, Java World!"
strip()	                        Unicode-aware trim	                                        "Hello, Java World!"
stripLeading()	                Removes only leading spaces	                                "Hello, Java World!   "
stripTrailing()	                Removes only trailing spaces	                            "  Hello, Java World!"
replaceAll("\\s+", " ")	        Shrinks all whitespace runs into a single space	            " Hello, Java World! "

*/