package study;

public class Main {

    public static void main(String[] args) {

        String[] names = {"鈴木", "斎藤", "佐藤"};

        for (int i = 0; i < names.length; i++) {
            Employee name = new Employee(names[i]);
            name.print();

        }
    }
}
