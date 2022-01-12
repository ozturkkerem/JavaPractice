package day31.Team;

public class Member {

    public String name;
    public int memberID;
    public char level;

    public Member(String name, int memberID, char level) {
        this.name = name;
        this.memberID = memberID;
        this.level = level;
    }

    public String toString() {
        return "Members{" +
                "name='" + name + '\'' +
                ", membersID=" + memberID +
                ", level=" + level +
                '}';
    }


}
