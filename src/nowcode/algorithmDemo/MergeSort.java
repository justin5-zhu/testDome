package nowcode.algorithmDemo;

import java.util.Scanner;

/**
 * @author justin-zhu
 * <p>
 * 2022年10月18日 16:21
 */

public class MergeSort {
    static void print(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i!=arr.length-1)
                System.out.print(" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String[] str = s.split(" ");
        int length = str.length;
        int[] nums = new int[length];
        for (int i = 0; i < length; i++) {
            nums[i] = Integer.parseInt(str[i]);
        }

        print(nums);
        mergeSort(nums,0,length-1);
        print(nums);

    }

    // 归并排序
    private static void mergeSort(int[] nums, int left, int right) {

        // 如果只有一个元素,就不需要继续划分
        if (left < right){
            // 找中间点
            int mid = (left + right) / 2;
            // 递归划分左半区
            mergeSort(nums, left, mid);
            // 递归划分右边区
            mergeSort(nums,mid+1, right);
            merge(nums, left, mid, right);
        }
    }

    private static void merge(int[] nums, int left, int mid, int right) {

        int len = nums.length;
        // 分配一个辅助数组,用于储存合并排序后的数组
        int[] temp = new int[len];

        // 标记左半区第一个未排序的元素
        int l_pos = left;
        // 标记右半区第一个未排序的元素
        int r_pos = mid+1;
        // 临时数组元素的下标
        int pos = left;
        // 合并
        while (l_pos<=mid&&r_pos<=right){
            if (nums[l_pos]<nums[r_pos])
                temp[pos++] = nums[l_pos++];
            else
                temp[pos++] = nums[r_pos++];
        }

        // 合并左半区剩余的元素
        while (l_pos<=mid)
            temp[pos++] = nums[l_pos++];
        // 合并右边区剩余的元素
        while ( r_pos<=right)
            temp[pos++] = nums[r_pos++];
        // 把临时数组中合并后的元素复制回原来的数组
        while (left<=right){
            nums[left] = temp[left];
            left++;
        }
    }

}
