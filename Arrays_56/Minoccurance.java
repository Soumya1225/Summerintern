package Day_1_Array;
import java.util.*;

public class Minoccurance {

        public static void main(String[] args) {

            int arr[] = {1, 2, 1, 1, 2, 1};

            HashMap<Integer, Integer> map = new HashMap<>();

            for (int i = 0; i < arr.length; i++) {

                if (map.containsKey(arr[i])) {
                    map.put(arr[i], map.get(arr[i]) + 1);
                } else {
                    map.put(arr[i], 1);
                }
            }

            int minElement = 0;
            int minCount = Integer.MAX_VALUE;

            for (int key : map.keySet()) {

                if (map.get(key) < minCount) {
                    minCount = map.get(key);
                    minElement = key;
                }
            }

            System.out.println(minElement + "-" + minCount);
        }
    }

