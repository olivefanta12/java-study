package ex02;

//import java.util.Scanner;

public class FtoC {
    public static void main(String[] args) {

        //Scanner sc = new Scanner(System.in);
        //System.out.println("화씨온도를 입력하시오 :");
        //double f = sc.nextDouble();

        //double c = (5.0/9) * (f-32);
        //System.out.println("섭씨온도는 " + c);

        //1. 화씨온도 받기 (캐나다 에서 쓰는온도. F)
        double f = 100.0;
        //System.out.println(f);

        //2. 섭씨온도로 변경하기
        double c = 5.0/9 * (f-32);
        //System.out.println(f-32);
        //System.out.println(5/9); = 0 * 68.0 (double)
        //System.out.println(5/9.0);

        //3.출력해서 섭씨온도 확인하기 (37.777)

        System.out.println("섭씨온도는 :"+c);


    }
}
