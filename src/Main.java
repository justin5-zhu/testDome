import java.util.*;
import java.util.stream.Collectors;

/**
 * @author justin-zhu
 * <p>
 * 2022年03月21日 20:35
 */

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int M = sc.nextInt();
        List<Integer> list = new LinkedList<>();

        for (int i=1;i<=100;i++){
            list.add(i);
        }
        int n = 0;

        if (M>=100||M<=1){
            System.out.println("ERROR!");
        }else{
            while(list.size()>=M){
                List<Integer> num = new ArrayList<>();

                for (int i=0;i<100-num.size();i++){
                    n++;
                    if (n == M){
                        num.add(i);
                        list.remove(i);
                        n = 0;


                    }
                }

//                for(int k=0;k<num.size();k++){
//                  list.remove( num.get(k)+0);
//            }
            }
            for (int k=0;k<list.size()-1;k++) {
                System.out.print(list.get(k) + ",");
            }
            System.out.println(list.get(list.size()-1));
        }

    }
}