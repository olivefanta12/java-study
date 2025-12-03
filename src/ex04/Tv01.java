package ex04;

public class Tv01 {

    boolean status = false; //상태 (class밑에 적는것이 다 상태)

    void on(){ //상태를 변경하므로 메서드
        System.out.println("tv가 켜졌어요");
        status = true; // 상태변경
    }

    void off(){
        System.out.println("tv가 꺼졌어요");
        status = false;
    }

    public static void main(String[] args) {
        Tv01 tv = new Tv01(); //(Object)객체 생성
        System.out.println(tv.status);

        tv.on();
        System.out.println(tv.status);
        tv.off();
        System.out.println(tv.status);


        //tv.on = true; //상태는 행위를 통해 변경되어야한다.분석을 해야하기 떄문에
        //System.out.println(tv.on);
    }
}
