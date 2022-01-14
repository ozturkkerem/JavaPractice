package day39.scrumTeam;

import java.util.ArrayList;
import java.util.Arrays;

public class ScrumTeam {


    BusinessAnalyst ba;
    ProductOwner po;
    ScrumMaster sm;

    ArrayList <Tester> testers = new ArrayList<>();
    ArrayList <Developer> developers = new ArrayList<>();


    public ScrumTeam(BusinessAnalyst ba, ProductOwner po, ScrumMaster sm) {
        this.ba = ba;
        this.po = po;
        this.sm = sm;
    }

    public void addTester(Tester tester){
        testers.add(tester);
    }

    public void addTester(Tester[] testers){
        this.testers.addAll(Arrays.asList(testers));
    }

    public void deleteTester( int id){

        testers.removeIf(p -> p.id == id );

    }

    public void addDeveloper(Developer developer){
        developers.add(developer);
    }

    public void addDevelopers(Developer [] developers){
        this.developers.addAll(Arrays.asList(developers));
    }

    public void deleteDevelopers(int id){
        developers.removeIf(p -> p.id == id);
    }





    @Override
    public String toString() {
        return "ScrumTeam{" +
                "ba=" + ba +
                ", po=" + po +
                ", sm=" + sm +
                ", testers=" + testers +
                ", developers=" + developers +
                '}';
    }
}
