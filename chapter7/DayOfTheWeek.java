package chapter6;

public class Rectangle {

    private double length; //No other class can access this length or width.
    private double width; //The constructors/getters and setters allow this
    // class itself to determine how these fields get set and how they are accessed.

    public Rectangle(){
        length = 0;
        width = 0;
    }

    public Rectangle(double length, double width) {
        setLength(length); //Encapsulation.
        setWidth(width);
    }

    public double getLength(){
        return length;
    }

    public void setLength(double length){
        this.length = length;
    }

    public double getWidth(){
        return width;
    }

    public void setWidth(double width){
        this.width = width;

    }
    public double calculatePerimeter(){
        return  (2 * length) + (2 * width);
    }

    public double calculateArea(){
        return length * width;
    }
}
