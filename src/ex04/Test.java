package ex04;

class A {

    private int a;
    int b;
    public int c;
}
public class Test {
    public static void main(String[] args) {
        A obj = new A();
        obj.b = 10;
        obj.c = 100;
        System.out.println(obj.c);
        System.out.println(obj.b);


    }
}
