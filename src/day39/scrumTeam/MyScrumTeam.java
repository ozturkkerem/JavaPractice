package day39.scrumTeam;

import java.util.ArrayList;

public class MyScrumTeam {


    public static void main(String[] args) {





        String x = "HMart";

        BusinessAnalyst ba = new BusinessAnalyst("Kemal","Business Analyst","HMart",32,101,'M',100000);
        ProductOwner po = new ProductOwner("Kenan","Product Owner","Hmart",32,102,'M',100000);
        ScrumMaster sm = new ScrumMaster("Ayse","Scrum Master","HMart",35,103,'F',90000);


        Tester tester1 = new Tester("ali","sdet",x,32,104,'M',90000);
        Tester tester2 = new Tester("Veli","sdet",x,43,107,'M',90000);
        Tester tester3 = new Tester("Nermin","sdet",x,43,105,'F',90000);
        Tester tester4 = new Tester("Birt","sdet",x,43,109,'F',90400);

        Tester [] testers = {tester2,tester3, tester4};




        ScrumTeam hMart = new ScrumTeam(ba,po,sm);

        hMart.addTester(tester1);
        hMart.addTester(testers);

        System.out.println( hMart.testers);





    }






}
