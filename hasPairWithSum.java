import java.util.HashSet;

public class hasPairWithSum {

    public static boolean hasPairWithSum(int[] arr, int k) {
        HashSet<Integer> seen = new HashSet<>();

        for (int num : arr) {
            int complement = k - num;
            if (seen.contains(complement)) {
                return true;
            }
            seen.add(num);
        }

        return false;
    }

    public static void main(String[] args) {
        int[] arr = {1, 4, 45, 6, 10, -8};
        int k = 16;

        if (hasPairWithSum(arr, k)) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }
}
