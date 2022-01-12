package Day19;
import java.util.Scanner;
public class PerimeterOfRectangle {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        while  (true){
        System.out.println("Enter the length of the Rectangle:");
        int len = scan.nextInt();
        if (len < 1) {
            System.out.println("Invalid Entry for the length of the rectangle");
            System.exit(0);
        }
        System.out.println("Enter the width of the Rectangle:");
        int width = scan.nextInt();
        if (width < 1) {
            System.out.println("Invalid Entry for the length of the rectangle");
            System.exit(0);

            System.out.println("Area of the Rectangle: " + len * width + "\nPerimeter of rectangle:" + 2 * (len + width));
            System.out.println("Would you like to calculate another Rectangle?");
            String a = scan.next();
            while (!(a.equalsIgnoreCase("yes") || a.equalsIgnoreCase("no"))) {
                System.out.println("Invalid answer. Please re-enter  again");
                a = scan.next();
            }
            if (a.equalsIgnoreCase("yes")) {
                continue;
            }
            System.out.println("Thank you for using Cydeo Rectangle Calculator APP");
            break;
        }
        }
        scan.close();
    }
}