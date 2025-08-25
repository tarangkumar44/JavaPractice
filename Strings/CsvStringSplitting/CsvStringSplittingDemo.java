/*
🔹 Question:
Write a Java program to split a CSV-style string into values using different approaches:

1. Using split(",") directly.  
2. Using split(",\\s*") to handle commas with optional spaces after them.  
3. Using Pattern + Matcher to extract values (non-comma sequences).  

💡 This will train you in handling delimiter-based input like CSV files, logs, or user-entered data.  
Pay attention to behavior when there are multiple commas or spaces after commas.
*/

import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class CsvStringSplittingDemo {
    public static void main(String[] args) {
        String csv = "Red,Green, Blue ,Yellow,,Black";

        String[] simpleSplit = csv.split(",");
        System.out.println("Printing words with split(\",\"): ");
        for(String word : simpleSplit){
            System.out.println(word);
        }

        String[] regexSplit = csv.split(",\\s*");
        System.out.println("Printing words with split(\",\\\\s*\"): ");
        for(String word : regexSplit){
            System.out.println(word);
        }

        Pattern pattern = Pattern.compile("[^,]+");                // This means: 1 or more characters that are not a comma.
        Matcher matcher = pattern.matcher(csv);
        System.out.println("Printing words with pattern and matcher: ");
        while(matcher.find()){
            System.out.println(matcher.group());
        }
    }
}



/*
1. csv.split(",")

    Splits only on commas.
    It doesn’t trim spaces.
    Input: "Red,Green, Blue ,Yellow,,Black"

    Output:

        Red
        Green
         Blue 
        Yellow

        Black

    (Notice: " Blue " still has spaces, and "" appears because there was ,,).


2. csv.split(",\\s*")

    Regex: ,\\s*
    , → split on comma
    \\s* → followed by zero or more whitespaces

    So:
    " Blue " becomes "Blue" (trailing/leading space after the comma is consumed).
    The double comma ,, still gives you an empty string "".

    Output:
        Red
        Green
        Blue
        Yellow

        Black


3. Pattern + Matcher

    Regex: [^,]+
    [^,] → means "any character that is not a comma"
    + → means "one or more of those"

    So the matcher scans the string, finds continuous runs of non-comma characters, and returns them.
    Example:
        Red (before the first comma)
        Green (before next comma)
        Blue (spaces included because they are not commas!)
        Yellow
        Black
   
    Output:
        Red
        Green
         Blue 
        Yellow
        Black


    ⚠️ Notice the difference: here " Blue " retains spaces because regex didn’t tell it to trim.


4. \\s+ vs \\s*

\\s → means any whitespace character (space, tab, newline).

Quantifiers:

+ → one or more
* → zero or more

So:
\\s+ = must have at least one whitespace
"Hello World" → finds " " between words.
"HelloWorld" → won’t match anything.
\\s* = zero OR more whitespaces
"Hello World" → finds " ".
"HelloWorld" → also matches (at the boundary, because "zero whitespace" is valid).\\s+ vs \\s*
*/
