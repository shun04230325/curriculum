import java.util.Scanner;
import java.util.InputMismatchException;

public class Task1_5_3 {

    public static void main(String[] args){

        try {
            // 身長
            double height;
            // 体重
            double weight;
            // BMI
            double bmi;

            // 身長を入力
            System.out.println("ここに身長を入力してください");
            Scanner sc1 = new Scanner(System.in);
            height = sc1.nextDouble();

            // 体重を入力
            System.out.println("ここに体重を入力してください");
            Scanner sc2 = new Scanner(System.in);
            weight = sc2.nextDouble();

            // ①
            bmi = weight /  (height * height);
            System.out.println(bmi);

            // ②
            if (bmi < 18.5){
            System.out.println("低体重");

            } else if (bmi >= 25){
            System.out.println("肥満");

            } else {
            System.out.println("普通体重");
            }

        } catch (Exception e) {
            // InputMismatchException
            // ※例外処理中ではgetMessage()でエラー内容が取得できないので直接メッセージを作成
            System.out.println("入力値が不正です。");
        }
    }
}