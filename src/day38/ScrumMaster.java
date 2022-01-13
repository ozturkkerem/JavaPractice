package day38;

public class ScrumMaster extends Employee{

    public ScrumMaster(String name, int age, char gender, int id, String jobTitle, double salary) {
        super(name, age, gender, id, jobTitle, salary);
    }


    public void creat(){
        System.out.println(getJobTitle()+" is a good title to have");
    }

}
