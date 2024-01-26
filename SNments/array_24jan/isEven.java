// package SNments.array_24jan;
import java.util.*;
public class isEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a[]=new int[5];;
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }
        for (int i = 0; i < a.length; i++) {
            if (a[i]%2==0) {
                System.out.println(a[i]+" is even");
            }
            else{
                System.out.println(a[i]+" is odd");
            }
        }

    }
}
