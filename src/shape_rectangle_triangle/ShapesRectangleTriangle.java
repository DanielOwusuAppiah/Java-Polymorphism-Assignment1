package shape_rectangle_triangle;

//defining super class shape
 class Shape {
  // Private member variable
private String color;
// Constructor
public Shape (String color) {
this.color = color;
}
@Override
public String toString() {
return "Shape of color=\"" + color + "\"";
}
// All shapes must has a method called getArea()
public double getArea() {
System.out.println("Shape unknown! Cannot compute area!");
return 0; // Need a return to compile the program
}
}
class Rectangle extends Shape {
// Private member variables
private int length;
private int width;
// Constructor
public Rectangle(String color, int length, int width) {
super(color);
this.length = length;
this.width = width;
}
@Override
public String toString() {
return "Rectangle of length=" + length + " and width=" + width + ",subclass of " + super.toString();
}
@Override
public double getArea() {
return length*width;
}
}   
  // Define Triangle, subclass of Shape
class Triangle extends Shape {
// Private member variables
private int base;
private int height;
// Constructor
public Triangle(String color, int base, int height) {
super(color);
this.base = base;
this.height = height;
}
@Override
public String toString() {
return "Triangle of base=" + base + " and height=" + height + ",subclass of " + super.toString();
}
@Override
public double getArea() {
return 0.5*base*height;
}
}


public class ShapesRectangleTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape r = new Rectangle("Yellow", 10, 5);
		System.out.println(r);
		System.out.println("Area is " +r.getArea());
		Shape t = new Triangle("Green", 8, 5);
		System.out.println(t);
		System.out.println("Area is " + t.getArea());


	}

}
