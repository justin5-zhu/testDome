package nowcode.algorithmPrimary;


import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

/**
 * JZ31 栈的压入 弹出序列
 *
 * 题目链接 https://www.nowcoder.com/practice/104ce248c2f04cfb986b92d0548cccbf
 */
class StackIO {
    static ArrayList<Integer> list = new ArrayList<Integer>();
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        char[] chars = s.toCharArray();
        ArrayList<Integer> arr1 = new ArrayList<>();
        ArrayList<Integer> arr2 = new ArrayList<>();
        for (char c : chars){
            if (c>=48&&c<=57) list.add(Integer.parseInt(String.valueOf(c)));
        }
        for (int i = 0; i < list.size(); i++) {
            if (i<list.size()/2){
                arr1.add(list.get(i));
            }else{
                arr2.add(list.get(i));
            }
        }

        System.out.println(fun(arr1,arr2));

    }

    private static boolean fun(ArrayList<Integer> arr1, ArrayList<Integer> arr2) {
        Stack<Integer> stack = new Stack<>();
        for (Integer arr : arr1){
            stack.push(arr);
            while (!stack.empty() && stack.peek().equals(arr2.get(0))){
                stack.pop();
                arr2.remove(0);
            }
        }
        return stack.empty();
    }

}

