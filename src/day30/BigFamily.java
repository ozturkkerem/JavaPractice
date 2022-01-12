package day30;

import java.util.Arrays;

public class BigFamily {
    public static void main(String[] args) {

        Family family1 = new Family();
        Family family2 = new Family();
        Family family3 = new Family();
        Family family4 = new Family();


        family1.setInfo("Zehra","Mother",'F',70,true);
        family2.setInfo("Adem","Father",'M',75,true);
        family3.setInfo("Kerem","Son",'M',38,true);
        family4.setInfo("Kemal", "Son",'M',38,true);


    Family [] list = {family1,family2,family3,family4};

        System.out.println(Arrays.toString(list));

        for (Family each : list) {
            if (each.sex == 'M')
                System.out.println(each.name);

        }



    }
}
