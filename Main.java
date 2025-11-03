import java.util.*;

public class Main {
    static int[] data;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n--- Data Sorter: Sorting Algorithm Comparison Tool ---");
            System.out.println("1. Enter numbers manually");
            System.out.println("2. Generate random numbers");
            System.out.println("3. Perform Bubble Sort");
            System.out.println("4. Perform Merge Sort");
            System.out.println("5. Perform Quick Sort");
            System.out.println("6. Compare all algorithms");
            System.out.println("7. Exit");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();

            switch (choice) {
                case 1 -> data = Utils.inputArray();
                case 2 -> data = Utils.generateRandomArray();
                case 3 -> BubbleSort.run(data);
                case 4 -> MergeSort.run(data);
                case 5 -> QuickSort.run(data);
                case 6 -> Utils.compareAll(data);
                case 7 -> System.out.println("Exiting program...");
                default -> System.out.println("Invalid choice, please try again.");
            }
        } while (choice != 7);
    }
}