package Day07;

public class Pramit {
    public static void main(String[] args) {


    char p = '#';
    int h = 8;


        for(int i = 0; i < h ; i++) {
            for(int l = 0; l < h-i-1; l++) {
                System.out.print(" ");
            }
            for(int j = 0; j < i + 1; j++) {
                System.out.print(p);
            }
            System.out.println("\n");
        }

    }

}
