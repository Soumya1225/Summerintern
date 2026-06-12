package Day_1_Array;

public class ReverseElement {
    public static void main(String[] args) {

        int arr[] = {23, 55, 57, 93, 1};

        for (int i = 0; i < arr.length; i++) {

            int num = arr[i];
            int rev = 0;

            while (num > 0) {

                int rem = num % 10;
                rev = rev * 10 + rem;
                num = num / 10;
            }

            System.out.print(rev + " ");
        }
    }
}