import java.util.*;
public class shoppingMall {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double time = sc.nextDouble();
        if (time > 0) {
            System.out.println("good morning!");
        }
        else if (time > 12.0){
            System.out.println("Good afternoon!");
        }
        else if (time > 18.0) {
            System.out.println("Good evening!");
        }
        else{
            System.out.println("Good night!");
        }


        System.out.println(".....Welcome to Lulu mall!.....");

        
    }
}
