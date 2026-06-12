package Day_1_Array;
import java.util.*;

public class PrintRepetedElement {

    public static void main(String[] args) {

        int arr[] = {1, 2, 3, 4, 3, 2};

        HashSet<Integer> set = new HashSet<>();
        HashSet<Integer> repeated = new HashSet<>();

        for (int i = 0; i < arr.length; i++) {

            if (!set.add(arr[i])) {
                repeated.add(arr[i]);
            }
        }

        System.out.println(repeated);
    }
}
