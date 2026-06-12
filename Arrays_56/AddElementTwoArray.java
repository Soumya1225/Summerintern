package Day_1_Array;

public class AddElementTwoArray {
    public static void main(String[] args) {

        int arr1[] = {2, 3, 4, 1};
        int arr2[] = {2, 3, 5, 6, 7, 8, 9};

        int maxLength = Math.max(arr1.length, arr2.length);

        int result[] = new int[maxLength];

        for (int i = 0; i < maxLength; i++) {

            int a = (i < arr1.length) ? arr1[i] : 0;
            int b = (i < arr2.length) ? arr2[i] : 0;

            result[i] = a + b;
        }

        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
    }
}
