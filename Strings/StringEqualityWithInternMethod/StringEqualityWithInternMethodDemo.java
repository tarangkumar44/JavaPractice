public class StringEqualityWithInternMethodDemo {
    public static void main(String[] args) {
        // Example 1:-
        String name1 = new String("Tarang");   // "Tarang" may not be present in the string pool as the literal "Tarang is not use else where till this line"
        String name2 = name1.intern();  // "Tarang" now definitly present in pool due to .intern(); or in other words .intern() makes a copy of "Tarang" in the pool and return the reference to it
        System.out.println("name1 == name2: " + (name1 == name2));
        System.out.println("name1.equals(name2): " + name1.equals(name2));

        System.out.println(System.identityHashCode(name1));
        System.out.println(System.identityHashCode(name2));



        
        
        // Example 2:-
        String name3 = new String("Sagar");        // "Sagar" may not be in pool right at this line
        String name4 = "Sagar";                 // "Sagar" is definetly in pool at this line
        
        System.out.println("name3 == name4: " + (name3 == name4));
        System.out.println("name3.equals(name4): " + name3.equals(name4));
        System.out.println(System.identityHashCode(name3));
        System.out.println(System.identityHashCode(name4));
        
        String name5 = name3.intern();          // returns the reference of the already stored "Sagar" in the pool
        
        System.out.println("name5 == name3: " + (name5 == name3));
        System.out.println("name5 == name4: " + (name5 == name4));
        System.out.println("name5.equals(name3): " + name5.equals(name3));
        System.out.println("name5.equals(name4): " + name5.equals(name4));
        
        System.out.println(System.identityHashCode(name3));
        System.out.println(System.identityHashCode(name4));
        System.out.println(System.identityHashCode(name5));

    }
}
