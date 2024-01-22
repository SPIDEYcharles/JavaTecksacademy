public class swapping {
    public static void main(String[] args) {
        int a = 2;
        int b = 3;
        // int temp;
        // temp = a;
        // a = b;
        // b = temp;
        a = a + b;
        b = a-b;
        a = a-b;
        System.out.println(a+" "+b);
    }
}
