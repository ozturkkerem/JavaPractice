package Day21;
import java.util.Arrays;
public class Initials {
    public static void main(String[] args) {

        String [] names = { "ali velih","bali svelid","cali asveli","rali qwveli","gali veli","ali veli",
                "lali orveli","kali veli","akli velis","kali velif",};

        for (String name:names
             ) {
           char ch= name.charAt(0);
           char last = name.charAt(name.indexOf(" ")+1);

            System.out.println(ch+"."+last);


        }




    }
}
