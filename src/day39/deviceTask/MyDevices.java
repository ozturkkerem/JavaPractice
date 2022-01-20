package day39.deviceTask;

import java.util.ArrayList;
import java.util.Arrays;

public class MyDevices {


    public static void main(String[] args) {


        Samsung s8 = new Samsung("Galaxy S8",500,true,true);
        Samsung s9 = new Samsung("Galaxy S9",550,true,true);
        Samsung s10 = new Samsung("Galaxy S10",600,true,true);
        Iphone i10 = new Iphone("10",800,true,false);
        Iphone i11 = new Iphone("11",850,true,false);
        Iphone i12 = new Iphone("12",900,true,false);

        Laptop ins14 = new Laptop("Dell","Inspiron 14",600,true,true);
        Laptop ins14_2 = new Laptop("Dell","Inspiron 15",650,true,true);







        ArrayList<Computer> computers = new ArrayList<>();


        ArrayList<Phone> phones = new ArrayList<>();
        phones.addAll(Arrays.asList(s8,s9,s10,i10,i11,i12));

        for (Phone each : phones) {
            System.out.println( each.getBrand()+" "+each.getModel()+" : "+each.getPrice() );
        }

        System.out.println("------------------------------");


        for (Phone each : phones) {
            if (each.getPrice()<700){
                System.out.println(each.getModel());
            }
        }






    }




}

/*

6. Create a class named MyDevices:
			Create the objects of each sub classes and

			test all the functions of each objects

            Analyze the relationships between the classes
 */
