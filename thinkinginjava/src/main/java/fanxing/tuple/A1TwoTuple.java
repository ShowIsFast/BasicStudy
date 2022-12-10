package fanxing.tuple;

/**
 * Demon
 * 2维元祖，可以创建通用的用于返回多个数组的对象
 */
public class A1TwoTuple<A,B> {
    public final A first;
    public final B second;

    public A1TwoTuple(A first, B second) {
        this.first = first;
        this.second = second;
    }

    @Override
    public String toString() {
        return "TwoTuple{" +
                "first=" + first +
                ", second=" + second +
                '}';
    }
}
