import java.util.*;

public class grading {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int marks = sc.nextInt();
        if(marks>85){
            System.out.println('A');
        }
        else if (marks>70) {
            System.out.println("B");
        }
        else if(marks>55){
            System.out.println("C");
        }
        else if(marks>40){
            System.out.println("D");
        }
        else if (marks>=33){
            System.out.println("E");
        }
        else{
            System.out.println("F");
        }
    }
}
