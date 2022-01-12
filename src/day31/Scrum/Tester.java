package day31.Scrum;

public class Tester {

    public String name,JobTitle;
    public double salary;
    public int employeeID;

    public Tester(String name, String jobTitle, double salary, int employeeID) {
        this.name = name;
        JobTitle = jobTitle;
        this.salary = salary;
        this.employeeID = employeeID;
    }

    public void smokeTesting(){
        System.out.println(name+" is smoke testing");
    }

    public void creatingTicket(){
        System.out.println(name+" is creating ticker" );
    }

    public void dailyStandUp(){
        System.out.println(name + " is on the meeting");
    }


    public String toString() {
        return "Tester{" +
                "name='" + name + '\'' +
                ", JobTitle='" + JobTitle + '\'' +
                ", salary= $" + salary +
                ", employeeID=" + employeeID +
                '}';
    }
}

/*
reate a class called Tester
	        Attributes:
	            name, employeeID, JobTitle, Salary

	        Add A constructor that can set all the fileds

	        Actions:
	           smokeTesting(),  creatingTicket(), dailyStandUp() toString()

 */