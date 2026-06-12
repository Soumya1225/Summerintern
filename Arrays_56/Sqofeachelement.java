package Day_1_Array;

public class Sqofeachelement {
    public static void main(String[] args) {

        int arr[] = {1, 2, 3, 4, 5};

        for (int i = 0; i < arr.length; i++) {

            int square = arr[i] * arr[i];

            System.out.print(square + " ");
        }
    }
}
