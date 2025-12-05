package ex04.game;

public class Dragoon extends Protoss {

    public Dragoon(String name){
        super("Dragoon", 100, 100, 20);

        public void start(Protoss hp){
            hp = hp - hp.getAttack();
            System.out.println(hp);

        }
    }

}
