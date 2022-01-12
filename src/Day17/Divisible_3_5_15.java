package Day17;
import java.util.Scanner;

public class Divisible_3_5_15 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number divisible to 3-5-15");
        int number = scan.nextInt();
        String by15 = "";
        String by5 = "";
        String by3 = "";

        while ( number % 15 != 0) {

            System.out.println("Invalid number. Enter again");
            number = scan.nextInt();
        }

        for (int i = 0; i <=number ; i++) {
            if (i % 15 == 0)
                by15 += i + " ";
            else if (i % 5 == 0)
                by5 += i + " ";
            else if (i % 3 == 0)
                by3 += i + " ";
        }
        System.out.println("Divisible By 15: " + by15 + "\nDivisible By 5: " + by5 + "\nDivisible By 3: " + by3);
    scan.close();
    }
}
