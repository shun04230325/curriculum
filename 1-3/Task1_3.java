public class Task1_3 {

    public static void main(String[] args) {

        // ①
        String[] countries = {"JAPAN","AMERICA","KOREA" };
        // ②
        countries = new String[3];
        System.out.println(countries.length);
        // ③
        String[] strArray = new String[3];
        strArray[0] ="りんご";
        strArray[1] ="もも";
        strArray[2] ="ぶどう";
        // ④
        System.out.println(strArray[1]);
        // ⑤
        // int[]型の配列intArrayの宣言と初期化
        int[] intArray = {10, 20, 30, 40, 50};

        // ⑥
        // intArray内の2番目と5番目の数字の合計を表示する。
        System.out.println(intArray[1] + intArray[4]);

    }
}
