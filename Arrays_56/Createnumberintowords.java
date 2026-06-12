package Day_1_Array;

public class Createnumberintowords {

        static String[] ones = {"", "one", "two", "three", "four", "five",
                "six", "seven", "eight", "nine", "ten", "eleven", "twelve",
                "thirteen", "fourteen", "fifteen", "sixteen", "seventeen",
                "eighteen", "nineteen"};

        static String[] tens = {"", "", "twenty", "thirty", "forty",
                "fifty", "sixty", "seventy", "eighty", "ninety"};

        public static String convert(int num) {
            if (num < 20)
                return ones[num];

            if (num < 100)
                return tens[num / 10] + " " + ones[num % 10];

            if (num < 1000)
                return ones[num / 100] + " hundred " + convert(num % 100);

            if (num < 1000000)
                return convert(num / 1000) + " thousand " + convert(num % 1000);

            return "";
        }

        public static void main(String[] args) {
            int num = 192;
            System.out.println(convert(num).trim());
        }
    }
