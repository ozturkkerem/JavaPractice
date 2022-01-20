package day40.states;

public class States {

    private String name, abbreviation,politicalParty, Governor, senator;
    private int population;
    private double stateTax;

    public States(String name, String abbreviation, String politicalParty, String governor, String senator, int population, double stateTax) {
        setName(name);
        setAbbreviation(abbreviation);
        setGovernor(governor);
        setPopulation(population);
        setStateTax(stateTax);
        setPoliticalParty(politicalParty);
        setSenator(senator);

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {

        if (name == null){
            System.err.println("Name can not be null");
            System.exit(1);
        }
        if (name.isEmpty() || name.isBlank()) {
            System.err.println("Invalid name");
            System.exit(1);
        }

        this.name = name;
    }

    public String getAbbreviation() {
        return abbreviation;
    }

    public void setAbbreviation(String abbreviation) {
        if (abbreviation == null){
            System.err.println("Name can not be null");
            System.exit(1);
        }
        if (abbreviation.isEmpty() || abbreviation.isBlank()) {
            System.err.println("Invalid name");
            System.exit(1);
        }



        this.abbreviation = abbreviation;
    }

    public String getPoliticalParty() {
        return politicalParty;
    }

    public void setPoliticalParty(String politicalParty) {

        if (politicalParty == null){
            System.err.println("Name can not be null");
            System.exit(1);
        }
        if (politicalParty.isEmpty() || politicalParty.isBlank()) {
            System.err.println("Invalid name");
            System.exit(1);
        }



        this.politicalParty = politicalParty;
    }

    public String getGovernor() {
        return Governor;
    }

    public void setGovernor(String governor) {

        if (governor == null){
            System.err.println("Name can not be null");
            System.exit(1);
        }
        if (governor.isEmpty() || governor.isBlank()) {
            System.err.println("Invalid name");
            System.exit(1);
        }


        Governor = governor;
    }

    public String getSenator() {
        return senator;
    }

    public void setSenator(String senator) {
        if (senator == null){
            System.err.println("Name can not be null");
            System.exit(1);
        }
        if (senator.isEmpty() || senator.isBlank()) {
            System.err.println("Invalid name");
            System.exit(1);
        }
        this.senator = senator;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {

        if (population <= 0){
            System.out.println("Population can not be less than 0");
            System.exit(1);
        }


        this.population = population;
    }

    public double getStateTax() {





        return stateTax;
    }

    public void setStateTax(double stateTax) {

        if (stateTax < 0){
            System.out.println("State Tax can not be less than 0");
            System.exit(1);
        }

        this.stateTax = stateTax;
    }

    @Override
    public String toString() {
        return "States{" +
                "name='" + name + '\'' +
                ", abbreviation='" + abbreviation + '\'' +
                ", politicalParty='" + politicalParty + '\'' +
                ", Governor='" + Governor + '\'' +
                ", senator='" + senator + '\'' +
                ", population=" + population +
                ", stateTax=" + stateTax +
                '}';
    }
}


/*
States Task:
	1. Create a class named States:
			variables:
				name, abbreviation, politicalParty, Governor, senator, population, stateTax

			Encapsulate all the fields

			Add a constructor that can set all the fields

						Conditions:
							1. name, abbreviation, politicalParty, Governor, and senator can not be null
							2. name, abbreviation, politicalParty, Governor, and senator can not be empty
							3. taxRate can not be negative
							4. Population can not be set to zero or negative

			Methods:
				toString()


	2. Create the following sub classes of States and add any additional fields and methods if necessary:
				1. Virginia
				2. California
				3. Texas
				4. Florida


	3. Create a class named StateObjects
					Create the objects of each sub classes

					test all the functions of each objects

            		Analyze the relationships between the classes

 */
