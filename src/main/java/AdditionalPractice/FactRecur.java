package AdditionalPractice;

public class FactRecur {

    public static void main(String[] args) {
//        int toPrint = methodY(8);
//        System.out.println(toPrint);

        double res = calculatePerMeritoOpportunityCost(0, 30);
        System.out.println(res);


    }



    public static double calculatePerMeritoOpportunityCost(double cost, int years) {
        if (years == 0) return cost;
        return calculatePerMeritoOpportunityCost((cost+(184.0*12.0))*1.07, years -1);
    }

    public static int methodY(int n) {

        if (n < 2) return n;

        int res = 0;

        for (int i = 0; i < n; i++) {
            int y = methodY(n - 2);
            res = res + y;
        }
        return res;



//        if (n == 0) return 1;
//        return n * factRec(n-1);
    }
}
