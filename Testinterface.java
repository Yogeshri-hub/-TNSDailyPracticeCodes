public interface Testinterface {

    public static final int a=10;
    int b=40;

    public final static int k =50;

void m1(); // automatic take it as abstract class
void fun();//
}



public class Test implements Testinterface {

    public void m1(){
        System.out.println("i am from method m1");



    }
    public void fun(){
        System.out.println("i am from method fun");
    }

}
public static void main (String [] args){
    Test t = new test ();
    t.fun();
   System.out.println(Testinterface.a);


}