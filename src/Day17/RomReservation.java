package Day17;
import jdk.jshell.Snippet;

import java.util.Scanner;
public class RomReservation {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Do you want to have a room?  yes/no");
        String answer = scan.next();
        String bedSize = "";
        while (!(answer.equalsIgnoreCase("yes") || answer.equalsIgnoreCase("no")))
        {
            System.out.println("Invalid answer! Please again in. ");
            answer = scan.next();
        }

        if (answer.equalsIgnoreCase("yes"))
        {
            System.out.println( "What kind of bed do you wanna have?  King => $120 / Queen $100 / Single $80");
            bedSize = scan.next();
            while (bedSize.equalsIgnoreCase("king") &&bedSize.equalsIgnoreCase("Queen") &&bedSize.equalsIgnoreCase("single") )
            {
                System.out.println("Invalid bed size. Please repeat again");
                bedSize = scan.next();
            }

            bedSize = bedSize.equalsIgnoreCase("king")? "$120" : bedSize.equalsIgnoreCase("queen") ? "$100" :
                    bedSize.equalsIgnoreCase("single") ? "$80": "invalid";


            System.out.println(bedSize);


        }
        else if (answer.equalsIgnoreCase("no"))
            System.out.println("Have a nice day");

scan.close();
    }
}
