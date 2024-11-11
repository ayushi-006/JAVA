package oppe_1_practise;

class Parent {// Parent class
    String name;

    // Constructor
    public Parent(String name) {
        this.name = name;
        System.out.println("Parent class constructor called: " + name);
    }

    public void display() {
        System.out.println("Parent name: " + name);
    }
}

// Child class inheriting from Parent
class Child extends Parent {
    int age;

    // Constructor
    public Child(String name, int age) {
        super (name); // Calling the parent class constructor
        this.age = age;
        System.out.println("Child class constructor called: " + name + ", Age: " + age);
    }

    // Overriding display method
    public void display() {
        System.out.println("Child age: " + age);
    }
}
public class SuperExample {
    public static void main(String[] args) {
        // Creating an instance of Child
        Child child = new Child("Alice", 10);
        child.display();
    }
}
