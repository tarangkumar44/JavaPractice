public class StringLiteralVsNewKeywordDemo {
    public static void main(String[] args) {
        String fruitName1 = "Apple";
        String fruitName2 = "Apple";
        String vegetableName1 = new String("Potato");
        String vegetableName2 = new String("Potato");
        
        // Both point to the same object in the String pool:-
        System.out.println("fruitName1 == fruitName2: " + (fruitName1 == fruitName2));
        System.out.println("fruitName1.equals(fruitName2): " + (fruitName1.equals(fruitName2)));
        
        // Different heap objects, even though values are same:-
        System.out.println("vegetableName1 == vegetableName2: " + (vegetableName1 == vegetableName2));
        System.out.println("vegetableName1.equals(vegetableName2): " + (vegetableName1.equals(vegetableName2)));
        
        // Hash Code to verify the above comments:-
        System.out.println(System.identityHashCode(fruitName1));
        System.out.println(System.identityHashCode(fruitName2));
        System.out.println(System.identityHashCode(vegetableName1));
        System.out.println(System.identityHashCode(vegetableName2));
    }
}



/*
🔍 WHY fruitName1 == fruitName2 is true?
Because both are string literals, and Java interns them automatically.

    📌 Explanation:
    String literals (like "Apple") are stored in a special memory area called the String Constant Pool.

    When you write:-
    String fruitName1 = "Apple";
    String fruitName2 = "Apple";
    
    Java sees "Apple" already exists in the pool, so it reuses the same object. Hence:

    fruitName1 == fruitName2 // true → same reference
    
    But when you do:

    String vegetableName1 = new String("Potato");
    String vegetableName2 = new String("Potato");
    
    new String("Potato") explicitly creates a new object in heap, regardless of whether "Potato" exists in the pool or not.

    So:

    vegetableName1 == vegetableName2 // false → different heap objects
    .equals() checks value, so both are true.
 */
