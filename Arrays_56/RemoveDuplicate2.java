package Day_1_Array;
import java.util.*;

public class RemoveDuplicate2 {
    public static void main(String[] args) {

        int arr[] = {1, 2, 1, 3, 2, 4};

        LinkedHashSet<Integer> set = new LinkedHashSet<>();

        for (int i = 0; i < arr.length; i++) {
            set.add(arr[i]);
        }

        System.out.println(set);
    }
}