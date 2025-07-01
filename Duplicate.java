
import java.util.HashSet;  // Import HashSet to store unique values

public class Duplicate {
    
    // This function checks for duplicates
    public static boolean containsDuplicate(int[] nums) {
        HashSet<Integer> seen = new HashSet<>();  // Create empty set
        
        for (int num : nums) {  // Go through each number in the array
            if (seen.contains(num)) {
                return true;  // If number already in set, it's a duplicate
            }
            seen.add(num);  // Add number to the set
        }
        
        return false;  // If no duplicates found
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 2};  // Your input array

        if (containsDuplicate(arr)) {
            System.out.println("Array contains duplicates.");
        } else {
            System.out.println("Array does not contain duplicates.");
        }
    }
}
