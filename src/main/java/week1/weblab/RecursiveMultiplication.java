package week1.weblab;

/**
 * Be recursive, that is, calculate the result using recursion; Not use the multiplication operator.
 * Instead, you can make us of the addition +, subtraction -, equality ==, and inequality < operators.
 * IMPORTANT: In an exam setting, your grade for this exercise would be overridden to 1,
 * if you don’t satisfy the conditions mentioned above.
 */
public class RecursiveMultiplication {
    static int multiply(int num1, int num2) {


        // num 1 = 0 && num 2 = 0 - - DONE

        // num 1= 0 && num 2 = positive - DONE
        // num 1 = 0 && num 2 = negative - - DONE

        // num 1 = positive && num 2 = 0 - DONE
        // num 1 = negative && num 2 = 0 - - DONE
        if (num1 == 0 || num2 == 0) {
            return 0;
        }

        int res = num1;
        // add  num1 to itself as many times as num2

        // num 1 = positive, num 2 = negative - DONE
        // num 1 = negative, num 2 = negative - DONE
        if (num2 < 0) {
            return -res + multiply(num1, num2 + 1);
        }

        // num 1 = positive, num 2 = positive - DONE
        // num 1 = negative, num 2 = positive - DONE
        return res + (multiply(num1, num2 - 1));
    }
}
