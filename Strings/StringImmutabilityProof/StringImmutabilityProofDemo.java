public class StringImmutabilityProofDemo {
    public static void main(String[] args) {
        String name = "Tarang";
        System.out.println("name: " + name);
        System.out.println(System.identityHashCode(name));
        
        name += " Kumar";
        System.out.println("name += \" Kumar\": " + name);
        System.out.println(System.identityHashCode(name));
        
        name.concat(" Tanwar");
        System.out.println("name.concat(\" Tanwar\"): " + name);
        System.out.println(System.identityHashCode(name));


        StringBuilder newName = new StringBuilder("Sagar");
        System.out.println("Unmodified newName: " + newName);
        System.out.println(System.identityHashCode(newName));
        newName = new StringBuilder("Hello");
        System.out.println("Modified newName: " + newName);
        System.out.println(System.identityHashCode(newName));
    }
}
