package RadixSort;

public class RadixSort {
    private static int getMax(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    private static void countSort(int[] arr, int exp) {
        int[] output = new int[arr.length];
        int[] count = new int[10];
        for (int j : arr) {
            count[(j / exp) % 10]++;
        }
        for (int i = 1; i < count.length; i++) {
            count[i] += count[i - 1];
        }
        for (int i = arr.length - 1; i >= 0; i--) {
            output[count[(arr[i] / exp) % 10] - 1] = arr[i];
            count[(arr[i] / exp) % 10]--;
        }
        System.arraycopy(output, 0, arr, 0, arr.length);
    }

    public static void radixSort(int[] arr) {
        // check if array is empty, if so return an exception
        if (arr.length == 0) {
            throw new IllegalArgumentException("Array is empty");
        }
        // check for negative numbers
        for (int i : arr) {
            if (i < 0) {
                throw new IllegalArgumentException("Array contains negative numbers");
            }
        }
        int max = getMax(arr);
        for (int exp = 1; max / exp > 0; exp *= 10) {
            countSort(arr, exp);
        }
    }



}
