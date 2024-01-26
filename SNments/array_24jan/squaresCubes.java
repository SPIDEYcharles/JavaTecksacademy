

public class squaresCubes {
    public static void main(String[] args) {
        int []a = {1,2,3,4,5};
        System.out.println("================     squares   =================");
        for (int i = 0; i < a.length; i++) {
            System.out.println((a[i])*a[i]);
        }
        System.out.println("================      cubes    =================");
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]*a[i]*a[i]);
        }
    }
}
