class Animal {
    public void makeSound(){
        System.out.println("Generic sound Booo");
    }
}

class Dog extends Animal {
    @Override
    public void makeSound(){
        System.out.println("Dog barks");
    }
}

public class MethodOverridingUsingTwoClassDemo {
    public static void main(String[] args) {
        Animal animal = new Animal();
        Animal dog = new Dog();
        animal.makeSound();
        dog.makeSound();
    }
}
