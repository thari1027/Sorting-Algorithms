import java.util.*;

public class Utils {
    static Scanner sc = new Scanner(System.in);

    public static int[] inputArray() {
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the numbers:");
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();
        return arr;
    }

    public static int[] generateRandomArray() {
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();
        Random r = new Random();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) arr[i] = r.nextInt(100);
        System.out.println("Random array generated.");
        return arr;
    }

    public static void displayResults(String algo, int[] sorted, int steps, long time) {
        System.out.println("\n--- " + algo + " Results ---");
        System.out.println("Sorted Array: " + Arrays.toString(sorted));
        System.out.println("Steps: " + steps);
        System.out.println("Execution Time (ns): " + time);
    }

    public static void compareAll(int[] arr) {
        if (arr == null) {
            System.out.println("No data available. Please input or generate numbers first.");
            return;
        }

        System.out.println("\n--- Comparison Table ---");
        System.out.printf("%-15s %-15s %-15s\n", "Algorithm", "Steps", "Time (ns)");
        System.out.println("----------------------------------------------");

        // Run all sorts
        runAndCompare("Bubble Sort", arr, BubbleSort::run);
        runAndCompare("Merge Sort", arr, MergeSort::run);
        runAndCompare("Quick Sort", arr, QuickSort::run);
    }

    private static void runAndCompare(String name, int[] arr, java.util.function.Consumer<int[]> sorter) {
        int[] copy = arr.clone();
        long start = System.nanoTime();
        sorter.accept(copy);
        long time = System.nanoTime() - start;
    }
}