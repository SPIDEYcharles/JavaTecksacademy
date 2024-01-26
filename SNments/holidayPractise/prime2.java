package SNments.holidayPractise;
import java.util.*;

public class prime2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int range = sc.nextInt();
        int count = 0;
        
            
        for (int i = 1; i <=range; i++) {
            
            count =0;
            for (int j = 1; j <= range; j++) {
                if (i%j==0) {
                    
                    count++;
                }
            }
            if (count==2) {
                System.out.println( i + " is a prime number");
            }
            else if (count ==1) {
                
                    System.out.println("1 is neighter prime nor composite");
            }
            else{
                System.out.println( i + " is composite number");
            }
        }
    }
}
