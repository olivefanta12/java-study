package ex03;

public class NumberTest01 {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; i <11; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
        //System.out.println("1");
        //System.out.println("2");
        //System.out.println("3");
        for (int j = 20; j >10; j--) {
            System.out.print(j + " ");
        }

        for (int k = 1; k <11; k++) {
            sum = sum+k;
        }
        System.out.println();
        System.out.println(sum);
    }
}
