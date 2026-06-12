package Day_1_Array;

public class DeleteFromSecondINdex {
    public static void main(String[] args) {

        int arr[] = {1, 2, 3, 4};

        int deleteIndex = 2;

        for (int i = deleteIndex; i < arr.length - 1; i++) {
            arr[i] = arr[i + 1];
        }

        for (int i = 0; i < arr.length - 1; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
