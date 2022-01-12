package Day10;
import java.util.Scanner;
public class Loans {
    public static void main(String[] args) {
        System.out.println("How much salary?\nHow much credit score?");
        Scanner input = new Scanner(System.in);
        int salary = input.nextInt();
        int creditScore = input.nextInt();

        String result = (salary > 60000 && creditScore > 650)? "Loan Approved" : "Loan Denied";

        System.out.println(result);

    }

}
