package Day17;

import java.util.Scanner;

public class InsuranceQuote {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("1-Enter your name: ");
        String name = scan.next();
        System.out.println("2-Enter your gender: ");
        String gender = scan.next();
        while (!(gender.equalsIgnoreCase("man") || gender.equalsIgnoreCase("woman"))) {
            System.out.println("Invalid answer! Enter your gender: ");
            gender = scan.next();
        }
        System.out.println("3-Are you married: ");
        String married = scan.next();
        while (!(married.equalsIgnoreCase("yes") || married.equalsIgnoreCase("no"))) {
            System.out.println("Invalid answer! Enter your married status: ");
            married = scan.next();
        }
        System.out.println("4-Enter your age");
        int age = scan.nextInt();
        while (!(age > 0 && age < 120)) {
            System.out.println("invalid age. Please repeat it again");
            age = scan.nextInt();
        }
        System.out.println("5-how many miles do you drive in a day: ");
        int miles = scan.nextInt();
        while (miles < 5) {
            System.out.println("Invalid miles, Please repeat it again");
            miles = scan.nextInt();
        }
        System.out.println("6- You wants full coverage or liability insurance?");
        String insOr = scan.next();
        while (!(insOr.equalsIgnoreCase("liability") || insOr.equalsIgnoreCase("full coverage"))) {
            System.out.println("Invalid answer. Please choose full coverage or liability");
        }
        System.out.println("7-If you have an accident in past 5 years (Yes/No)");
        String answerAccident = scan.next();
        while (!(answerAccident.equalsIgnoreCase("yes") || answerAccident.equalsIgnoreCase("no"))) {
            System.out.println(" Invalid answer. Please say yes or no");
            answerAccident = scan.next();
        }
        System.out.println("8-Do you have an anti-thief device? yes/no");
        String antiThief = scan.next();
        while ((antiThief.equalsIgnoreCase("yes") || antiThief.equalsIgnoreCase("no"))) {
            System.out.println("Invalid answer. please repeat in yes or no");
            antiThief = scan.next();
        }

        int liability = 0;
        int fullCoverage = 0;
        liability = age < 25 ? 90 : 50;
        liability += miles <10 ? 10 : miles <= 50?  30:50;



        fullCoverage= age<25 ? 160 : 120;
        fullCoverage= miles<10 ? 20 :miles <=50 ? 40 :70;


        int finalBill = insOr.equalsIgnoreCase("liability")? liability : fullCoverage;
       double disThief = antiThief.equalsIgnoreCase("yes")? 0.05 : 0;
       double disAccident = answerAccident.equalsIgnoreCase("yes") ? -0.15 : 0.10;
       double disMarried = married.equalsIgnoreCase("yes") ? 0.05 : 0;

       double discount = disThief + disMarried + disAccident;







        scan.close();
    }


}
