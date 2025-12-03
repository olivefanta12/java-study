package ex02;

public class Type01 {
    public static void main(String[] args) {
        // +, -, *, /
        int a1 = 10; //4Byte
        double a2 = 1.2; //8Byte

        double sum1 = a1 + a2; // 4byte + 8byte + 8bye = 총 20byte 사용
        System.out.println(sum1);

        int sum2 = (int)a2; //명시적 형변환 - 다운캐스팅
        System.out.println(sum2);

        double sum3 = a1;
        System.out.println(sum3); // call by value
                                  // 묵시적 형변환 - 업캐스팅
                                  
        byte a3 = (byte)300;
        System.out.println(a3); // 최대값을 넘어서 남은수 44가 출력
        
    }
}
