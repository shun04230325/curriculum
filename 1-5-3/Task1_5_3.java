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
            System.out.println("身長(m)を入力してください。");
            Scanner sc1 = new Scanner(System.in);
            height = sc1.nextDouble();

            // 体重を入力
            System.out.println("体重(kg)を入力してください。");
            Scanner sc2 = new Scanner(System.in);
            weight = sc2.nextDouble();

            // ①
            bmi = "ここに記述";

            // ②

        } catch (Exception e) {
            // InputMismatchException
            // ※例外処理中ではgetMessage()でエラー内容が取得できないので直接メッセージを作成
            System.out.println("入力値が不正です。");
        }
    }
}