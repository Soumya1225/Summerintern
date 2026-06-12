package Day_1_Array;
import java.util.Arrays;

public class ArrangeStringArray {

        public static void main(String[] args) {
            String[] names = {"Ram", "Amar", "Soumya", "Likun", "Guddu"};

            Arrays.sort(names);

            System.out.println("Sorted String Array:");
            for (String name : names) {
                System.out.print(name + " ");
            }
        }
    }

