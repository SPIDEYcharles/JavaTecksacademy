import java.util.*;

public class leapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();

        if (year%4==0 && !(year%100==0)) 
            System.out.println("leapYear");

        else if(year%100==0 && year%400==0){
                System.out.println("leapYear");
            }
        
        else{
            System.out.println("not leapYear");
        }
    }
}
