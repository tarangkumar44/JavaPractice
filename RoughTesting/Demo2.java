import java.io.*;
import java.util.*;

public class Demo2 {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in);){
                File f = new File("/home/alien/Desktop/JavaPractice/JDBC");
                if(f.isDirectory()){
                    String[] s = f.list();
                    for(String ss : s){
                        System.out.println(ss);
                    }
                }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
