package Day_1_Array;

import java.util.Arrays;
    public class CopyArray {
        public static void main(String[] args) {
            int[] source = {10, 20, 30, 40, 50};
            int[] destination = new int[source.length];

            System.arraycopy(source, 0, destination, 0, source.length);

            System.out.println("Source Array      : " + Arrays.toString(source));
            System.out.println("Destination Array : " + Arrays.toString(destination));
        }
    }

