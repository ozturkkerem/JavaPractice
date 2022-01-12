package Day19;
import java.util.Scanner;
public class RadiusOfTheCircle {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        while (true) {


            System.out.println("Enter the radius of the circle:");
            double radius = scan.nextInt();

            if (radius < 1) {
                System.out.println("Invalid Entry for the radius of the circle");
                System.exit(0);
            }
            System.out.println("Diameter : " + radius * 2 + "\nArea :" + 3.14 * radius * radius + "\nPerimeter :" + 2 * 3.14 * radius);


            System.out.println("Would you like to calculate another circle?");
            String ans = scan.next();

            while (!(ans.equalsIgnoreCase("yes") || ans.equalsIgnoreCase("no"))) {
                System.out.println("re-enter invalid entry");
                ans = scan.next();
            }
            scan.close();
            if (ans.equalsIgnoreCase("yes"))
                continue;
            else break;

        }
    }
}
