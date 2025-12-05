package ex04.game;

public class Protoss {
    String name ;
    int hp;
    int shield;
    int attack;

    public Protoss(String name, int hp, int shield, int attack){
        this.name = name;
        this.hp = hp;
        this.shield = shield;
        this.attack = attack;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getShield() {
        return shield;
    }

    public void setShield(int shield) {
        this.shield = shield;
    }

    public int getAttack() {
        return attack;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    public void start(Protoss u1){
        hp = hp - u1.getAttack();
        System.out.println(hp);

    }
}
