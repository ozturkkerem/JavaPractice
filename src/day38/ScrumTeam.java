package day38;

import java.util.ArrayList;
import java.util.Arrays;

public class ScrumTeam {

    ProductOwner po;
    BusinessAnalyst ba;
    ScrumMaster sm;
    ArrayList <Tester> testers = new ArrayList<>();
    ArrayList<Developer> developers = new ArrayList<>();

    public ScrumTeam(ProductOwner po, BusinessAnalyst ba, ScrumMaster sm) {
        this.po = po;
        this.ba = ba;
        this.sm = sm;
    }

    public void  addTester(Tester tester){

        testers.add(tester);

    }

    public void addTester(Tester [] testers){

        this.testers.addAll(Arrays.asList(testers));

    }

    public void addDev(Developer developer){
        developers.add(developer);
    }

    public void addDev(Developer [] developers){
        this.developers.addAll(Arrays.asList(developers));
    }

    public String toString() {
        return "ScrumTeam{" +
                "po=" + po +
                ", ba=" + ba +
                ", sm=" + sm +
                ", testers=" + testers +
                ", developers=" + developers +
                '}';
    }
}
