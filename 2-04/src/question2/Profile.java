package question2;

public class Profile {

    private String name;
    private int height;
    private String birthday;
    private String sign;
    private String color;

    // ①
    public Profile (String name,int height,String birthday,String sign,String color){
        this.name = name;
        this.height = height;
        this.birthday = birthday;
        this.sign = sign;
        this.color = color;
    }

    public void print() {
        // ②
        System.out.println(name + "の身長は" + height + "で色は" + color +"です。");
        System.out.println("誕生日は" + birthday + "で星座は" + sign + "です。");

    }
}
