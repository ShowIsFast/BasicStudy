package fanxing.tuple;

/**
 * @author Demon
 * @date 2022/12/
 * 优化元祖对象，直接从静态方法获取
 */
public class A4Tuple {
    public static <A,B> A1TwoTuple<A,B> twoTuple(A first,B second){
        return new A1TwoTuple<>(first,second);
    }
    public static <A,B,C> A2ThreeTuple<A,B,C> threeTuple(A first,B second,C third){
        return new A2ThreeTuple<>(first,second,third);
    }

    public static void main(String[] args) {
        System.out.println(threeTuple("slow","is","fast"));
    }
}
