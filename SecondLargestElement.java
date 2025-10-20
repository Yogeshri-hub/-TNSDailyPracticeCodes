/*public class SecondLargestElement {
    public static void main(String[] args) {
        int[] arr = {12, 35, 1, 10, 34, 1};
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int num : arr) {
            if (num > largest) {
                secondLargest = largest;
                largest = num;
            } else if (num > secondLargest && num != largest) {
                secondLargest = num;
            }
        }

        System.out.println("Second largest: " + secondLargest);


         Scanner sc = new Scanner(System.in);

        // Take array size input from user
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        // Declare array
        int[] arr = new int[n];

        // Take array elements input
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
    }
} // <--- This is the closing brace you're missin ? /* */


public class SecondLargestElement{

    public static void main(String[] arg ){

        int[] arr = new int[] {1, 4, 2, 6, 7, 8};

        int Largest =  Integer.MIN_VALUE;;
        int SecondLargest = Integer.MIN_VALUE;
;


        for(int num : arr)

            if ( num> Largest){
                Largest = num;
                SecondLargest= Largest;

            }else if (num > SecondLargest && num!=Largest){
                SecondLargest = num;


            }

              System.out.println("Second largest: " + SecondLargest);
        }
    }
  