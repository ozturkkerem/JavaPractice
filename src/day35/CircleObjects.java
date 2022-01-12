package day35;

public class CircleObjects {
    public static void main(String[] args) {

        Circle circle1 = new Circle(-2);
        Circle circle2 = new Circle(6);

       // circle1.setRadius(3);

        circle1.calcArea();

        circle2.calcPerimeter();
        System.out.println(circle1);

    }

}
