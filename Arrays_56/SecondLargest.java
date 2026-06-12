package Day_1_Array;
import java.util.Arrays;

public class SecondLargest {

        public static void main(String[] args) {

            int arr[] = {1, 2, 1, 3, 2, 4};

            Arrays.sort(arr);

            System.out.println(arr[arr.length - 2]);
        }
    }

