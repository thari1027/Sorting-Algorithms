public class BubbleSort {
    public static void run(int[] arr) {
        int[] data = arr.clone();
        long start = System.nanoTime();
        int steps = 0;

        for (int i = 0; i < data.l ength - 1; i++) {
            for (int j = 0; j < data.length - i - 1; j++) {
                steps++;
                if (data[j] > data[j + 1]) {
                    int temp = data[j];
                    data[j] = data[j + 1];
                    data[j + 1] = temp;
                }
            }
        }

        long end = System.nanoTime();
        Utils.displayResults("Bubble Sort", data, steps, end - start);
    }
}
