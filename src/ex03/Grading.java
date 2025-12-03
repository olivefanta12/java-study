package ex03;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Grading {
    public static void main(String[] args) {
        int grade;

        Scanner sc = new Scanner(System.in);
        System.out.println("성적을 입력하십시오 :");
        grade = sc.nextInt();

        if (grade >= 90)
            System.out.println("학점 A 점수는 : "+grade);
        else if (grade >= 80)
            System.out.println("학점 B 점수는 : "+grade);
        else if (grade >= 70)
            System.out.println("학점 C 점수는 : "+grade);
        else if (grade >= 60)
            System.out.println("학점 D 점수는 : "+grade);
        else
            System.out.println("학점 F 점수는 : "+grade);
    }

}
