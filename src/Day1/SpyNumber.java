//A Spy Number is -> Sum of digits = Product of digits

package Day1;

import java.util.Scanner;

class SpyNumber {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int sum = 0, product = 1;

        while(num > 0) {
            int digit = num % 10;
            sum = sum + digit;
            product = product * digit;
            num = num / 10;
        }

        if(sum == product)
            System.out.println("Spy Number");
        else
            System.out.println("Not a Spy Number");

        sc.close();
    }
}
