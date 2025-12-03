package ex04;

public class Box {
    int width;
    int length;
    int height;
    double getVoume(){
        return (double) width*length*height;
    }

    public static void main(String[] args) {
        Box b;
        b = new Box();
        b.width = 20;
        b.length = 20;
        b.height = 30;
        System.out.println("상자의 가로 :"+b.width);
        System.out.println("상자의 세로 :"+b.length);
        System.out.println("상자의 높이 :"+b.height);
        System.out.println("상자의 부피 :"+b.getVoume());
    }
}
