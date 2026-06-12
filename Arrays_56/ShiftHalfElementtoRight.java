package Day_1_Array;

public class ShiftHalfElementtoRight {
    public static void main(String[] args) {

        int arr[] = {2, 5, 8, 9, 3, 1};

        int n = arr.length;
        int half = n / 2;

        int result[] = new int[n];

        int index = 0;

        for (int i = half; i < n; i++) {
            result[index++] = arr[i];
        }

        for (int i = 0; i < half; i++) {
            result[index++] = arr[i];
        }

        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
    }
}

