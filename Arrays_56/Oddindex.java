package Day_1_Array;

public class Oddindex {

    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5,6};

        System.out.println("Odd Index Values:");

        for (int i = 1; i < arr.length; i += 2) {
            System.out.print(arr[i] + " ");
        }
    }
}
