package nowcode.algorithmPrimary;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

/**
 * @author justin-zhu
 * <p>
 * 2022年10月17日 10:25
 *
 * AB4 逆波兰表达式求值
 * https://www.nowcoder.com/practice/885c1db3e39040cbae5cdf59fb0e9382?tpId=308&tqId=2301465&ru=/exam/oj&qru=/ta/algorithm-start/question-ranking&sourceUrl=%2Fexam%2Foj%3Fpage%3D1%26tab%3D%25E7%25AE%2597%25E6%25B3%2595%25E7%25AF%2587%26topicId%3D308
 */

public class NotBoLan {
    public static void main(String[] args) {
        Scanner cs = new Scanner(System.in);
        while (true){
            String s = cs.nextLine();
            String substring = s.substring(1, s.length() - 1);
            String[] split = substring.split(",");

            System.out.println(fun(split));
        }

    }

    private static int fun(String[] tokens) {


//        Stack<Integer> stack = new Stack<>();
        ArrayDeque<Integer> stack = new ArrayDeque<>();
        for (String s : tokens){
            switch (s){
                case "+" : stack.push(stack.pop()+stack.pop());
                break;
                case "-" : stack.push(-stack.pop()+stack.pop());
                    break;
                case "*" : stack.push(stack.pop()*stack.pop());
                    break;
                case "/" :
                    int num1 = stack.pop();
                    int num2 = stack.pop();
                    stack.push((1 / num1) * num2);
                    break;

                default : stack.push(Integer.parseInt(s));
            }
        }
        return stack.pop();
    }

}
