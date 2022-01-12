package Day24;

public class frequencyOfWord {
    public static void main(String[] args) {

        String sentence = "Java java java python python";
        String word = "java";
        System.out.println(frequency(sentence,word));



    }



    public static int frequency(String sen, String word){
        int count = 0;
        sen=sen.toLowerCase();
        while (sen.contains(word)){
        sen=sen.replaceFirst(word,"");

        count++;
        }

        return count;
    }
    public static boolean isAnagram(String word1, String word2){




        return true;
    }

}
