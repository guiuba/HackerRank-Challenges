import java.util.Arrays;

public class CountingSort {

    void countSort(int array[], int size) {
        int[] output = new int[size + 1];

        // Find the largest element of the array
        int max = array[0];
        for (int i = 1; i < size; i++) {
            if (array[i] > max)
                max = array[i];
        }
        int[] count = new int[max + 1];

        // Initialize count array with all zeros.
        for (int i = 0; i < max; ++i) {
            count[i] = 0;
        }

       // System.out.println(Arrays.toString(array)); test [4, 2, 2, 8, 3, 3, 1]
        // Store the count of each element
        for (int i = 0; i < size; i++) {
            count[array[i]]++;
        }
      //  System.out.println(Arrays.toString(count)); //test [0, 1, 2, 2, 1, 0, 0, 0, 1]
                                                          //  0  1  2  3  4  5  6  7  8

        // Store the cummulative count of each array
        for (int i = 1; i <= max; i++) {
            count[i] += count[i - 1];
        }
        System.out.println(Arrays.toString(count));     // [0, 1, 3, 5, 6, 6, 6, 6, 7
                                                        //  0  1  2  3  4  5  6  7  8
        // Find the index of each element of the original array in count array, and
        // place the elements in output array
        for (int i = size - 1; i >= 0; i--) {
            output[count[array[i]] - 1] = array[i];
            count[array[i]]--;
        }

        // Copy the sorted elements into original array
        for (int i = 0; i < size; i++) {
            array[i] = output[i];
        }
    }

    // Driver code
    public static void main(String args[]) {
        int[] data = { 4, 2, 2, 8, 3, 3, 1 };
        int size = data.length;
        CountingSort cs = new CountingSort();
        cs.countSort(data, size);
        System.out.println("Sorted Array in Ascending Order: ");
        System.out.println(Arrays.toString(data));
    }
}
