public class RightRotate {
    public static void main(String[] args){
        int[] arr ={1,2,3,4,5};
        int n =arr.lenght;
        int k = 1;

        for (int i = n - 1; i > 0; i--) {
                arr[i] = arr[i - 1];
            }
}
