package fanxing.tuple;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Demon
 * @date 2022/12/10
 * 使用范型可以轻易构建负责对象（类型定义不允许范型中的范型）
 *
 */
public class A5TupleTest<A,B,C> extends ArrayList<A2ThreeTuple<A,B,C>> {

    public static void main(String[] args) {
        A5TupleTest<String,String,Integer> list =
                new A5TupleTest<>();
        list.add(A4Tuple.threeTuple("slow","is",27));
        System.out.println(list);
    }

}
