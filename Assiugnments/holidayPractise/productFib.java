public class productFib {
    public static void main(String[] args) {
        int a = 0,b = 1,c = 0,secL = 0;
        int n = 10;
        long prod = 1;
        for (int i = 0; i < n; i++) {
            
            c = a+b;
            secL = a;
            a = b;
            b = c;
            prod*=c;
            
            
            
        }
        System.out.println(prod);
    }
}
