package day28;

import java.util.ArrayList;
import java.util.Arrays;

public class GradeOf {
    public static void main(String[] args) {

        ArrayList<Integer>  scores = new ArrayList<>();
        scores.addAll( Arrays.asList(100, 90, 75, 85, 65, 85, 55, 45, 73, 73, 35, 47));

        ArrayList<Integer> gradeOfA = new ArrayList<>(); // 90 ~ 100
        ArrayList<Integer> gradeOfB = new ArrayList<>(); // 80 ~ 89
        ArrayList<Integer> gradeOfC = new ArrayList<>(); // 70 ~ 79
        ArrayList<Integer> gradeOfD = new ArrayList<>(); // 60 ~ 69
        ArrayList<Integer> gradeOfF = new ArrayList<>();//0~59;




        for (Integer each : scores) {

            if (each>=90)
                gradeOfA.add(each);
            else if (each>=80)
                gradeOfB.add(each);
            else if (each>=70)
                gradeOfC.add(each);
            else if (each>=60)
                gradeOfD.add(each);
            else
                gradeOfF.add(each);

        }


        System.out.println(gradeOfA);
        System.out.println("Numbers of A " +gradeOfA.size());
        System.out.println(gradeOfB);
        System.out.println("Numbers of B " +gradeOfB.size());
        System.out.println(gradeOfC);
        System.out.println("Numbers of C " +gradeOfC.size());
        System.out.println(gradeOfD);
        System.out.println("Numbers of D " +gradeOfD.size());
        System.out.println(gradeOfF);
        System.out.println("Numbers of F " +gradeOfF.size());
    }



    /*
    8. Given the following arraylists:
		ArrayList<Integer>  scores = new ArrayList<>();
  		scores.addAll( Arrays.asList(100, 90, 75, 85, 65, 85, 55, 45, 73, 73, 35, 47));


  		ArrayList<Integer> gradeOfA = new ArrayList<>(); // 90 ~ 100
        ArrayList<Integer> gradeOfB = new ArrayList<>(); // 80 ~ 89
        ArrayList<Integer> gradeOfC = new ArrayList<>(); // 70 ~ 79
        ArrayList<Integer> gradeOfD = new ArrayList<>(); // 60 ~ 69
        ArrayList<Integer> gradeOfF = new ArrayList<>(); // 0 ~ 59


        Write a program that can count the total numbers of grade A, B, C, D and F
     */
}
