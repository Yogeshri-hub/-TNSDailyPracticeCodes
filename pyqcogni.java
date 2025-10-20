
import java.util.Scanner;
public class Main
{
    public static void main (String[]args)
    {
        int totalprice;
        Scanner sc = new Scanner (System.in);
System.out.print ("Enter the no of pizzas bought:");
int pizza = sc.nextInt ();

System.out.print ("Enter the no of puffs bought:");
int puffs = sc.nextInt ();

System.out.print ("Enter the no of cool drinks bought:");
int coolDrinks = sc.nextInt ();

int pizzaa = Math.abs (pizza) * 100;
int puffss = Math.abs (puffs) * 20;
int coolDrinkss = Math.abs (coolDrinks) * 10;

System.out.println ("Bill Details");
System.out.println ("No of pizzas:" + pizza);
System.out.println ("No of puffs:" + puffs);
System.out.println ("No of cooldrinks:" + coolDrinks);

totalprice = pizzaa + puffss + coolDrinkss;
System.out.println ("Total price=" + totalprice);
System.out.println ("ENJOY THE SHOW!!!");
}
}
/*Problem Statement – Vohra went to a movie with his friends in a Wave theatre and during  break time he bought pizzas, puffs and cool drinks. Consider   the following prices : 

Rs.100/pizza
Rs.20/puffs
Rs.10/cooldrink
Generate a bill for What Vohra has bought.

Sample Input 1:

Enter the no of pizzas bought:10
Enter the no of puffs bought:12
Enter the no of cool drinks bought:5
Sample Output 1:

Bill Details

No of pizzas:10
No of puffs:12
No of cooldrinks:5
Total price=1290
ENJOY THE SHOW!!! */