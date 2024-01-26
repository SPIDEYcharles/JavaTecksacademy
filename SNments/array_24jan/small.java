
import java.util.Scanner;

public class small {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a[] = new int[5];
        int small ;
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
            
        }
        small = a[0];

        for (int i = 0; i < a.length; i++) {
            if (small > a[i]) {
                small = a[i];
            }
        }
        System.out.println(small+" is the smaller number in given array");
    }
}
