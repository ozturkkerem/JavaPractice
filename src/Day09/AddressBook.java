package Day09;
import java.util.Scanner;


public class AddressBook {
    public static void main(String[] args) {
        String[] cities = {"istanbul", "ankara", "rize", "ordu", "giresun" };
        String[] numbers = {"1","2","3","4","5"};

        Scanner input = new Scanner(System.in);

        for (int i = 0; i < cities.length; i++){
            System.out.println(cities[i]);
            System.out.println(numbers[i]);
        }

    }
}
