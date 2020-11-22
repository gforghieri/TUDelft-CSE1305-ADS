package week2.weblab;

public class CloningArrays2020 {
    static double[][] clone(double[][] a) {
        if (a == null || a.length == 0) return a;
        double[][] b = new double[a.length][a[0].length];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[j].length; j++) {
                b[i][j] = a[i][j];
            }
        }
        return b;
    }
}
