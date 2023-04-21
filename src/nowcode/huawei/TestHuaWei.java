package nowcode.huawei;

import java.util.*;
import java.util.stream.Collectors;

/**
 * @Author：justin-zhu
 * @Date：2023/4/21 12:24
 * @Filename：TestHuaWei
 */

public class TestHuaWei {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        test8(sc);
    }

    private static void test8(Scanner sc) {
        Map<Integer, Integer> map = new HashMap<>();
        int n = sc.nextInt();
        while (n-- > 0){
            int first = sc.nextInt();
            int second = sc.nextInt();
            map.put(first, map.getOrDefault(first,0)+second);
        }
        List<Integer> key1 = map.keySet().stream().sorted(Comparator.comparingInt(Integer::intValue)).collect(Collectors.toList());
        for (Integer s : key1){
            System.out.println(s+" "+ map.get(s));
        }
    }

    public static void test9(){

    }

}
