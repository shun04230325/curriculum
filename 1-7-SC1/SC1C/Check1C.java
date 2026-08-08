public class Check1C {

    public static void main(String[] args) {

        System.out.println("--- 問題1-1 ---");

        int[] arrayInt = { 2, 3, 5, 7, 11, 13, 17, 19, 23 };

        // 問題1-1 配列「arrayInt」の要素数を出力してください。
        System.out.println(arrayInt.length);

        System.out.println("--- 問題1-2 ---");
        // 問題1-2 配列「arrayInt」の任意の要素を「100」に変更しその要素を表示してください。
        arrayInt[4] =  100;
        System.out.println(arrayInt[4]);

        System.out.println("--- 問題1-3 ---");
        /*
         * 問題1-3 for文またはwhile文を使用して、配列「arrayInt」の合計値を表示してください。 また、合計値の変数名は「sum」にしてください。
         */int sum = 0;

            for(int i = 0; i < arrayInt.length; i++){
                sum = sum + arrayInt[i];
            }
            System.out.println(sum);

        System.out.println("--- 問題2-1 ---");
        /*
         * 問題2-1 下記に記述されている配列「oranges」はそれぞれのオレンジの重さ(ｇ)を格納した配列です。
         * for文またはwhile文を使って、このオレンジの中から「52ｇ」以上かつ「58ｇ」以下の
         * オレンジだけを出荷するときに、何個出荷できるのかを表示してください。
         */
        // 【for文の場合】
        int[] oranges = { 52, 59, 42, 51, 39, 48, 45, 57, 56, 48, 54, 60, 54, 56, 55, 51, 44, 49, 63, 44 };
        // 出荷数
        int shipping = 0;
            for(int i = 0;i < oranges.length; i++){
                if(oranges[i] >= 52 && oranges[i] <= 58){
                    shipping++;
                }
            }
            System.out.println(shipping);
            
            System.out.println("--- 問題2-2 ---");
            /*
            * 問題2-2 以下の条件に沿って表示されるようにしてください。 条件① 配列「oranges」の平均が52ｇ以上の場合「豊作」と表示してください。 条件②
            * 配列「oranges」の平均が51ｇ以下の場合「不作」と表示してください。
            * 
            */
           // 合計値
           int arraySum = 0;
           for (int i = 0; i < oranges.length; i++){
                arraySum = arraySum + oranges[i];
           }
           int heikinnti = arraySum / oranges.length;

           //System.out.println(heikinnti);
           if(heikinnti >= 52){
            System.out.println("豊作");
           }else if(heikinnti <=51 ){
            System.out.println("不作");
           }


    }

}