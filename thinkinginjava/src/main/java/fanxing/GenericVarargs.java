package fanxing;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Demon
 * @date 2022/12/10
 * 可变对象参数支持范型
 */
public class GenericVarargs {
    public static <T> List<T> add(T ... args){
        List<T> list = new ArrayList();
        for (T item : args)
            list.add(item);
        return list;
    }

    public static void main(String[] args) {
        List<String> list = GenericVarargs.add("slow is fast".split(" "));
        System.out.println(list);

    }
}
