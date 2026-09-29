
// Shape is going to the abstract class
// if a class contain at least one abstract method then that class has to be declared as abstract class
// "abstract" in between the access modifier and the class
// Abstract class can be inherited

public abstract class Shape {

    String color;

    // Abstract class can have constructors
    Shape() {
        this.color = "";
    }

    Shape(String color) {
        this.color = color;
    }

    // Abstract class can have concrete methods (defined methods)
    // You know what the method will do
    public void display() {
        System.out.println("Color is: " + this.color);
    }

    // Circle is-a shape, rectangle is also a shape.
    // Circle and Rectangle have unique formula to calculate the area
    // Area of a rectangle = length x width
    // Area of a circle = PI x (radius)^2

    // calculateArea is an abstract method.Put "abstract " between the acces modifiers and return type
    // Abstract method do not have any definition/
    // Declaring a method - calculateArea()
    // Declaring means it does not provide any definition/implementation
    public abstract void calculateArea();
}