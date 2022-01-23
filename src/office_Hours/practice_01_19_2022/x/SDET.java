package office_Hours.practice_01_19_2022.x;

public class SDET {

    public SDET(){
        System.out.print(1);
    }

    public SDET(int number){
        this();
        System.out.print(3);
    }

    public SDET(String name){
        this(name.length());
        System.out.print(7);

    }


}

class Team{
    public static void main(String[] args) {

        new SDET ("Aygun");
        new SDET();
        new SDET(4);


    }
}
