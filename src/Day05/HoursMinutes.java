package Day05;

public class HoursMinutes {

    public static void main(String[] args) {

        int inputSecond = 3661;
        int hours = inputSecond / 3600;
        int minutes = (inputSecond / 60) % 60;
        int seconds = inputSecond % 60;


        System.out.println(hours + ":" + minutes + ":" + seconds);



    }
}
