 
 abstract class student1{

    abstract void addi();//body nai hai

}

void fun(){
System.out.println("already body hai");
}

static void m1(){
System.out.println("already body hai");

}


public class student1child extends student1{
    @Override
    void addi(){
        System.out.println("body mil gai abhi")

    }
}

public static void main(String args[]){
    student1child s = new student1child();
     s.addi();

}
    


