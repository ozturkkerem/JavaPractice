package Day06;
import java.util.Scanner;



public class SoppingListReplit {

    public static void main(String[] args) {
         //Declare 4 String variables: item1, item2, item3, report
        String item1 = " a";
        String item2 = " b";
        String item3 = " c";
        String report = " d";

        //Declare 4 double variables: price1, price2, price3, totalPrice
        double price1 = 0;
        double price2 = 0;
        double price3 = 0;
        double totalPrice = 0;



        //DO NOT TOUCH THESE LINES. TEACHER NEEDS THEM TO TEST YOUR CODE
        System.out.println("Enter Item1 and its price:");
        Scanner sc = new Scanner(System.in);
        item1 = sc.next();
        price1 = sc.nextDouble();

        System.out.println("Enter Item2 and its price:");
        item2 = sc.next();
        price2 = sc.nextDouble();

        System.out.println("Enter Item3 and its price:");
        item3 = sc.next();
        price3 = sc.nextDouble();

        // CONTINUE WRITE YOUR CODE BELOW THIS LINE:

        report = "Item1: " + item1 + " Price: " + price1 + ", " + "Item2: " + item2 + " Price: " + price2 +
            " , " + "Item3: " + item3 + " Price: " + price3;
        totalPrice = price1 + price2 + price3;

        System.out.println(report);
        System.out.println(totalPrice);








    }
}



