package Day11;
import  java.util.Scanner;
public class AgeGroup {
    public static void main(String[] args) {
        System.out.println("age????");
        Scanner input = new Scanner(System.in);
        int age = input.nextInt();
        String result = " ";
        switch (age){

            case 1: case 2:
                result = "infant";
                break;
            case 3: case 4 : case 5:
                result = "Toddler";
                break;
            case 6: case 7: case 8: case 9:
                result = "Kid";
                break;
            case 10: case 11 : case 12:
                result = "Pre-Teen";
                break;
            case 18 : case 19: case 20:
                result = "Young Adult";
                break;
            case 21: case 22 : case 23: case 24 : case 25 : case 26 : case 27 : case 28 : case 29 : case 30 : case 31 : case 32 : case 33: case 34 :
            case 35: case 36 : case 37 : case 38 : case 39:
                result = "Adult";
                break;
            case 40: case 41 : case 42: case 43: case 44: case 45: case 46: case 47: case 48: case 49:
                 result = "Young Middle- Aged Adult";
            break;
            case 50: case 51: case 52: case 53: case 54:
                result = "Middle-Aged Adult";
                break;
            case 55: case 56: case 57: case 58: case 59: case 60: case 61: case 62: case 63: case 64:
                result = "Very Young Senior Citizen";
                break;
                case 65: case 66: case  67:case  68:case  69:case  70:case  71:case  72:case  73:case 74:
                    result = "Young Senior Citizen";
                    break;
            case 75: case 76: case 77: case 78: case 79: case 80: case 81: case 82: case 83: case 84:
                    result = "Senior Citizen";
            default:
                if (age> 150 || age < 1)
                    System.out.println("invalid number");
                else System.out.println("Old Senior Citizen");


        }
        System.out.println(result);






    }
}
