package Day13;

import java.util.Scanner;

public class AccountNumber {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter account number:");
        String accountNumber = scan.next();

        if (accountNumber.charAt(0) == '2' && 7 == accountNumber.length())
            System.out.println("valid account number");
            else if (accountNumber.charAt(0) == '5' && 10 == accountNumber.length())
            System.out.println("valid account number");
        else System.out.println("invalid account number");
    }
}
