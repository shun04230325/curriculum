package study;

public class Main {
    public static void main(String[] args) {

        int firstValue = 1;
        int secondValue = 0;
        double d = 0.0;
        String str = "";

        // ①

        // ②

        // ③

        // ④

        Animal animal = new Rabbit();
        // ⑤

        // 出力処理
        System.out.println(firstValue + str + secondValue);
        // ⑥

    }
}

abstract class Animal {
    public abstract void run();
}

class Rabbit extends Animal {
    public void run() {
        System.out.println("うさぎが走ります。");
    }
}
