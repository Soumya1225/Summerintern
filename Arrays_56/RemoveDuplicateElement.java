package Day_1_Array;
import java.util.*;

public class RemoveDuplicateElement {
    public static void main(String[] args) {

        int arr[] = {1, 2, 1, 3, 2, 4};

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {

            if (map.containsKey(arr[i])) {
                map.put(arr[i], map.get(arr[i]) + 1);
            } else {
                map.put(arr[i], 1);
            }
        }

        for (int key : map.keySet()) {

            if (map.get(key) == 1) {
                System.out.print(key + " ");
            }
        }
    }
}