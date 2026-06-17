package question1;

import question1.impl.Calculator;

public class Main{

    private static int firstValue = 20;
    private static int secondValue = 15;

    public static void main(String[] args) {
        Calculator c = Calculator.create();
        c.calc(firstValue, secondValue);
    }

}

// ④
// [ここに記述]

