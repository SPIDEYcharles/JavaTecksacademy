import java.util.*;
public class timegreet{
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        double time = sc.nextDouble();
        if(time<12.0 && time>6.0){
            System.out.println("Good morning");
        }
        else if(time>=12.0 && time<16.0){
            System.out.println("Good after noon");
        }
        else if(time>=16.0 && time<20.0){
            System.out.println("Good evening ");
        }
        else if((time>20.0 && time<=24.0 )||(time>0.0 && time < 6.0) ){
            System.out.println("Good night");
        }
        else{
            System.out.println("not the time to greet");
        }
    }
}