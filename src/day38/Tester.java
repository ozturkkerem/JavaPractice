package day38;

public class Tester extends Employee {

    public Tester(String name, int age, char gender, int id, String jobTitle, double salary) {
        super(name, age, gender, id, jobTitle, salary);
    }

    public  void testing(){
        System.out.println(getJobTitle()+" " +getName() + "is testing" );
    }


}
