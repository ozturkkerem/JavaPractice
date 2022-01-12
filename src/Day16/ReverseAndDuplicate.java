package Day16;

public class ReverseAndDuplicate {
    public static void main(String[] args) {

        String str = "Wooden Spoon";

        int length = str.length();
        String result = "";

        for (int i = length - 1; i >= 0; i--) {
            result += str.charAt(i);
            System.out.print(str.charAt(i));
        }
        System.out.println(" ");
        System.out.println(result);

        System.out.println("oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo");
        String notDuplicate = "";
        String duplicate = "aabbcc";
        //                  012345678910
        for (int i = 0; i <= duplicate.length() - 1; i++) {
int y=i+1;
            for ( int x=y; x <= duplicate.length()-1; x++){
                if (duplicate.charAt(i)==duplicate.charAt(x)) {

                    notDuplicate += duplicate.substring(i, x);
                }
                else
                    notDuplicate = notDuplicate;
            }


        }
        System.out.println(duplicate);
        System.out.println(notDuplicate);
    }
}
