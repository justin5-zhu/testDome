package nowcode.other;

/**
 * @author justin-zhu
 * <p>
 * 2022年10月28日 11:20
 */

public class QuantileCal {
    public static void main(String[] args) {
        int n  =9;
        double[] arr = new double[n];
        for (int i = 0; i < n; i++) {
            arr[i] = ((double) i+1) / (n+1);
            System.out.print(arr[i]+" ");
        }
    }
}
