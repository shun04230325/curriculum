package exception;

import java.util.Scanner;

public class ExException {

    // 定数（条件）
    private static final int CONST_EXCEPTION_TRIGER_NULL = 1;
    private static final int CONST_EXCEPTION_TRIGER_ARRAY_OUT_OF_BOUNDS = 2;
    private static final int CONST_EXCEPTION_TRIGER_CAST = 3;

    // 定数（クラスキャストの例外用）
    private static final Object CONST_OBJ_FOR_CLASS_CAST = 100;

    // 定数（メッセージ）
    private static final String CONST_COMMON_INIT_INFO = "\n■2-13:ExException 入力値「1: 続行」／「-1: 終了」";
    private static final String CONST_COMMON_TASK_INPUT_NAME = "以下の例外を発生させるためのパラメーター（1～3）のいずれかを入力してください。\n・1: NullPointerException\n・2: ArrayIndexOutOfBoundsException\n・3: ClassCastException";
    private static final String CONST_COMMON_MSG_ERROR_EXCEPTION = "エラー: 入力値が不正です。";
    private static final String CONST_MSG_NOT_EXCEPTION_TRIGGER = "例外の発生しないパラメーターです。";
    private static final String CONST_MSG_NULLPO = "ヌルポです。";

    public static void main(String[] args) {

        // 変数定義
        int parameter;
        int retryCounter = 0;
        Scanner sc;

        do {

            System.out.println(CONST_COMMON_INIT_INFO);
            sc = new Scanner(System.in);

            try {

                final int execute = sc.nextInt();

                // 早期処理戻し
                if (execute == -1) break;
                // オペレーションエラー
                if (execute != 1) {
                    System.out.println(CONST_COMMON_MSG_ERROR_EXCEPTION);
                    continue;
                }

                System.out.println(CONST_COMMON_TASK_INPUT_NAME);
                parameter = sc.nextInt();

                switch (parameter) {
                    case CONST_EXCEPTION_TRIGER_NULL:

                        // ②

                        break;
                    case CONST_EXCEPTION_TRIGER_ARRAY_OUT_OF_BOUNDS:

                        // ③ 

                        break;
                    case CONST_EXCEPTION_TRIGER_CAST:
                        String castedStrValue = (String) CONST_OBJ_FOR_CLASS_CAST;
                        System.out.println(castedStrValue);
                        break;
                    default:
                        System.out.println(CONST_MSG_NOT_EXCEPTION_TRIGGER);
                        break;
                }

            } catch (NullPointerException e) {
                printException(e);
            } catch (ArrayIndexOutOfBoundsException e) {
                printException(e);

            // ④
            } /*ここへ記述*/ {
                printException(e);
            } finally {
                System.out.println("リトライ回数 = " + retryCounter++);
            }
        } while (true);

        // 終了処理
        sc.close();
        System.out.println("お疲れ様でした！");
    }

    // ①

    /**
     * 例外処理のメッセージを出力
     *
     * @param e 発生した例外
     */
    private static void printException(final Exception e) {
        System.out.println(e);
    }
}
