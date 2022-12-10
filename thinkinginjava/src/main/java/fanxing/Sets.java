package fanxing;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * @author Demon
 * @date 2022/12/10
 * Set的工具类 合集 交集 a中移除b
 */
public class Sets {
    // 合集
    public static <T> Set<T> union(Set<T> a,Set<T> b){
        Set<T> set = new HashSet<>(a);
        set.addAll(b);
        return set;
    }
    // 交集
    public static <T> Set<T> intersection(Set<T> a,Set<T> b){
        Set<T> set = new HashSet<>(a);
        set.retainAll(b);
        return set;
    }
    // a中移除b
    public static <T> Set<T> difference(Set<T> a,Set<T> b){
        Set<T> set = new HashSet<>(a);
        set.removeAll(b);
        return set;
    }

    public static void main(String[] args) {
        Set<Integer> a = new HashSet<>(Arrays.asList(1,2,3));
        Set<Integer> b = new HashSet<>(Arrays.asList(2,3,4));
        System.out.println(union(a,b));
        System.out.println(intersection(a,b));
        System.out.println(difference(a,b));
    }
}
