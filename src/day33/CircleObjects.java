package day33;

public class CircleObjects {

    public static void main(String[] args) {

        Circle circle1 = new Circle(3);


        System.out.println(circle1);


      //  circle1.calcArea();
      //  circle1.calcPerimeter();

        System.out.println(circle1.calcArea());
        circle1.printPi();
    }
}
