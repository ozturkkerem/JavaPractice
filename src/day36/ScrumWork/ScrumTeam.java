package day36.ScrumWork;

import day31.Scrum.Developer;

import java.util.ArrayList;
import java.util.Arrays;

public class ScrumTeam {

    private String PO, BA, SM;
    private  int dayOfSprint;

    ArrayList<Tester> testersList = new ArrayList<>();
    ArrayList<Developers> developersList = new ArrayList<>();


    public ScrumTeam(String PO, String BA, String SM, int dayOfSprint) {
       setBA(BA); this.PO = PO;
        setPO(PO);  this.BA = BA;
        setSM(SM); this.SM = SM;
        setDayOfSprint(dayOfSprint);
    }

    public String getPO() {
        return PO;
    }

    public void setPO(String PO) {
        this.PO = PO;
    }

    public String getBA() {
        return BA;
    }

    public void setBA(String BA) {
        this.BA = BA;
    }

    public String getSM() {
        return SM;
    }

    public void setSM(String SM) {
        this.SM = SM;
    }

    public int getDayOfSprint() {
        return dayOfSprint;
    }

    public void setDayOfSprint(int dayOfSprint) {
        this.dayOfSprint = dayOfSprint;


    }



    public void addTester(Tester tester){
            testersList.add(tester);

    }



    public void addDeveloper (Developers developers){
        developersList.add( developers);
    }

    public String toString() {
        return "ScrumTeam{" +
                "PO='" + PO + '\'' +
                ", BA='" + BA + '\'' +
                ", SM='" + SM + '\'' +
                ", dayOfSprint=" + dayOfSprint +
                ", testersList=" + testersList +
                ", developersList=" + developersList +
                '}';
    }
}
