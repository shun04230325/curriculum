package study;

import java.util.Date;

public class Study {

    // フォーマット
    private static final String TIME_FORMAT = "yyyy/MM/dd HH:mm:ss";

    public static void main(String args[]) {

        // Dateクラスのインスタンスを生成
        Date now = new Date();

        // ①

        // ②

        // ③

        // うるう年判定
        printLeapYear(ldt.getYear());

        // ④

        // うるう年判定
        printLeapYear(ldtOf.getYear());
    }

    /**
     * うるう年判定
     * @param year
     */
    private static void printLeapYear(final int year) {
        String msg = year + "年は、";
        boolean isLeapYear = false;
        if (year % 4 == 0) {
            if ((year % 100) == 0) {
                if ((year % 400) == 0) {
                    isLeapYear = true;
                }
            } else {
                isLeapYear = true;
            }
        }
        msg += isLeapYear ? "うるう年です。" : "うるう年ではありません。";
        System.out.println(msg);
    }
}
