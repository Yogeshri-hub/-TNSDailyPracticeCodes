public class MinMaxInArray {

    public static void main(String[] args){
        int i;

        int[] arr = {10, 25, 5, 40, 15};
        int max = arr[0];
         int min = arr[0];
         for (i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
            
                if(arr[i]<min){
                    arr[i]=min;
                }
            
         }

           System.out.println("Maximum element: " + max);
        System.out.println("Minimum element: " + min);
    


    }

    
}
