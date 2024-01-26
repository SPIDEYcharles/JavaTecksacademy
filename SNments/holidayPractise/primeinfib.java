package SNments.holidayPractise;
public class primeinfib {
    public static void main(String[] args) {
        int a =0,b=1,c = 0;
        int n = 10;
        for (int i = 0; i < n; i++) {
            
            c = a+b;
            a = b;
            b = c;
            
            
            int count =0;
            for (int j = 1; j <= c; j++) {
                if (c%j==0) {
                    count++;
                }
            }
            if (count==2) {
                System.out.println(c);
            }
        }
    }
}
