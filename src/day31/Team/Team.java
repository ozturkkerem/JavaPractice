package day31.Team;


import java.util.ArrayList;
import java.util.Arrays;

public class Team {

    public String captain, boss , doctor;

    ArrayList <Member> membersList = new ArrayList<>();
    ArrayList<Leader> leadersList = new ArrayList<>();

    public Team(String captain, String boss, String doctor) {
        this.captain = captain;
        this.boss = boss;
        this.doctor = doctor;
    }

    public void addMember(Member member) {

        membersList.add(member);

    }

    public void addMember(Member[] members){
        membersList.addAll(Arrays.asList(members));

    }

    public void addLeader(Leader leader){

        leadersList.add(leader);
    }

    public void addLeader(Leader[] leaders){

        leadersList.addAll(Arrays.asList(leaders));
    }

    public void terminateMember(int memberID){
        membersList.removeIf(p -> p.memberID == memberID);
    }

    public void terminateLeader(int memberID){

        leadersList.removeIf(p -> p.memberId ==memberID);
    }


    public String toString() {
        return "Team{" +
                "captain='" + captain + '\'' +
                ", boss='" + boss + '\'' +
                ", doctor='" + doctor + '\'' +
                ", membersList=" + membersList +
                ", leadersList=" + leadersList +
                '}';
    }
}
