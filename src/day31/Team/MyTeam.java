package day31.Team;

import day31.Restaurant.Server;

public class MyTeam {
    public static void main(String[] args) {



        Team team1 = new Team("Oguz","Ali Sen","Lokman Hekim");

        Member member1 = new Member("Aykut", 10,'F');
        Member member2 = new Member("Rustu", 12,'G');
        Member member3 = new Member("Bolic",8,'B');

        Member [] members = {member1,member2,member3};

        team1.addMember(members);

        System.out.println(team1.membersList);


    }






}
