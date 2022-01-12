package Day09;
import java.util.Scanner;

public class CharacterIdentity {
    public static void main(String[] args) {

        System.out.println("Print write a char character");
        Scanner input = new Scanner(System.in);
        char character = input.next().charAt(0);
        //conditions
        if ((character <= 'Z' && character >= 'A') || (character <= 122 && character >= 97) ){
            System.out.println(character + " is an Alphabetic Character");
        }
        else if (character >= 48 && character <= 57){
            System.out.println(character + " is a Digit Character");
        }
        else{
            System.out.println(character + " is a Special Character");
        }

    }
}
