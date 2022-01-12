package Day10;
import java.util.Scanner;

public class CampusTime {
    public static void main(String[] args) {
        System.out.println("Please give a number between 1-24 -->");
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();

        if (number >= 8 && number <= 23){
            System.out.println("Open");
        }
        else {
            System.out.println("Closed");
        }

    }
}
