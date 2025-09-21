/*
Create a class named StudentArrayProfileManager with the following:

Fields in Student:
name, age, course (all private, with validation as before).

Constructors:
Non-parameterized → defaults ("Unknown", 5, "Unassigned").
Parameterized → accepts values and validates them.

Methods in Student:
printProfile() (or override toString()).
Main Method (StudentArrayProfileManager):

Create an array of 5 students.

Use a loop to fill the array:
2 students with parameterized constructor.
3 students with default constructor (then update details using setters).
Print all student profiles using a loop.
*/

import java.util.InputMismatchException;
import java.util.Scanner;

class Student {
    private String name;
    private int age;
    private String course;

    private String validateName(String name){
        if(name == null || name.isBlank()){
            throw new IllegalArgumentException("Name must not be empty.");
        }
        return name;
    }
    private int validateAge(int age){
        if(age <= 0){
            throw new IllegalArgumentException("Age must be positive.");
        }
        return age;
    }
    private String validateCourse(String course){
        if(course == null || course.isBlank()){
            throw new IllegalArgumentException("Course must not be empty.");
        }
        return course;
    }

    public void setName(String name){this.name = validateName(name);}
    public void setAge(int age){this.age = validateAge(age);}
    public void setCourse(String course){this.course = validateCourse(course);}

    public String getName(){return this.name;}
    public int getAge(){return this.age;}
    public String getCourse(){return this.course;}

    public Student(){
        this("Unknown", 1, "Unassigned");
    }
    public Student(String name, int age, String course){
        this.name = validateName(name);
        this.age = validateAge(age);
        this.course = validateCourse(course);
    }

    @Override
    public String toString(){
        return String.format("Name: %s, Age: %d, Course: %s", this.getName(), this.getAge(), this.getCourse());
    } 
}

class StudentInputHelper {
    public static Student readStudentFromInput(Scanner scanner) {
        System.out.print("Enter name: ");
        String name = scanner.nextLine();
        
        int age = 0;
        while (true) {
            try {
                System.out.print("Enter age: ");
                age = scanner.nextInt();
                scanner.nextLine();
                break;
            } catch (InputMismatchException e) {
                System.out.println("Invalid age. Please enter a positive integer.");
                scanner.nextLine();
            }
        }
    
        System.out.print("Enter course: ");
        String course = scanner.nextLine();
    
        return new Student(name, age, course);
    }
}

public class StudentArrayProfileManagerDemo {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int numberOfRecords = 0;
            while(true){
                System.out.print("How many records you want to enter: ");
                numberOfRecords = scanner.nextInt();
                scanner.nextLine();
                if (numberOfRecords <= 0) {
                    System.out.println("Number of records must be positive.");
                    return;
                } else {
                    break;
                }
            }
            
            Student[] studentDetails = new Student[numberOfRecords];
            
            int prefillCount = Math.min(3, numberOfRecords);
            for(int i = 0; i < prefillCount; i++){
                studentDetails[i] = new Student();
            }

            for(int i = prefillCount; i < numberOfRecords; i++){
                studentDetails[i] = StudentInputHelper.readStudentFromInput(scanner);
                System.out.println("-----------------------------------------");
                System.out.println("Record has been successfully added.");
                System.out.println("-----------------------------------------");
            }

            System.out.println("Printing all the records: ");
            for (int i = 0; i < studentDetails.length; i++) {
                System.out.println(studentDetails[i]);
            }

            System.out.println("-------------------------------------------------------------");
            System.out.println("Update the details of first " + prefillCount + " students: ");
            System.out.println("-------------------------------------------------------------");
            for(int i = 0; i < prefillCount; i++){
                studentDetails[i] = StudentInputHelper.readStudentFromInput(scanner);
                System.out.println("-----------------------------------------");
                System.out.println("Record has been successfully updated.");
                System.out.println("-----------------------------------------");
            }

            System.out.println("Printing updated records: ");
            for (int i = 0; i < studentDetails.length; i++) {
                System.out.println(studentDetails[i]);
            }
        } catch (InputMismatchException e) {
            System.out.println("Wrong input. Enter string for name and course and integer for age " + e.getMessage());
        }
    }
}
