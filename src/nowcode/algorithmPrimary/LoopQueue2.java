package nowcode.algorithmPrimary;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

/**
 * AB1 【模板】栈
 *
 * 题目链接 https://www.nowcoder.com/practice/104ce248c2f04cfb986b92d0548cccbf
 */
class LoopQueue2 {

    public static void main(String[] args) {
        ArrayDeque<Integer> stack = new ArrayDeque<>();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = sc.nextInt();
        for (; i >= 0; i--) {
            String s1 = sc.nextLine();
            String[] s = s1.split(" ");
            switch (s[0]){
                case "push":
                    if (stack.size()>=n){
                        System.out.println("full");
                    }else
                        stack.push(Integer.parseInt(s[1]));
                    break;
                case "pop" :
                    if (stack.isEmpty())
                        System.out.println("empty");
                    else
                        System.out.println(stack.pollLast());
                    break;
                case "front":
                    if (stack.isEmpty())
                        System.out.println("empty");
                    else
                        System.out.println(stack.peekLast());
                    break;
            }

        }
    }

}