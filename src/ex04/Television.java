package ex04;

public class Television {
    int channel;
    int volume;
    boolean onOff;

    public static void main(String[] args) {
        Television myTV = new Television();
        myTV.channel = 7;
        myTV.volume = 10;
        myTV.onOff = true;

        Television yourTV = new Television();
        yourTV.channel = 9;
        yourTV.volume = 12;
        yourTV.onOff = true;

        System.out.println("나의 tv 채널은 : "+myTV.channel);
        System.out.println("나의 tv 볼륨은 : "+myTV.volume);
        System.out.println();
        System.out.println("쟤의 tv 채널은" +yourTV.channel);
        System.out.println("쟤의 tv 볼륨은" +yourTV.volume);
    }
}
