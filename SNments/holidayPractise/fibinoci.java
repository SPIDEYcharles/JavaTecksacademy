package SNments.holidayPractise;
public class fibinoci {
    public static void main(String[] args) {
        int a =0,b=1,c = 0;
        int n = 9;
        for (int i = 0; i < n; i++) {
            
            c = a+b;
            a = b;
            b = c;
            
            
            
            System.out.println(c);
        }
    }
}
