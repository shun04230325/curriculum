public class Check1A {

    public static void main(String[] args) {
        // ①要素数が「5」のint型の配列arrayIntを宣言し、「2,4,6,8,10」で初期化
        int[] arrayInt = {2,4,6,8,10};

        // ②arrayInt配列の中から「8」を表示
        System.out.println(arrayInt[3]);

        // ③和名の動物と英名の動物の配列を作成
        String[] jp_animal = {"犬","猫","ねずみ","うさぎ"};
        String[] en_animal = {"dog","cat","mouse","rabbit"};

        //ループ文を使用して「(和名)は英語で(英名)です」という表示で全種類
        for(int i = 0; i < jp_animal.length; i++){
            System.out.println( jp_animal[i]+"は英語で" + en_animal[i] + "です");
        }
        // ⑤
        for(int i = jp_animal.length - 1;0 <= i; i--){
            System.out.println( jp_animal[i]+"は英語で" + en_animal[i] + "です");
        }
        
        System.out.println("--- 問題⑥ ---");
        // ⑥
        for(int i = 1; i <=  50; i++){
           if(i % 3 == 0 && i % 5 == 0){
                System.out.println("FizzBuzz!!!");
            }else if(i % 3 == 0) {
                System.out.println("Fizz!!!");   
            }else if(i % 5 == 0) {
                System.out.println("Buzz!!!");
            }else{
                System.out.println(i);
            }
        }
                    
        System.out.println("--- 問題⑦ ---");
        // ⑦
        for(int i =0;i <= 50;i += 2){
            if(i % 10 == 0){
                System.out.println(i + "!!!");
            }else{
                System.out.println(i);
            }
        }    

    }

}
