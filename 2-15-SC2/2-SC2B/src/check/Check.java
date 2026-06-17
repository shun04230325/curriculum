package check;

import java.util.HashMap;

public class Check {

    // 定数（焼き肉の部位） 
    public static final String GYU_100_CALVI = "カルビ";
    public static final String GYU_101_TONGUE = "タン";
    public static final String GYU_102_LOIN = "ロース";
    public static final String GYU_103_HARAMI = "ハラミ";
    public static final String GYU_104_ZABUTON = "サブトン";

    public static void main(String[] args) {

        // ハッシュマップのキーの基準値
        int startNumber = 100;

        // ①

        // キーと肉のハッシュマップ格納用変数
        HashMap<Integer, String> beafMap1 = new HashMap<>();

        // ②

        System.out.println("----- for文: 焼き肉の部位牛リスト -----");

        // ③

        // 100へ戻す
        startNumber = 100;

        // キーとブランド牛のマップ格納用変数
        HashMap<Integer, String> beafMap2 = new HashMap<>();

        // ④

        System.out.println("----- 拡張for文: 焼き肉の部位リスト -----");

        // ⑤

    }
}
