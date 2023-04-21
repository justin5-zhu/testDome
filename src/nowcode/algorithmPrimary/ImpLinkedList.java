package nowcode.algorithmPrimary;

import java.util.LinkedList;
import java.util.Scanner;

/**
 * @author justin-zhu
 * <p>
 * 2022年10月17日 18:26
 */

public class ImpLinkedList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList<Integer> link = new LinkedList<>();
        int i = sc.nextInt();
        for (int j = 0; j <= i; j++) {
            String s = sc.nextLine();
            String[] s1 = s.split(" ");
            if (s.startsWith("insert")){
                int a = Integer.parseInt(s1[1]);
                int b = Integer.parseInt(s1[2]);
                if (!link.contains(a)){
                    link.add(b);
                }else{
                    int index = link.indexOf(a);
                    link.add(index,b);
                }
            }
            if (s.startsWith("delete")){
                int a = Integer.parseInt(s1[1]);
                if (link.contains(a)){
                    link.remove(link.indexOf(a));
                }
            }

        }
        if (!link.isEmpty())
            for (Integer l : link)
                System.out.print(l+" ");
        else
            System.out.println("NULL");
    }
}
