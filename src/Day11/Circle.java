package Day11;
import java.util.Scanner;

public class Circle {
    public static void main(String[] args) {
        //calculate the area and perimater of the circle
        System.out.println("What is the radius of the circle");
        Scanner scan = new Scanner(System.in);
        double radius = scan.nextDouble();
        scan.close();
        double area = radius * radius * 3.14;
        double perimeter = 2 * radius * 3.14;

        System.out.println("area = " + area);
        System.out.println("perimeter = " + perimeter);
    }
}
