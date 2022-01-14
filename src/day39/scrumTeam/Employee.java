package day39.scrumTeam;

public class Employee {

    String name, jobTitle, companyName;
    int age, id;
    char gender;
    double salary;

    public Employee(String name, String jobTitle, String companyName, int age, int id, char gender, double salary) {
        this.name = name;
        this.jobTitle = jobTitle;
        this.companyName = companyName;
        this.age = age;
        this.id = id;
        this.gender = gender;
        this.salary = salary;
    }

    void work(){
        System.out.println(jobTitle +" "+ name + " is working");

    }

    @Override
    public String toString() {
        return "employee{" +
                "name='" + name + '\'' +
                ", jobTitle='" + jobTitle + '\'' +
                ", companyName='" + companyName + '\'' +
                ", age=" + age +
                ", id=" + id +
                ", gender=" + gender +
                ", salary=" + salary +
                '}';
    }
}


/*
Employee Task:
	1. Create a class named Employee
			Variables:
				name, age, gender, id, jobTitle, salaryName, comapnyName

			Add a constructor to set all the fields

			Methods:
				work()
				toString()


	2. Create ethe following subclasses and override the work method in each subclass:

			1. Tester   ok
			2. Developer   ok
			3. ProductOwner
			4. BusinessAnalyst
			5. ScrumMaster
			6. Teacher
			7. Driver
			9. Pilot

		if any adidtional field or methods needed, please add them


 */
