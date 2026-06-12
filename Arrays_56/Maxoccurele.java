package Day_1_Array;
import java.util.*;

public class Maxoccurele {

        public static void main(String[] args) {

            int arr[] = {1, 2, 1, 3, 1, 4};

            HashMap<Integer, Integer> map = new HashMap<>();

            for (int i = 0; i < arr.length; i++) {

                if (map.containsKey(arr[i])) {
                    map.put(arr[i], map.get(arr[i]) + 1);
                } else {
                    map.put(arr[i], 1);
                }
            }

            int maxElement = 0;
            int maxCount = 0;

            for (int key : map.keySet()) {

                if (map.get(key) > maxCount) {
                    maxCount = map.get(key);
                    maxElement = key;
                }
            }

            System.out.println(maxElement + "-" + maxCount);
        }
    }

