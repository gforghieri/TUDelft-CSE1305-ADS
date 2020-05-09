public class FactorialLoop {

    public static void main(String[] args) {
    int toPrint = factLoop(0);
    System.out.println(toPrint);
    }
    public static int factLoop(int n) {
        int res = 1;
        for (int i = 1; i <= n; i++) {
            res *= i;
        }
        return res;
    }

}
