/*
🧪 Task:
Write a Java program to define a class with the following:

A non-parameterized constructor that prints "Student object created."
Three instance variables: name, age, and course.
A method printProfile() that prints the student's details.
In your main() method:
Create one StudentProfilePrinter object.
Assign sample values to the fields.
Call printProfile().
*/

class StudentProfilePrinter {
    private String name;
    private int age;
    private String course;
    public void setName(String name){
        if(name == null || name.isBlank()){
            throw new IllegalArgumentException("Name must not be empty.");
        } else {
            this.name = name;
        }
    }
    public void setAge(int age){
        if(age <= 0){
            throw new IllegalArgumentException("Age must be positive.");
        } else {
            this.age = age;
        }
    }
    public void setCourse(String course){
        if(course == null || course.isBlank()){
            throw new IllegalArgumentException("Course must not be empty.");
        } else {
            this.course = course;
        }
    }
    public String getName(){
        return this.name;
    }
    public int getAge(){
        return this.age;
    }
    public String getCourse(){
        return this.course;
    }
    public StudentProfilePrinter(){
        System.out.println("Student object created.");
        this.age = 1;
        this.name = "Unknown";
        this.course = "Unassigned";
    }
    public void printProfile(){
        System.out.println("Name: " + this.getName());
        System.out.println("Age: " + this.getAge());
        System.out.println("Course: " + this.getCourse());
    }
}

public class StudentProfilePrinterDemo {
    public static void main(String[] args) {
        StudentProfilePrinter student1 = new StudentProfilePrinter();
        student1.setName("Tarang Kumar");
        student1.setAge(22);
        student1.setCourse("BCA");
        student1.printProfile();
    }
}




/*
Enhancements
Add immutability: make fields final and drop setters if Student objects shouldn’t change.

Add record (Java 16+):
public record Student(String name, int age, String course) {}

This automatically gives you constructor, getters, equals, hashCode, toString — much cleaner.
*/
