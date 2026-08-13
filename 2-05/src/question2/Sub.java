package question2;

public class Sub extends Super{

    // ① 
    protected void show () {
        System.out.println("サブクラスのメソッドです。");
    }
    // ② 
    protected void introduction() {
        show();
        super.show();
    }

    public static void main(String[] args) {
        // ③ 
        Sub mj = new Sub();
        mj.introduction();
    }
}
