package fanxing.generator;

import java.util.ArrayList;
import java.util.Collection;

/**
 * @author Demon
 * @date 2022/12/10
 * 使用fill方法自动填充生成的对象（咖啡，斐波那契）
 */
public class A8Generators {
    public static  <T> Collection<T> fill(Collection<T> coll,A5Generator<T> gen,int n){
        for (int i = 0; i < n; i++) {
            coll.add(gen.next());
        }
        return coll;
    }

    public static void main(String[] args) {
        // 自动填充咖啡
        Collection<A1Coffee> fill = fill(new ArrayList(), new A6CoffeeGenerator(), 3);
        fill.forEach(x -> System.out.println(x));
        System.out.println();
        // 填充斐波那契
        Collection<Integer> fill1 = fill(new ArrayList<>(), new A7Fibonacci(), 18);
        fill1.forEach(x -> System.out.print(x + " "));


    }
}
