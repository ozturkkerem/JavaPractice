package Day09;
import java.util.Scanner;

public class ChooseLanguage {
    public static void main(String[] args) {
        //get the number from user
        System.out.println("Please give a number between 1 ~ 5");
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();

        // conditions
        if (number == 1){
            System.out.println("Hello, thank for your call");
        }
        else if (number == 2){
            System.out.println("Hola, gracias para llamar");
        }
        else if (number == 3){
            System.out.println("Merhaba, aradiginiz icin tesekkurler");
        }
        else if (number == 4){
            System.out.println("Privet, spasibo za vash zvonok");
        }
        else if (number == 5){
            System.out.println("Merci ,pour votre appel");
        }



    }
}
