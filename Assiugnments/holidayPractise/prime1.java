import java.util.Scanner;

public class prime1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean num = true;
        
        for (int i = 2; i < n; i++) {
            if(n%i==0){
                num = false;
            }
        } 
        if(num){
            System.out.println("prime");
        }
        else{
            System.out.println("not prime");
        }
    }
}
