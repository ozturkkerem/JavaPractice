package day31;

public class Rectangle {

    public double length;

    public double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double calculateArea(){

        return length*width;
    }

    public double calculatePerimeter(){
        return 2*(length+width);
    }


    public String toString() {
        return "Rectangle{" +
                "length=" + length +
                ", width=" + width +
                ", Area= " + calculateArea() +
                ", Perimeter =" + calculatePerimeter() +
                '}';
    }
}
