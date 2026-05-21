//It's a number that contains 0, but the number should not start with 0.


package Day1;

import java.util.Scanner;

class DuckNumber {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        String num = sc.next();

        if(num.contains("0") && num.charAt(0) != '0')
            System.out.println("Duck Number");
        else
            System.out.println("Not a Duck Number");

        sc.close();
    }
}