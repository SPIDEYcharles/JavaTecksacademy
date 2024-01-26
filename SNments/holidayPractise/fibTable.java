package SNments.holidayPractise;
public class fibTable {
    public static void main(String[] args) {
        int a =0,b=1,c = 0;
        int n = 10;
        for (int i = 0; i < n; i++) {
            
            c = a+b;
            a = b;
            b = c;
            
            System.out.println("----------------------");
            
            for (int j = 1; j <=10; j++) {
                System.out.println(c +" x "+j+" = "+(c*j));
            }
        }
    }
}
