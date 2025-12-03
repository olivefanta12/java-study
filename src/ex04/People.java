package ex04;

public class People {

    //상태는 private 강제성 부여
    private String name; //이름
    private int height; // 키
    private int weight; //무게


    //People () {} == default 생성자

    //생성자 = 객체초기화
    People(String name, int height, int weight) {
        this.name = name;
        this.height = height;
        this.weight = weight;

    }

    //상태 변경
    // public == 어디서든 호출
    public void 밥먹기() {
        weight = weight + 2;
    }

    //상태 확인
    public int getWeight() {
        return weight;
    }
}
