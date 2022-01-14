package day39.scrumTeam;

public class ProductOwner extends Employee{


    public ProductOwner(String name, String jobTitle, String companyName, int age, int id, char gender, double salary) {
        super(name, jobTitle, companyName, age, id, gender, salary);
    }


    @Override
    void work() {
        System.out.println(jobTitle+" "+ name+" is preparing for the meeting");
    }
}
