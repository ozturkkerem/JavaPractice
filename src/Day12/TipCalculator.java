package Day12;

import java.util.Scanner;

public class TipCalculator {
    public static void main(String[] args) {

        String service1 = "Poor", service2 = "Fair", service3 = "Good", service4 = "Great", service5 = "Excellent";
        Scanner scan = new Scanner(System.in);

        System.out.println("Split? ( yes or no");
        String split = scan.next();

        if (split.equals("yes")) {
            System.out.println("Enter the number of the people");
            int people = scan.nextInt();
            System.out.println("Enter the check amount");
            int check = scan.nextInt();
            System.out.println("How was the service quality?");
            String quality = scan.next();
            double tipPercent = (quality.equals(service1)) ? 0.05 : (quality.equals(service2)) ? 0.10 : (quality.equals(service3)) ? 0.15 : (quality.equals(service4)) ? 0.20
                    : 0.25;
            double totalTip = check * tipPercent;
            int totalPerPerson = check / people;
            double tipPerPerson = totalTip / people;
            System.out.println("Number of people entered: " + people + "\nTotal to pay: " + check + "\nTotal tip: " + totalTip + "\nTotal per person: "
                            + totalPerPerson + "\nTip per person: " + tipPerPerson);

        }
else
{System.out.println("Enter the check amount");

            int check = scan.nextInt();
            System.out.println("How was the service quality?");
            String quality = scan.next();
            double tipPercent = (quality.equals(service1)) ? 0.05 : (quality.equals(service2)) ? 0.10 : (quality.equals(service3)) ? 0.15 : (quality.equals(service4)) ? 0.20
                    : 0.25;
            double totalTip = check * tipPercent;
    System.out.println("Total to pay: " + check + "\nTotal tip: " + totalTip);

        }






    }
}
