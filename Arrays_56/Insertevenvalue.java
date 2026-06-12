package Day_1_Array;

import java.util.Scanner;

public class Insertevenvalue {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] arr = new int[5];

        System.out.println("Enter 5 Even Numbers:");

        for (int i = 0; i < arr.length; i++) {

            int n = sc.nextInt();

            if (n % 2 == 0) {
                arr[i] = n;
            } else {
                System.out.println("Please enter even number");
                i--;
            }
        }

        System.out.println("Array Elements:");

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        sc.close();
    }
}
