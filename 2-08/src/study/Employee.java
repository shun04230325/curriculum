package study;

public class Employee {

    // ①

    // ②

    // ③

    public Employee(String data) {

        // ④

        this.data = data;
    }

    public void print() {

        System.out.print(data + "：" + firstValue + "番");
        System.out.println("　" + data + "：" + secondValue + "番");
    }
}
