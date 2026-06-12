package Day_1_Array;
import java.util.*;

public class DistinctElementsSearch {
    public static void main(String[] args) {

        int arr1[] = {1, 2, 4, 5, 6};
        int arr2[] = {2, 5, 8, 9, 3, 1};

        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> set2 = new HashSet<>();

        for (int num : arr1) {
            set1.add(num);
        }

        for (int num : arr2) {
            set2.add(num);
        }

        for (int num : set1) {
            if (!set2.contains(num)) {
                System.out.print(num + " ");
            }
        }

        for (int num : set2) {
            if (!set1.contains(num)) {
                System.out.print(num + " ");
            }
        }
    }
}