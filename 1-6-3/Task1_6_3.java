import java.util.Arrays;

public class Task1_6_3 {

    public static void main(String[] args) {
        int[] numbers = new int[100];
        int i = 0;
        int j = 99;

        // numbers[0] =0;
        // numbers[1] = 1;
        // numbers[2] = 2;
        // ①
        while (i<100) {
            numbers[i]=i;
            i++;
        }
       // System.out.println(Arrays.toString(numbers));
         // ②
         while (j >= 1) {
             System.out.print(j + "　");
            j--;
         }
        
        // }

    }
}
