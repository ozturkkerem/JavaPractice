package day36.ScrumWork;

public class MyScrumTeam {

    public static void main(String[] args) {


    Tester tester1 = new Tester("ali","alfa",12312,200000);
    Tester tester2 = new Tester("zeylo","junior",2133,100000);

    Developers developers1 = new Developers("Ayse", "Junior", 2313,10000);


    ScrumTeam scrumTeam1 = new ScrumTeam("Kamil", "Jon", "Jorc",12);

scrumTeam1.addTester(tester1);
scrumTeam1.addTester(tester2);

        System.out.println(scrumTeam1);


    }
}
