class parent{
    int a = 10;
    void methods(){
        System.out.println(a);
    }
}
class child extends parent{
    int a=1;
    void methods(){
        super.methods();
    }
}
public class MethodJava{
    public static void main(String duck[]){
        
        // parent b = new child();  //Upcasting parent to child
        // child c = (child)b;      //Downcasting parent to child

        // child c = new child();   //creating a child object
        // parent b = c;            //upcasting child to parent

        parent b = new parent();
        child c = new child();
        c.methods();
        b.methods();
    }
}