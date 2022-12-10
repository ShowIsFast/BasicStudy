package fanxing.tuple;

/**
 * @author Demon
 * @date 2022/12/10
 * 继承2维元祖，实现返回更多对象的元祖
 */
public class A2ThreeTuple<A,B,C> extends A1TwoTuple<A,B> {
    public final C third;

    public A2ThreeTuple(A first, B second, C third) {
        super(first, second);
        this.third = third;
    }

    @Override
    public String toString() {
        return "A2ThreeTuple{" +
                "first="+first+
                ",second="+second+
                ",third="+third+
                "}";
    }
}
