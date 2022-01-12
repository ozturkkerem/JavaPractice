package day31.Team;

public class Leader {

    public String name;
    public int memberId;
    public char level;

    public Leader(String name, int memberId, char level) {
        this.name = name;
        this.memberId = memberId;
        this.level = level;
    }

    public String toString() {
        return "Leaders{" +
                "name='" + name + '\'' +
                ", memberId=" + memberId +
                ", level=" + level +
                '}';
    }
}
