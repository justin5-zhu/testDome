package nowcode.algorithmPrimary;


import java.util.ArrayList;
import java.util.Scanner;

/**
 * AB1 【模板】栈
 *
 * 题目链接 https://www.nowcoder.com/practice/104ce248c2f04cfb986b92d0548cccbf
 */
class LoopQueue {
    static ArrayList<Integer> list = new ArrayList<Integer>();
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = sc.nextInt();
        for (; i >= 0; i--) {
            String s1 = sc.nextLine();
            String[] s = s1.split(" ");
            switch (s[0]){
                case "push":
                    if (list.size()>=n){
                        System.out.println("full");
                    }else
                        push(Integer.parseInt(s[1]));
                    break;
                case "pop" :
                    pop();
                    break;
                case "front":
                    front();
                    break;
            }
        }
    }

    private static void front() {
        if (!list.isEmpty()){
//            int index = list.size() - 1;
            System.out.println(list.get(0));

        }else{
            System.out.println("empty");
        }
    }

    private static void pop() {
        if (!list.isEmpty()){
//            int index = 0;
            System.out.println(list.get(0));
            list.remove(0);
        }else{
            System.out.println("empty");
        }
    }

    private static void push(int push) {
        list.add(push);
    }

}