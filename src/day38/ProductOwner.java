package day38;

public class ProductOwner extends Employee{

    public ProductOwner(String name, int age, char gender, int id, String jobTitle, double salary) {
        super(name, age, gender, id, jobTitle, salary);
    }

    public void search(){
        System.out.println("searching for information");

    }



}
