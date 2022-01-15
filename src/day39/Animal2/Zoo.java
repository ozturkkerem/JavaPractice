package day39.Animal2;

public class Zoo {

    public static void main(String[] args) {


        Bear bear1 = new Bear("koc","Black","Big","Grey",'f',4,true,false,false);
        Cat cat1 = new Cat("Mad","Tekir","Medium","Black",'f',3,true,false,false);
        Crocodile crocodile1 = new Crocodile("slow","north","Medium","Green",'F',2,true,false,false);
        Dog dog1 = new Dog("Kurt","Sivas Kangal","Large","Grey",'M',2,false,true,true);
        Dolphin dolphin1 = new Dolphin("Yunus", "anadolu","medium","Cream",'f',2,false,true,false);

        System.out.println(cat1);



        bear1.drink();
        bear1.hunt();
        cat1.meow();
        System.out.println(dolphin1);



    }

}


/*
	6. Create a class named Zoo:
			Create the objects of each sub classes and

			test all the functions of each objects

            Analyze the relationships between the classes


 */
