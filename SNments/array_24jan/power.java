import java.util.*;


public class power {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("number of elements:");
        int n = sc.nextInt();
        int a[]= new int[n];
        int result;
        System.out.println("enter elements");
        for (int i = 0; i < a.length; i++) {
            System.out.print((i+1)+": ");
            a[i] = sc.nextInt();
        }
        System.out.println("enter power:");
        int power = sc.nextInt();
        System.out.println("========raised to power"+power+"=======");
        for (int i = 0; i < a.length; i++) {
            
            System.out.print((i+1)+": ");
            result = (int) Math.pow(a[i],power);
            System.out.println(result);
        }
    }
}
