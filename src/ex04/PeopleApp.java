package ex04;

//OOP : object oriented programing 객체지향프로그램
//1원칙 : 상태는 행위를 통해 변경한다.
public class PeopleApp {
    public static void main(String[] args) {
        People p1 = new People("홍길동", 30, 5);
        People p2 = new People("장보고", 20, 3);

        p1.밥먹기(); // 메서드 (상태변경) * 객체지향의 첫번째
        p1.밥먹기();
        System.out.println(p1.getWeight());

    }
}
