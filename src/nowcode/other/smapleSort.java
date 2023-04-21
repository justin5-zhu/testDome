package nowcode.other;

import java.util.Scanner;

/**
 * @author justin-zhu
 * <p>
 * 2022年10月26日 16:50
 */

public class smapleSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n  = sc.nextInt();
        int[] arr = outPrint(sc, n);
        sort(arr, n);
        print(n, arr);

    }

    private static int[] outPrint(Scanner sc, int n) {
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        return arr;
    }

    private static void print(int n, int[] arr) {
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]+ " ");
        }
    }

    private static void sort(int[] arr, int n) {
        for (int i = 0; i <n-1; i++) {
            int min = i ;
            for (int j =i+ 1; j <n; j++) {
                if (arr[j]<arr[min]){
                    min = j;
                }
            }
            if (min!=i){
                int temp  = arr[i];
                arr[i] = arr[min];
                arr[min] = temp;
            }
        }
    }
}
