package SNments.holidayPractise;
public class evenoddfib {
    public static void main(String[] args) {
        int a =0,b=1,c = 0;
        int n = 9;
        for (int i = 0; i < n; i++) {
            
            c = a+b;
            a = b;
            b = c;
            
            
            
            if (c%2==0) {
                System.out.println(c+ " is even");
            }
            else{
                System.out.println(c +" is odd");
            }
        }
    }
}
