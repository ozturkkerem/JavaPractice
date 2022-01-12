package Day19;
import java.util.Scanner;
public class PerimeterOfSquare {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        while(true){
        System.out.println("Enter the side of the square:");


        int side = scan.nextInt();

        if (side<1) {
            System.out.println("Invalid Entry for the side of the square");
            System.exit(0);
        }
        System.out.println("Area of Square:" + side*side + "\nPerimeter Of Square:" + side * 4);
        System.out.println("Would you like to calculate another Square?");
        String ans = scan.next();

        while (!(ans.equalsIgnoreCase("yes")|| ans.equalsIgnoreCase("no"))){
            System.out.println("Invalid entry please re-enter");

        ans = scan.next();
    }
    if (ans.equalsIgnoreCase("yes")) continue;
        else System.out.println("Thank you for using Cydeo Square Calculator APP");
        break;
    }scan.close();
    }
    }
