class Person {
    private String name;
    private int age;
    private void setName(String name){
        if(name.equals(null)){
            System.out.println("Name was empty and hence set to null");
        }
        this.name = name;
    }
    private void setAge(int age){
        if (age <= 0) {
            System.out.println("Invalid age. Setting to 0.");
            this.age = 0;
        } else {
            this.age = age;
        }
    }
    private String getName(){
        return this.name;
    }
    private int getAge(){
        return this.age;
    }
    public Person(String name, int age){
        setAge(age);
        setName(name);
    }
    public void display(){
        System.out.println("Name: " + getName());
        System.out.println("Age: " + getAge());
    }
}

public class MostBasicOOPDemo {
    public static void main(String[] args) {
        Person person = new Person("Tarang Kumar", 23);
        person.display();
    }
}



/*
Null Check Mistake:
if(name.equals(null))
This will throw a NullPointerException if name is actually null. Correct approach:
if (name == null) {

OR better:
if (name == null || name.trim().isEmpty()) {
    System.out.println("Invalid name provided. Setting name to 'Unknown'");
    this.name = "Unknown";
} else {
    this.name = name;
}


Validation Side-Effect without Enforcement:
Your setAge method warns about bad input but doesn't prevent it:
if(age <= 0){
    System.out.println("Age was either empty or 0. Hence set to 0");
}
this.age = age;

This sets age to the invalid value anyway. You should assign a fallback or throw an error:

this.age = (age <= 0) ? 0 : age;

throw new IllegalArgumentException("Age must be > 0");
*/