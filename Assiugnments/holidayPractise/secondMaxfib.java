public class secondMaxfib {
    public static void main(String[] args) {
        int a =0,b=1,c = 0,seconLast=0;
        int n = 10;
        for (int i = 0; i < n; i++) {
            
            c = a+b;
            seconLast = a;
            a = b;
            b = c;
            
            
            
            System.out.println(c);

        }
        System.out.println(b-seconLast+" is second max in fib");
    }
}
