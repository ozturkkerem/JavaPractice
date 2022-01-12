package Day07;
import java.util.Scanner;
public class PrintTheMax {
    public static void main(String[] args) {
        System.out.println("Please write two integer :)");
        Scanner input = new Scanner(System.in);
        int x = input.nextInt();
        int y = input.nextInt();

        if(x > y){
            System.out.println(x + " is the maximum number");
        }
        else if( x < y){
            System.out.println(y + " is the maximum number ");
        }

        else{
            System.out.println("Equal");
        }



    }
}
