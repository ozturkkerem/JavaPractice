package day31.Scrum;

public class MyScrumTeam {
    public static void main(String[] args) {

        Tester tester1 = new Tester("farangez","QA",100000,15122);
        Tester tester2 = new Tester("kerem","Sdet",100000,13462);
        Tester tester3 = new Tester("habip","QA",100000,11562);
        Tester tester4 = new Tester("alex","Sdet",150000,11432);
       // Tester tester5 = new Tester("alex","Sdet",100000,12343);


        Developer developer1 = new Developer("Olga","Java Developer",120000,20112);
        Developer developer2 = new Developer("Aygun","Java Developer",150000,20321);
        Developer developer3 = new Developer("Tunc","Java Developer",100000, 20123);
        Developer developer4 = new Developer("Sinem","Java Developer",200100,20004);
        Developer developer5 = new Developer("Gizem","Junior",125000,20032);

        ScrumTeam scrumTeam1 = new ScrumTeam("Mahda","hulya","Damla",10);

        Tester[] testers = {tester1,tester2,tester3,tester4};
        Developer[] developers = {developer1,developer2,developer3,developer4,developer5};
        scrumTeam1.addTesters(testers);
        scrumTeam1.addDevelopers(developers);



       scrumTeam1.removeTester(20112);
        System.out.println(scrumTeam1);
    }
}


/*

	create a class called MyScrumTeam:
	                    1. create an array of Testers and add the testers from your group
	                    2. create an array of developers add the developers from your group
	                    3. create an object of ScrumTeam and store the testers & developers above to the scrum team
 */