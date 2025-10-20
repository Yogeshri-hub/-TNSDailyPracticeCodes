import java.util.Scanner;


/*public class Evensum {

    public static void main (String [] args){

        Scanner sc = new Scanner (System.in)

        System.out.println("enter the value of N");

        int N = sc.nextInt();

        int  i = 1 , sum =0;
        while (i<=N){
            if (i % 2==0 ){
                sum+=i;
            }
            i++;


            }
            System.err.println("sum of eevn number 1 to N"+N+"is"+sum);

        }
    }*/
    public class Evensum{


        public static void main(String[] args){

            Scanner sc = new Scanner(System.in);
            int N = sc.nextInt();

            int i = 1 , sum = 0;

            while ( i<N){

            if(i % 2==0){
                sum += i;
            }
            
            i++;
            }

            System.out.println(N + sum);

        }




    }

    

