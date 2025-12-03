package ex04;

public class TelevisionTest {
    public static void main(String[] args) {
        Television mytv = new Television(7, 10, true);
        mytv.print();

        Television yourtv = new Television(11, 20, true);
        yourtv.print();
    }
}
