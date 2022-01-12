package day31.Scrum;

public class Developer {
    public String name,JobTitle;
    public double salary;
    public int employeeID;


    public Developer(String name, String jobTitle, double salary, int employeeID) {
        this.name = name;
        JobTitle = jobTitle;
        this.salary = salary;
        this.employeeID = employeeID;
    }

    public void coding(){
        System.out.println(name + " is coding");
    }

    public void unitTesting(){

        System.out.println(name+ " is unit testing");
    }

    public void fixingBug(){

        System.out.println(name + " is fixing the bug");

    }


    public String toString() {
        return "Developer{" +
                "name='" + name + '\'' +
                ", JobTitle='" + JobTitle + '\'' +
                ", salary=" + salary +
                ", employeeID=" + employeeID +
                '}';
    }
}


/*
	create a class called Developer
	          Attributes:
	            name, employeeID, JobTitle, Salary

	          Add A constructor that can set all the fileds

	          Actions:
	            coding(), unitTesting(), fixingBug(), toString()
 */