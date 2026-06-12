public class LengthofArraywithoutLengthAtt {
}
    public static void main(String[] args) {

        int arr[] = {1, 2, 3, 4, 5};

        int count = 0;

        try {

            while (true) {
                int temp = arr[count];
                count++;
            }

        } catch (ArrayIndexOutOfBoundsException e) {

            System.out.println(count);
        }
    }

