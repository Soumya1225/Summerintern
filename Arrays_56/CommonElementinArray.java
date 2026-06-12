package Day_1_Array;
import java.util.*;

public class CommonElementinArray {
    public static void main(String[] args) {

        int arr1[] = {1, 2, 4, 5, 6};
        int arr2[] = {2, 5, 8, 9, 3, 1};

        HashSet<Integer> set = new HashSet<>();

        for (int num : arr1) {
            set.add(num);
        }

        for (int num : arr2) {

            if (set.contains(num)) {
                System.out.print(num + " ");
            }
        }
    }
}
