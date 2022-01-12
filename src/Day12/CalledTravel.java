package Day12;

import java.util.Scanner;

public class CalledTravel {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int costOfTicket = 0;
        System.out.println("DO you have a valid passport?  (yes/no)");
        String validPassport = scan.next();

        if(validPassport.equals("yes"))
        {
            costOfTicket = 1000;
            System.out.println("Which country would you like to go?");
            scan.nextLine();
            String country = scan.nextLine();
            System.out.println("How many bag you will have with you?");  //add 50 for each
            int bag = scan.nextInt();
            System.out.println("How many people you will travel with>");
            short people = scan.nextShort();  //-100 discount for each person. max 300
            System.out.println("Name of the people will travel with you:");
            scan.nextLine();
            String passengers = scan.nextLine();
            costOfTicket += people * costOfTicket;
            costOfTicket += bag * 50;

            int discount = (people <= 3)? (int)people *100: 300;
            costOfTicket -= discount;

            System.out.println("YOur ticket is booked to "+ country+"." + "we have charged extra for the " + bag +
                    " bags you are travelling with " + passengers + "so we are giving a discount. your total cost is $" + costOfTicket);


        }
        else
        {

            int passportRenewal = 200;
            System.out.println("When your passport expired");
            int expiredYear = scan.nextInt();
            passportRenewal += (2021 - expiredYear) * 75;
            System.out.println("Which country you would like to travel:");
            scan.nextLine();
            String country = scan.nextLine();
            System.out.println("Are you going to be travelling in the next year: (yes / no");
            String travelling = scan.next();
            passportRenewal += (travelling.equals("yes"))? 100 : 50;

            System.out.println("Looks like your passport has been expired for " + (2021-expiredYear) + " years, but not to worry we will get it ready for you" +
                    " to travel to " + country + "Your total cost has come out to " + passportRenewal);


        }

    }
}
