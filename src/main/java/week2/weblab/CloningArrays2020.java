package week2.weblab;

public class CloningArrays2020 {
    static double[][] clone(double[][] a) {
        if (a == null || a.length == 0) return a;
        double[][] b = new double[a.length][];
        for (int i = 0; i < a.length; i++) {
            b[i] = new double[a[i].length];
            if (b[i].length != 0) {
                for (int j = 0; j < a[i].length; j++) {
                    b[i][j] = a[i][j];
                }
            }
        }
        return b;
    }
}
