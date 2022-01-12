package day34;

public class CircleObject {
    public static void main(String[] args) {

        Circle circle1 = new Circle();
        circle1.radius = 5;

        Circle circle2 = new Circle();
        circle2.radius = 12;

        circle1.radius = circle2.radius;


        circle2.radius = 10;

        System.out.println(circle1.radius);
        System.out.println(circle2.radius);

    }
}
