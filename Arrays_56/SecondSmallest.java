package Day_1_Array;
import java.util.Arrays;

public class SecondSmallest {

        public static void main(String[] args) {

            int arr[] = {1, 2, 1, 3, 2, 4};

            Arrays.sort(arr);

            int secondSmallest = arr[1];

            for (int i = 1; i < arr.length; i++) {

                if (arr[i] != arr[0]) {
                    secondSmallest = arr[i];
                    break;
                }
            }

            System.out.println(secondSmallest);
        }
    }

