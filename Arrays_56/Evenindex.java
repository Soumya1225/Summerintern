package Day_1_Array;

public class Evenindex {

    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5,6};

        System.out.println("Even Index Values:");

        for (int i = 0; i < arr.length; i = i + 2) {
            System.out.print(arr[i] + " ");
        }
    }
}
