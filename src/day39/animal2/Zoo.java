package day39.animal2;

import java.util.ArrayList;
import java.util.Arrays;

public class Zoo {

    public static void main(String[] args) {


        Bear bear1 = new Bear("koc","Black","Big","Grey",'f',4,true,false,false);
        Cat cat1 = new Cat("Mad","Tekir","Medium","Black",'f',3,true,false,false);
        Crocodile crocodile1 = new Crocodile("slow","north","Medium","Green",'F',2,true,false,false);
        Dog dog1 = new Dog("Kurt","Sivas Kangal","Large","Grey",'M',2,false,true,true);
        Dolphin dolphin1 = new Dolphin("Yunus", "anadolu","medium","Cream",'f',2,false,true,false);
        Lion lion1 = new Lion("lion","anadol", "medium","grey",'F',2,true,false,false);
        Eagle eagle1 = new Eagle("Sahin","mountain","medium","grey",'M',3,true,false,false);

        Bear bearYoung = new Bear("Teddy","Kutup","Large","White",'F',-99,true,true,false);
        System.out.println(cat1);



        bear1.drink();
        bear1.hunt();
        cat1.meow();
        System.out.println(dolphin1);


        ArrayList<FriendlyAnimal> list = new ArrayList<>();
        list.addAll(Arrays.asList(dog1,dolphin1,cat1));

        for (FriendlyAnimal each : list) {
            System.out.printf( each.getColor());

        }


        ArrayList<WildAnimal> list2 = new ArrayList<>();
        list2.addAll(Arrays.asList(bear1,crocodile1,lion1,eagle1));


        for (WildAnimal each : list2) {
            System.out.println(each.getAge());
        }

        System.out.println(bearYoung);



    }

}


/*
	6. Create a class named Zoo:
			Create the objects of each sub classes and

			test all the functions of each objects

            Analyze the relationships between the classes


 */
