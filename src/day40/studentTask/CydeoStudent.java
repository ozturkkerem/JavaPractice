package day40.studentTask;

public class CydeoStudent extends  Student{

    public CydeoStudent(String name, char gender, int age, int studentId, String fieldOfStudy, String schoolName, char grade, int batchNumber, int groupNumber, String programmingLanguage) {
        super(name, gender, age, studentId, fieldOfStudy, schoolName, grade);
        setBatchNumber(batchNumber);
        setGroupNumber(groupNumber);
        setProgrammingLanguage(programmingLanguage);

            }

    private int batchNumber, groupNumber;
    private String programmingLanguage;


    public int getBatchNumber() {
        return batchNumber;
    }

    public void setBatchNumber(int batchNumber) {

        if (batchNumber < 1){
            System.out.println(batchNumber +  "  Batch number can not be 0 or less");
            System.exit(1);
        }


        this.batchNumber = batchNumber;
    }

    public int getGroupNumber() {
        return groupNumber;
    }

    public void setGroupNumber(int groupNumber) {

        if (groupNumber < 1){
            System.out.println(groupNumber +  "  group number can not be 0 or less");
            System.exit(1);
        }



        this.groupNumber = groupNumber;
    }

    public String getProgrammingLanguage() {
        return programmingLanguage;
    }

    public void setProgrammingLanguage(String programmingLanguage) {
        if (programmingLanguage.isEmpty() || programmingLanguage.isBlank() || programmingLanguage == "null")
        {
            System.out.println("Programming language can not be empty");
            System.exit(1);
        }

        this.programmingLanguage = programmingLanguage;
    }


    public void eat(){

        System.out.println(getStudentId()+" "+ getName()+" is eating while studying " + programmingLanguage );
    }

    public void sleep(){
        System.out.println(getStudentId()+" "+ getName()+" is slept after studying " + programmingLanguage);
    }

    public void drink(){
        System.out.println(getStudentId()+" "+ getName()+" is drunk because of " + programmingLanguage);
    }




    @Override
    public String toString() {
        return "CydeoStudent{" +
                "name='" + getName()  + '\'' +
                ", gender=" + getGender()  +
                ", age=" + getAge()  +
                "studentId=" + getStudentId() +
                ", fieldOfStudy='" + getFieldOfStudy() + '\'' +
                ", schoolName='" + getSchoolName() + '\'' +
                ", grade=" + getGrade() +
                "batchNumber=" + batchNumber +
                ", groupNumber=" + groupNumber +
                ", programmingLanguage='" + programmingLanguage + '\'' +
                '}';
    }


}

/*
	3. CydeoStudent:

						Extra Variables:
							batchNumber, groupNumber, programmingLanguage

						Encapsulate all the fields

						Add a constructor that can set all the fields

								Condition:
									1. batchNumber and groupNumber should not be set to zero or negative
									2. programmingLanguage should not be set to null
									3. programmingLanguage should not empty


						Override the eat, drink and sleep methods (programmingLanguage need to be included)

						Override the toString method:
								name, age, gender, studentId, fieldOfStudy, grade, schoolName, batchNumber, groupNumber, programmingLanguage should be included


				4. Create a class named StudentObjects:

						Create the objects of each sub classes

						test all the functions of each objects

            			Analyze the relationships between the classes
 */
