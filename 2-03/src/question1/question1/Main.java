package question1;

public class Main {

    public static void main(String[] args) {

        // Stringクラスのhelloとstudy変数の定義
        String hello = "Hello!";
        String study = "Javaカリキュラム";

        // ① 
        Study hj =  new Study();
        // ② 
        hj.printConnectedString("Hello","Javaカリキュラム");
        // ③ 
        hj.introduce();

    }
}
