package Day_1_Array;

public class Primeno{

    static boolean isPrime(int n) {

        if (n <= 1) {
            return false;
        }

        for (int i = 2; i <= n / 2; i++) {

            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5, 6};

        System.out.println("Prime Numbers in Array:");

        for (int i = 0; i < arr.length; i++) {

            if (isPrime(arr[i])) {
                System.out.print(arr[i] + " ");
            }
        }
    }
}
