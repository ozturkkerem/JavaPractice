package Day16;

public class Palindrome {
    public static void main(String[] args) {

        String word = "Level";
        int length = word.length();
        String reversed = "";

        for (int i = length-1; i >= 0; i--) {
            //System.out.println(word.charAt(i));
            reversed += word.charAt(i);
        }
        boolean isPalindrome = reversed.equalsIgnoreCase(word);
        System.out.println(isPalindrome);

    }

}
