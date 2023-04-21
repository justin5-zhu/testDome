package nowcode.algorithmPrimary;


import java.util.ArrayList;
import java.util.Scanner;

/**
 * AB1 【模板】栈
 *
 * 题目链接 https://www.nowcoder.com/practice/104ce248c2f04cfb986b92d0548cccbf
 */
class ImpStack{
    static ArrayList<Integer> list = new ArrayList<Integer>();
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        for (; i >= 0; i--) {
            String s1 = sc.nextLine();
            String[] s = s1.split(" ");
            switch (s[0]){
                case "push":
                    push(Integer.parseInt(s[1]));
                    break;
                case "pop" :
                    pop();
                    break;
                case "top":
                    top();
                    break;
            }
        }
    }

    private static void top() {
        if (!list.isEmpty()){
            int index = list.size() - 1;
            System.out.println(list.get(index));

        }else{
            System.out.println("error");
        }
    }

    private static void pop() {
        if (!list.isEmpty()){
            int index = list.size() - 1;
            System.out.println(list.get(index));
            list.remove(index);
        }else{
            System.out.println("error");
        }
    }

    private static void push(int push) {
        list.add(push);
    }

}