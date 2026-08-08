package question2;

public class ElectricalManagement {

    // 基本料金
    private final int BASIC_CHARGE = 1200;
    // 消費税率
    private final double TAX = 1.1;
    // 電気使用量(kWh)
    private int electricalUsage;
    // 料金単価
    private int fee;

    public ElectricalManagement(int electricalUsage) {
        this.electricalUsage = electricalUsage;
    }

    public int calcElectricalFee() {

        int electricalFee = 0;

        if (this.electricalUsage <= 120) {
            this.fee = 19;
        } else if (this.electricalUsage >= 120 && this.electricalUsage < 300) {
            this.fee = 26;
        } else {
            this.fee = 30;
        }

        // 税抜き価格
        int result = 0;
        // ①料金単価（fee）* 電気使用量(electricalUsage) + 基本料金（BASIC_CHARGE）
         result = (fee * electricalUsage + BASIC_CHARGE);

        // 消費税計算（10％）
        electricalFee = (int) Math.floor(result * TAX);

        // ②
        return electricalFee;
    }

}