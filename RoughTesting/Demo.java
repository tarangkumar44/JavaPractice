import java.io.*;
import java.util.*;

public class Demo {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in); 
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("D1.txt"));){
                System.out.print("Enter name: ");
                String name = sc.nextLine();
                oos.writeObject(name);
                System.out.print("Enter surname: ");
                String surname = sc.nextLine();
                oos.writeObject(surname);
        } catch (IOException e) {
            e.printStackTrace();
        }
        try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream("D1.txt"))){
            String name = (String)ois.readObject();
            String surname = (String) ois.readObject();
            System.out.println("Name: " + name);
            System.out.println("Surname: " + surname);
        } catch (IOException | ClassNotFoundException e){
            e.printStackTrace();
        }
    }
}
