package Day_1_Array;

public class SumofEvenDigits {
    public static void main(String[] args) {

        int arr[] = {231, 554, 572, 962, 24, 1};

        for (int i = 0; i < arr.length; i++) {

            int num = arr[i];
            int sum = 0;

            while (num > 0) {

                int rem = num % 10;

                if (rem % 2 == 0) {
                    sum = sum + rem;
                }

                num = num / 10;
            }

            System.out.print(sum + " ");
        }
    }
}
