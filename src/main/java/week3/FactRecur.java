package week3;

public class FactRecur {

    public static void main(String[] args) {
        int toPrint = factRec(25);
        System.out.println(toPrint);
    }


    public static int factRec(int n) {
        if (n == 0) return 1;
        return n * factRec(n-1);
    }
}
