public class Task1_5_1 {

    public static void main(String[] args) {

        // ①
        final String CONST_NAME = "MONORI";
        final String CONST_PASS = "MOTIMOTI";

        // 定数（メッセージ）
        final String CONST_MSG_SUCCESS = "ログイン成功です。";
        final String CONST_MSG_ERROR_NAME = "名前に誤りがあります。";
        final String CONST_MSG_ERROR_PASS = "パスワードに誤りがあります。";
        final String CONST_MSG_ERROR_INPUT = "入力情報に誤りがあります。";

        // ②
        String name = "MINORI";
        String pass = "MOTIMOTI";

        // ③
        if (name.equals("MINORI") && pass.equals("MOTIMOTI")){
            System.out.println(CONST_MSG_SUCCESS);
        }else if(name.equals("MINORI")){
            System.out.println(CONST_MSG_ERROR_PASS );
        }else if (pass.equals("MOTIMOTI")){
            System.out.println(CONST_MSG_ERROR_NAME);
        }else{
            System.out.println(CONST_MSG_ERROR_INPUT);
        }

    }
}
