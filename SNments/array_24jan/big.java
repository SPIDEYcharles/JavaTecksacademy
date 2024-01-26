import java.util.Scanner;

public class big {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a[] = new int[5];
        int big = 0;
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();

        }

        for (int i = 0; i < a.length; i++) {
            if (big < a[i]) {
                big = a[i];
            }
        }
        System.out.println(big+" is the big number in given array");
    }
}
