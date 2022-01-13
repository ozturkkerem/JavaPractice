package day38;

public class Developer extends Employee{

    public Developer(String name, int age, char gender, int id, String jobTitle, double salary) {
        super(name, age, gender, id, jobTitle, salary);
    }

    void coding(){

        System.out.println(getJobTitle()+" "+getName()+" is coding");
    }


}
