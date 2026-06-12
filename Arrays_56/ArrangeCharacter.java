package Day_1_Array;
import java.util.Arrays;

public class ArrangeCharacter {

        public static void main(String[] args) {
            char[] ch = {'S', 'O', 'U', 'M', 'Y', 'A'};

            Arrays.sort(ch);

            System.out.println("Sorted Character Array:");
            for (char c : ch) {
                System.out.print(c + " ");
            }
        }
    }

