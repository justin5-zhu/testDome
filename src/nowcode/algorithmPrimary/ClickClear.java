package nowcode.algorithmPrimary;

import java.util.ArrayDeque;
import java.util.Scanner;
import java.util.Stack;

/**
 * @author justin-zhu
 * <p>
 * 2022年10月17日 15:31
 *
 * AB5 点击消除
 * https://www.nowcoder.com/practice/8d3643ec29654cf8908b5cf3a0479fd5?tpId=308&tags=&title=&difficulty=0&judgeStatus=0&rp=0&sourceUrl=%2Fexam%2Foj%3Fpage%3D1%26tab%3D%25E7%25AE%2597%25E6%25B3%2595%25E7%25AF%2587%26topicId%3D308
 */

public class ClickClear {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        while (true){
            String s = in.nextLine();
            System.out.println(solve(s));
        }

    }

        public static int solve (String s) {
            //通俗一点的暴力

            int res=0;
            Stack<Integer> s1=new Stack<>();//装数
            Stack<Integer> s3=new Stack<>();//正序装数
            Stack<Character> s2=new Stack<>();//装符号
            Stack<Character> s4=new Stack<>();//正序装符号
            int len =s.length();
            int temp=0;
            int chen=0;//标记乘号左右两个数，若称号左右有两数，则立马计算cheng
            for(int i=0;i<len;i++){
                if(0<=s.charAt(i)-'0' && s.charAt(i)-'0'<=9){
                    if(i==len-1){//这里判断是不是读到最后一个字符了
                        s1.push(temp*10+s.charAt(i)-'0');
                        if(chen ==1){
                            chen++;
                        }
                        break;
                    }else if(!isnum(s.charAt(i+1))){//判断下一个是否为非数字，如果是，则把前一段的数字保存
                        s1.push(temp*10+s.charAt(i)-'0');
                        if(chen ==1){//这里主要是判断乘号左右两边的数是否有了，如果有两个数可以相乘
                            chen++;
                        }
                    }else  if(0<=s.charAt(i+1)-'0' && s.charAt(i+1)-'0'<=9){
                        temp=temp*10+s.charAt(i)-'0';//累计每个位数，如123=((0*10+1)*10+2)*10+3;
                    }
                    if(s1.size()>1&& s2.peek()=='*' && chen==2){//及时把乘号两边的数计算出来
                        int a=s1.pop();
                        int b=s1.pop();
                        s1.push(op(b,a,s2.pop()));//op()为计算函数
                        chen=0;//计算一个后可重置为零
                    }
                }else{
                    if(s.charAt(i)==')'){
                        if(s2.peek()=='('){
                            //这里判断的是若一对括号里只有1个数，便把这对括号去掉
                            s2.pop();
                            continue;
                        }else{
                            //若发现“）”，则开始尽可能的把括号的结果计算出来
                            while(s2.peek()!='('){
                                int a=s1.pop();
                                int b=s1.pop();
                                s1.push(op(b,a,s2.pop()));
                            }
                            if(s2.peek()=='('){
                                //计算结束后，同时删除“）”
                                s2.pop();
                            }
                            continue;
                        }
                    }
                    if(s.charAt(i)=='*' && chen==0){
                        chen++;//统计*运算
                    }
                    s2.push(s.charAt(i));//向运算符栈推入
                    temp=0;
                }
            }
            //经过前面的而计算后，只剩下没有括号的表达式，且没有乘法运算
            //但表达式是逆序的，为了方便理解，借助栈把表达式正序一下
            while(!s1.isEmpty()){
                s3.push(s1.pop());//正序每个运算数字
            }
            while(!s2.isEmpty()){
                s4.push(s2.pop());//正序每个运算符
            }
            //正序后的表达式直接就是可以从左到右依次计算，不用再判定运算符的优先级。
            while(!s4.isEmpty()){
                int a=s3.pop();
                int b=s3.pop();
                s3.push(op(a,b,s4.pop()));
            }
            //最后得到结果
            res=s3.peek();
            return res;
        }
        /**
         op()   为计算函数
         */

        public static int op(int a, int b, char c){
            if(c=='+'){
                return a+b;
            }
            else if(c=='-'){
                return a-b;
            }else{
                return a*b;
            }
        }

        //这个为判断该字符是否作为数字字符。
        //当然也可以用java自带的isDigit()函数判断。
        public static boolean isnum(char d){
            if( d-'0'<=9 &&0<=d-'0'){
                return true;
            }else{
                return false;
            }
        }

        /**
         结语，再最后的逆序表达式计算还可以再优化一下。
         */
    }



