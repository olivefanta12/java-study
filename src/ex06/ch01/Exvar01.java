package ex06.ch01;

class Animal {
    int i = 1;
    String name = "동물";
}

class Cat extends Animal {
    int i = 2;
    //String name = "고양이";
    int age = 5;
}

class Dog extends Animal {
    int i = 3;
    String name = "강아지";
}


public class Exvar01 {
    public static void main(String[] args) {
        Animal a1 = new Animal();
        System.out.println(a1.i);
        System.out.println(a1.name);

        Dog a2 = new Dog(); // = [dog[v], animal]
        System.out.println("a2: "+a2.i + a2.name);

        Animal a3 = new Dog();
        System.out.println("a3: "+a3.i + a3.name);

        Animal a4 = new Cat();
        System.out.println("a4: "+a4.i + a4.name);
    }
}
