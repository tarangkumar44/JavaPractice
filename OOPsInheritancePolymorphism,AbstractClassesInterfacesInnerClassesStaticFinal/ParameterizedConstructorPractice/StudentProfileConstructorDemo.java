/*
🧪 Task:
Create a class named StudentProfileConstructorDemo with the following:

Three private fields: name, age, course.
A non-parameterized constructor that initializes the fields with safe defaults ("Unknown", 1, "Unassigned").
A parameterized constructor that accepts values for all fields and validates -
    -them (same rules as before: name not empty, age positive, course not empty).
A printProfile() method that prints student details.

In the main() method:
Create one object using the non-parameterized constructor.
Create one object using the parameterized constructor with real values.
Call printProfile() on both.
*/



public class StudentProfileConstructorDemo {
    private String name;
    private int age;
    private String course;

    public StudentProfileConstructorDemo() {
        this("Unknown", 5, "Unassigned");
    }

    public StudentProfileConstructorDemo(String name, int age, String course) {
        this.name = validateName(name);
        this.age = validateAge(age);
        this.course = validateCourse(course);
    }

    private String validateName(String name) {
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("Name must not be empty.");
        }
        return name;
    }

    private int validateAge(int age) {
        if (age < 5) {
            throw new IllegalArgumentException("Age must be greater than 4 years.");
        }
        return age;
    }

    private String validateCourse(String course) {
        if (course == null || course.isBlank()) {
            throw new IllegalArgumentException("Course must not be empty.");
        }
        return course;
    }

    public void setName(String name) { this.name = validateName(name); }
    public void setAge(int age) { this.age = validateAge(age); }
    public void setCourse(String course) { this.course = validateCourse(course); }

    public String getName() { return this.name; }
    public int getAge() { return this.age; }
    public String getCourse() { return this.course; }

    @Override
    public String toString() {
        return String.format("Name: %s, Age: %d, Course: %s", name, age, course);
    }

    public static void main(String[] args) {
        StudentProfileConstructorDemo student1 = new StudentProfileConstructorDemo();
        StudentProfileConstructorDemo student2 = new StudentProfileConstructorDemo("Tarang Kumar", 22, "BCA");
        System.out.println(student1);
        System.out.println(student2);
    }
}





/*
Direct Initialization vs Setters in Constructor:
Reusing setters inside constructor is good for DRY, but it also mixes object creation -
    -with user input validation logging.
Best practice in Java:
Constructors → guarantee valid state or throw exception.
Setters → used only for updating object later.
In real projects, constructors rarely call setters (they directly validate + assign).
*/