package ex04.game;

public class GameApp {

    //u1 = u2를 공격하는 함수

    //    static void start(Dragoon u1, Zealot u2){
//        u2.hp = u2.hp-u1.attack;
//    }
//
//    static void start(Zealot u1, Zealot u2){
//        u2.hp = u2.hp-u1.attack;
//    }
    static void start(Zealot u1, Zealot u2) {
        u2.hp = u2.hp - u1.attack;
    }

    public static void main(String[] args) {
//        Protoss protoss1 = new Protoss();
//
//        Zealot zealot1 = new Zealot();
//
//        River river1 = new River();
//
//        Dragoon dragoon1 = new Dragoon();


        //1. 드라군의 상태확인
        System.out.println("드라군 :");
//        System.out.println(dragoon1.hp);

        //2. 질럿의 상태확인
//        protoss1.start();
        System.out.println("질럿 : ");
//        System.out.println(zealot1.hp);

        System.out.println("리버 : ");
//        System.out.println(river1.hp);


    }
}
