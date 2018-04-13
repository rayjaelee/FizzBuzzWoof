/**
 * Fizz Buzz Woof

 Loop from 1 to 100.

 The number 3 - Fizz, 5 - Buzz, and 7 - Woof.

 The main rules in this game are that any number that CONTAINS the number or is DIVISIBLE by that number is replaced by an occurrence of the word.

 If the number has 2 instances of that number (i.e. 33 or 55) and is divisible by that number, then the word is said three times in this example.

 The additional rule is that the words (if more than one occur) must be said in the order given in the title. For example:

 1, 2, Fizz Fizz (3), 4, Buzz Buzz (5), Fizz (6), Woof Woof (7), 8, Fizz (9), Buzz (10), 11, Fizz (12), Fizz (13), Woof (14), Fizz Buzz Buzz (15)

 30 – fizz fizz buzz

 33 – Fizz Fizz FIzz

 35 – Fizz Buzz Buzz Woof

 55 – Buzz Buzz Buzz
 */


public class FizzBuzzWolf {

    // Checks if the number contains or is divisible by 3 or 5 or 7 in that order
    public static void main(String[] args) {
        String printable = "";
        for (int i = 1; i <= 100; i++) {
            printable += checkThree(i);
            printable += checkFive(i);
            printable += checkSeven(i);

            if (printable.equals("")) {
                printable += i;
            }

            System.out.print(printable + ", ");
            printable = "";

        }
    }

    // Checks if the number contains or is divisible by 3
    public static String checkThree(int num) {
        String result = "";
        if (num % 3 == 0) {
            result += "Fizz ";
        }
        for (int i = 0; i < Integer.toString(num).length(); i++) {
            if (Integer.toString(num).charAt(i) == '3') {
                result += "Fizz ";
            }
        }
        return result;
    }

    // Checks if the number contains or is divisible by 5
    public static String checkFive(int num) {
        String result = "";
        if (num % 5 == 0) {
            result += "Buzz ";
        }
        for (int i = 0; i < Integer.toString(num).length(); i++) {
            if (Integer.toString(num).charAt(i) == '5') {
                result += "Buzz ";
            }
        }
        return result;
    }

    // Checks if the number contains or is divisible by 7
    public static String checkSeven(int num) {
        String result = "";
        if (num % 7 == 0) {
            result += "Woof ";
        }
        for (int i = 0; i < Integer.toString(num).length(); i++) {
            if (Integer.toString(num).charAt(i) == '7') {
                result += "Woof ";
            }
        }
        return result;
    }
}
