package day38;

public class BusinessAnalyst extends Employee{

    public BusinessAnalyst(String name, int age, char gender, int id, String jobTitle, double salary) {
        super(name, age, gender, id, jobTitle, salary);
    }

    void meeting(){

        System.out.println(getJobTitle()+ " "+ getName()+" is in meeting");
    }

}
