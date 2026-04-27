class Person {
    String name;
}

class Student extends Person {
    int studentId;
}

abstract class Animal {
    abstract void makeSound();
}

class Dog extends Animal {
    void makeSound() {
        System.out.println("Bark");
    }
}

interface Shape {
    double calculateArea();
}

class Rectangle implements Shape {
    double width, height;
    public double calculateArea() {
        return width * height;
    }
}