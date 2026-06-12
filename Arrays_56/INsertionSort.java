package Day_1_Array;
import java.util.Arrays;

public class INsertionSort {
        public static void main(String[] args) {
            int[] arr = {14, 8, 32, 5, 16};

            for (int i = 1; i < arr.length; i++) {
                int key = arr[i];
                int j = i - 1;

                while (j >= 0 && arr[j] > key) {
                    arr[j + 1] = arr[j];
                    j--;
                }

                arr[j + 1] = key;
            }

            System.out.println("Sorted Array: " + Arrays.toString(arr));
        }
    }
