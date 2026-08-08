import java.util.Scanner;

/**
 * ピラミッド生成処理
 * スキルチェック1B課題
 *
 */

public class Check1B {

    // 定数（メッセージ）
    private static final String CONST_COMMON_INIT_INFO = "\n■SC1: 入力値「1: 続行」／「-1: 終了」";
    private static final String CONST_COMMON_TASK_INPUT_DANSU = "ピラミッドを作ります。何段のピラミッドを作りますか？";
    private static final String CONST_COMMON_MSG_ERROR_EXCEPTION = "エラー: 入力値が不正です。";
    private static final String CONST_COMMON_MSG_ERROR_END = "お疲れ様でした！";

    public static void main(String[] args) {

        // 変数
        int dan;
        Scanner sc;

        do {
            //「■SC1: 入力値「1: 続行」／「-1: 終了」を表示
            System.out.println(CONST_COMMON_INIT_INFO);

            // 変数scに入力された値を格納
            sc = new Scanner(System.in);

            //入力値のパラメーターチェックな値かどうかチェック
            try {
                final int execute = sc.nextInt();
                // 入力値が「-1」だったら、早期処理戻し
                if (execute == -1) {
                    break;
                }

                // 入力値が「1以外」だったら、やり直し
                if (execute != 1) {
                    continue;
                }

                // ①

                System.out.println(CONST_COMMON_TASK_INPUT_DANSU);

                // 変数名danに入力された値を格納
                dan = sc.nextInt();

                // dan回ループ
                for (int i = 1; i <= dan; i++) {

                    // ②
                    for (int j = dan; j >= i; j-- ){
                        System.out.print(" " );
                    }
                    // ③
                    for (int k = 0; k < i * 2 - 1; k++){
                        System.out.print("*");
                    }
                    // ここで段が切り替わるので改行
                    System.out.println();
                }

                // ④
                System.out.println("これは"+ dan +"段のピラミッドです");

            } catch (Exception e) {
                // InputMismatchException
                // ※例外処理中ではgetMessage()でエラー内容が取得できないので直接メッセージを作成
                System.out.println(CONST_COMMON_MSG_ERROR_EXCEPTION);
            }
        } while (true);
        // 終了処理
        // 「-1」が入力された場合、「お疲れ様でした！」と出力
        sc.close();
        System.out.println(CONST_COMMON_MSG_ERROR_END);
    }
}
