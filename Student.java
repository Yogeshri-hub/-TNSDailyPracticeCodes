public class Student{

    int id ;
    String name;

    Student(int id , String name){

        this.id=id;

        this.name = name;

    }

    void m(){
        System.out.println("oyyy");
    }
    void display(){
         this.m();
        System.out.println(id);
        System.out.println(name);
    }

    public static void main( String [] arg){
        Student s =  new Student(102,"yogi");
        s.display();
    }






}
    

