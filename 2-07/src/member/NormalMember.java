package member;

public class NormalMember {

    private String name;
    private int id;
    private int age;

    public NormalMember(String name, int id, int age) {
        this.name = name;
        this.id = id;
        this.age = age;
    }

    public String getName() {
        return this.name;
    }

    public int getId() {
        return this.id;
    }

    public int getAge() {
        return this.age;
    }   

    public void printMemberInfo() {
        System.out.println("会員名：" + this.name + " " + "会員ID：" + this.id +  " " + "年齢：" + this.age);
    }
}