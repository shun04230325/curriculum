package study;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Study {

    public static final String SHOP_SHOHIN_00 = "バナナ";
    public static final String SHOP_SHOHIN_01 = "牛乳";
    public static final String SHOP_SHOHIN_02 = "豚肉";
    public static final String SHOP_SHOHIN_03 = "コロッケ";

    public static void main(String args[]) {

        // ①
        List<String> shohinList = new ArrayList<String>();

        // ② 
        // [コメントをここへ記述]
        HashMap<String, Integer> shopMap = new HashMap<String, Integer>();
        shopMap.put(shohinList.get(0), 125);
        shopMap.put(shohinList.get(1), 180);
        shopMap.put(shohinList.get(2), 350);
        shopMap.put(shohinList.get(3), 100);

        // ③

    }
}