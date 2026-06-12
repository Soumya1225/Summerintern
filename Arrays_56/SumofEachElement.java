package Day_1_Array;

public class SumofEachElement {

        public static void main(String[] args) {

            int arr[] = {23, 55, 57, 93, 10, 1};

            for (int i = 0; i < arr.length; i++) {

                int num = arr[i];

                while (num >= 10) {

                    int sum = 0;

                    while (num > 0) {
                        sum = sum + (num % 10);
                        num = num / 10;
                    }

                    num = sum;
                }

                System.out.print(num + " ");
            }
        }
    }

