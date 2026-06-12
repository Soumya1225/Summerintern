package Day_1_Array;
import java.util.Arrays;

public class SelectionSort {

        public static void main(String[] args) {
            int[] arr = {4, 10, 7, 3, 13};

            for (int i = 0; i < arr.length - 1; i++) {
                int minIndex = i;

                for (int j = i + 1; j < arr.length; j++) {
                    if (arr[j] < arr[minIndex]) {
                        minIndex = j;
                    }
                }

                int temp = arr[minIndex];
                arr[minIndex] = arr[i];
                arr[i] = temp;
            }

            System.out.println("Sorted Array: " + Arrays.toString(arr));
        }
    }

