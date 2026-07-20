package question1;

public class Account {

    // フィールド変数
    private String userName;
    private int id;
    private String password;

    // コンストラクタ
    public Account(String userName, int id, String password) {
        this.userName = userName;
        this.id = id;
        this.password = password;
    }

    // ① 
    protected void printAccountInfo(){
        System.out.println("ユーザー名は・・・" +userName);
        System.out.println("ID・・・" + id);
        System.out.println("パスワード・・・" +  password);
    }
}
