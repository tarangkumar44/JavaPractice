/*
🔹 Question:
Write a Java program to split a sentence into words using different approaches:

Using split(" ") (simple space).
Using split("\\s+") (regex whitespace).
Using Pattern + Matcher to extract words (regex word boundary).
Compare behavior when multiple spaces, tabs, or newlines are present.
💡 This will train you in string splitting vs regex tokenization (important for parsing logs, input data, backend requests). 
*/

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringWordSplittingDemo {
    public static void main(String[] args) {
        String sentence = "The quick brown\tfox jumps\nover a lazy dog.";
        
        String[] simpleSplit = sentence.split(" ");
        System.out.println("Words found using splity(\" \"): ");
        for(String word : simpleSplit){
            System.out.println(word);
        }
        
        String[] splitRegx = sentence.split("\\s+");
        System.out.println("Words found using split(\"\\s+\"): ");
        for(String word : splitRegx){
            System.out.println(word);
        }
        
        Pattern pattern = Pattern.compile("\\S+");
        Matcher matcher = pattern.matcher(sentence);
        System.out.println("Words found using Pattern & Matcher:");
        while(matcher.find()){
            System.out.println(matcher.group());
        }
    }
}




/*
What’s happening in splitRegx

"\\s+" is a regular expression (regex).
\s = whitespace character (space, tab, newline, etc.).
+ = 1 or more occurrences.

Regex string – the "rule" for what you want to find.
"\\s+" = whitespace(s)
"\\S+" = non-whitespace (words)
"[A-Za-z]+" = only letters


So:
sentence.split("\\s+");
splits the string on any sequence of whitespace (not just a single " " space).

Example
    Sentence:
    "The   quick   brown fox"

    split(" ") → gives empty strings when multiple spaces exist
    → [The, , , quick, , , brown, fox]

    split("\\s+") → collapses consecutive whitespaces into one
    → [The, quick, brown, fox] ✅








What’s happening in Pattern + Matcher:

    Pattern.compile("\\S+")
    \S = non-whitespace                                 // There is a difference between //s+ and //S+. //s+ means whitespaces and //S+ means non whitespaces characters or words
    + = 1 or more characters
    → matches each word block.

    matcher.find() iterates over matches.
    matcher.group() returns the actual word.


👉 split("\\s+") is good for quick splitting.
👉 Pattern + Matcher gives more control (e.g., filtering, positions, advanced extraction).

Pattern = a cookie cutter (shape definition).
Matcher = putting that cutter on dough (the sentence).
find() = moving cutter around, checking where it fits.
group() = the actual cookie you cut out (matched substring).
*/
