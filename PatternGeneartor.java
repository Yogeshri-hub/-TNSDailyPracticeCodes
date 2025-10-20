import java.util.Scanner;

public class PatternGeneartor {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n=== Pattern Generator ===");
            System.out.println("1. Triangle Pattern");
            System.out.println("2. Reverse Triangle Pattern");
            System.out.println("3. Pyramid Pattern");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            if (choice >= 1 && choice <= 3) {
                System.out.print("Enter number of rows: ");
                int rows = sc.nextInt();

                switch (choice) {
                    case 1:
                        for (int i = 1; i <= rows; i++) {
                            for (int j = 1; j <= i; j++) {
                                System.out.print(j + " ");
                            }
                            System.out.println();
                        }
                        break;

                    case 2:
                        for (int i = rows; i >= 1; i--) {
                            for (int j = 1; j <= i; j++) {
                                System.out.print("* ");
                            }
                            System.out.println();
                        }
                        break;

                    case 3:
                        for (int i = 1; i <= rows; i++) {
                            for (int space = 1; space <= rows - i; space++) {
                                System.out.print("  ");
                            }
                            for (int j = 1; j <= (2 * i - 1); j++) {
                                System.out.print("* ");
                            }
                            System.out.println();
                        }
                        break;
                }
            } else if (choice == 4) {
                System.out.println("Exiting...");
            } else {
                System.out.println("Invalid choice! Try again.");
            }

        } while (choice != 4);
        
        sc.close();
    }
}
