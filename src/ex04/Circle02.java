package ex04;

public class Circle02 {
    int radius;

    public Circle02 (int radius){
        this.radius = radius;
    }
    public Circle02(){
        this(0);
    }
    double getArea(){
        return 3.14 * radius * radius;
    }

}
