//The sum of factorials of the digits is equal to the original number.

package Day1;

import java.util.Scanner;

class StrongNumber {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int original = num;
        int sum = 0;

        while(num > 0) {
            int digit = num % 10;

            int fact = 1;
            for(int i = 1; i <= digit; i++) {
                fact = fact * i;
            }

            sum = sum + fact;
            num = num / 10;
        }

        if(original == sum)
            System.out.println("Strong Number");
        else
            System.out.println("Not a Strong Number");

        sc.close();
    }
}
