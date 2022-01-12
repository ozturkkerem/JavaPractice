package Day07;
import java.util.Scanner;

public class isEligibleCigaret {
    public static void main(String[] args) {
        System.out.println("Please write a age and name");
        Scanner input = new Scanner(System.in);
        byte age = input.nextByte();
        String name = input.next();
        boolean isEligible = (age > 17);

        System.out.println(name + " is eligible to buy a sigara = " + isEligible);



    }

}
