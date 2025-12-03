package ex04;

import java.util.Scanner;

public class Protoss {
    static int zealotdamage = 8 ;
    static int dragoondamage = 20;
    String name ;
    int hp;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("공격력 얼마나 올려? : ");
        int damage = sc.nextInt();

        Protoss zealot = new Protoss();
        zealot.name = "질럿";
        zealot.hp = 80;
        int upgrade = (zealot.zealotdamage +damage)*2;
        System.out.println("이름 :" + zealot.name);
        System.out.println("체력 :" + zealot.hp);
        System.out.println("공격력 : " + upgrade);

        System.out.println();
        System.out.println();

        Protoss Dragoon = new Protoss();
        Dragoon.name = "드라군";
        Dragoon.hp = 100;
        int upgrade2 = Dragoon.dragoondamage + (damage*2);
        System.out.println("이름 : "+ Dragoon.name);
        System.out.println("체력 : "+ Dragoon.hp);
        System.out.println("공격력 : " + upgrade2);

    }
}
