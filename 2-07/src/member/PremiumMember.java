package member;

public class PremiumMember extends NormalMember {

    private int premiumPoint;

    public PremiumMember(String name, int id, int age, int premiumPoint) {
        // ①
        super(name, id, age);
        // ②
        // 自/親クラスのフィールド変数とメソッドの引数を区別できないため【コメントをここに記述】
        // ③
        this.premiumPoint = premiumPoint;
    }

    // ④
    public void printMemberInfo() {
     System.out.println("会員名：" + getName() + " " + "会員ID：" + getId() +  " " + "年齢：" + getAge() + "プレミアム会員ポイント：" + this.premiumPoint);
    }
}