/*
Task:
Define a functional interface PersonFactory with a method Person create(String name, int age).
Create a Person class with fields name and age, along with a constructor to initialize them.
In main, use a constructor reference (Person::new) to implement the factory interface.
Create three Person objects using the factory and print their details.
💡 Purpose: Learn constructor references in Java (a powerful way to integrate lambdas with object creation).
*/

@FunctionalInterface
interface PersonFactory {
    public Person create(String name, int age);
}

@FunctionalInterface
interface PersonDisplay {
    public void display();
}

class Person {
    private final String name;
    private final int age;
    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }
    public void display(){
        System.out.println("Name: " + this.name + " Age: " + this.age);
    }
}

public class ConstructorReferenceDemo {
    public static void main(String[] args) {
        PersonFactory factory = Person::new;
        Person[] persons = {
            factory.create("Tarang Kumar", 21),
            factory.create("Sanyam Jain", 25),
            factory.create("Tushar Tyagi", 24)
        };
        for(Person person : persons){
            PersonDisplay personDisplay = person::display;
            personDisplay.display();
        }
    }
}
