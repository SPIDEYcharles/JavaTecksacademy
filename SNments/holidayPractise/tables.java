package SNments.holidayPractise;


public class tables{
    public static void main(String[] args) {
        
        for(int n=1; n<=10; n++){
            System.out.println("----------------"+n);
            for (int i = 1; i <= 20; i++) {
                System.out.println(n +"x"+i+"="+(n*i));
            }
        }
    }
}