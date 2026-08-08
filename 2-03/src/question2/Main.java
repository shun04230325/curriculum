
package question2;

public class Main {

    public static void main(String[] args) {

        // ①
        ElectricalManagement em = new ElectricalManagement(150);
        // ②
        System.out.println("今月の電気代は"+ em.calcElectricalFee() +"円（税込み）です。");   
    }
}
