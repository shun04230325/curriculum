package question1;

// ①

public class Main extends Calculator {

    public static void main(String[] args) {

        // ②
        System.out.println("plusメソッドの引数が1つ:" + Calculator.plus(10));
        System.out.println("plusメソッドの引数が2つ:" + Calculator.plus(10, 20));
        System.out.println("plusメソッドの引数が3つ:" + Calculator.plus(10, 20, 30));
        
       

    }
}