package Day_1_Array;

public class Printmissingelement {
        public static void main(String[] args) {
            int[] arr = {12, 14, 26, 33};

            for (int i = 0; i < arr.length - 1; i++) {
                for (int j = arr[i] + 1; j < arr[i + 1]; j++) {
                    System.out.print(j + " ");
                }
            }
        }
    }
