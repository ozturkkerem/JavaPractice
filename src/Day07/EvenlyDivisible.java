package Day07;
import java.util.Scanner;
public class EvenlyDivisible {

    public static void main(String[] args) {

        System.out.println("Please write a number evenly divisible by 2, 3, 5");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int remainer2 =number % 2, remainer3 = number % 3 , remainer5 = number %5;

        if (remainer2 == 0){
            System.out.println(number + " is divisible by 2: true");
        }
        else{
            System.out.println(number + " is divisible by 2: false");
        }
        if (remainer3 == 0){
            System.out.println(number + " is divisible by 3: true");
        }
        else{
            System.out.println(number + " is divisible by 3: false");
        }
        if (remainer5 == 0){
            System.out.println(number + " is divisible by 5: true");
        }
        else{
            System.out.println(number + " is divisible by 5: false");
        }







    }
}
