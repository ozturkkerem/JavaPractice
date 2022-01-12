package Day10;
import java.util.Scanner;
public class CrewAndPassenger {
    public static void main(String[] args) {

        System.out.println("Please provide how many people on the ship? (must be 50 & 75 or 100)");
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();

        String peopleOnTheBoat = ((number == 50 || number == 75) ||number == 100)? (number == 50)? "20 crew, 30 passengers" :
                (number == 75)? "25 crew, 50 passengers" : "30 crew, 70 passengers " : "Invalid Number";

        System.out.println(peopleOnTheBoat);



    }
}
