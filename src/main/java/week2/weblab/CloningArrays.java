package week2.weblab;

public class CloningArrays {

    static double[][] clone(double[][] a) {
        // if the input array is empty return the array
        if (a.length == 0) return a;

        // initialize the 1st dimension of the array with the same length
        double[][] b = new double[a.length][];

        // initialize the inner arrays with the appropriate length
        for (int i = 0; i < a.length; i++) {
            // if the array inside (2nd dimension) is not empty then initialize with the appropriate length
            if (a[i].length != 0) {
                b[i] = new double[a[i].length];

                // copy the elements from each inner array of the original array to the new array's inner arrays.
                for (int j = 0; j < a[i].length; j++) {
                    b[i][j] = a[i][j];
                }
            }
        }
        return b;
    }
}
