package day39.scrumTeam;

public class ScrumMaster extends Employee{

    public ScrumMaster(String name, String jobTitle, String companyName, int age, int id, char gender, double salary) {
        super(name, jobTitle, companyName, age, id, gender, salary);
    }

    @Override
    void work() {
        System.out.println(jobTitle+" "+ name+" is organising a scrum meeting");
    }
}
