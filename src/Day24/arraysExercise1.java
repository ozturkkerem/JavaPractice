package Day24;

public class arraysExercise1 {
    public static void main(String[] args) {
        String alp = "e";
        int num = 1;
        int[] array ={1,1,1,1,1,2,2};
        String src = "kerek";
        System.out.println("reverse: " + reverse(src));
        System.out.println(palindrome(src));
        System.out.println("frequency of " + num + " in array is "  + frequency(array, num));

    }
    static public String reverse (String word){
        String reWord= "";
        for (int i = word.length()-1; i >= 0; i--) {
            reWord+= word.charAt(i);
        }


        return reWord;
    }
    static public boolean palindrome (String word){
        boolean isPalindrome = false;
        if (!word.equalsIgnoreCase(reverse(word)))
        isPalindrome = false;
        else isPalindrome = true;
        return isPalindrome;
    }
    static public int frequency (int[] array, int num){

        int count = 0;

        for (int i = 0; i < array.length; i++) {
            if (num == array[i])
            count++;

        }
        return count;
    }


}
