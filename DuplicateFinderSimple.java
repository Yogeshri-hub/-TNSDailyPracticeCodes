public class DuplicateFinderSimple {
    public static void main(String[] args) {
        int[] array = {4, 2, 7, 2, 4, 9, 1, 7};

        System.out.println("Duplicate elements:");

        for (int i = 0; i < array.length; i++) {
            boolean alreadyPrinted = false;

            // Check if this number was already printed
            for (int k = 0; k < i; k++) {
                if (array[i] == array[k]) {
                    alreadyPrinted = true;
                    break;
                }
            }

            if (alreadyPrinted) {
                continue; // skip this number
            }

            // Now check for duplicates of array[i] ahead in the list
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] == array[j]) {
                    System.out.println(array[i]);
                    break; // print only once
                }
            }
        }
    }
}
