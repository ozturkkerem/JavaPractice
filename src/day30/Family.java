package day30;

public class Family {

    public String name;
    public String title;
    public char sex;
    public int age;
    public boolean marriage;

    public void setInfo(String name, String title, char sex, int age, boolean marriage) {
        this.name = name;
        this.title = title;
        this.sex = sex;
        this.age = age;
        this.marriage = marriage;
    }

    public String toString() {
        return "Family{" +
                "name='" + name + '\'' +
                ", title='" + title + '\'' +
                ", sex=" + sex +
                ", age=" + age +
                ", marriage=" + marriage +
                '}';
    }
}
