package fanxing.anonymousinnerclass;

import fanxing.generator.A5Generator;

/**
 * @author Demon
 * @date 2022/12/10
 * 范型应用于内部类 匿名内部类
 */
public class A1Customer {
    private static long counter = 1;
    private final long id = counter++;
    private A1Customer(){}

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                '}';
    }
    public static A5Generator<A1Customer> generator(){
        return new A5Generator<A1Customer>() {
            @Override
            public A1Customer next() {
                return new A1Customer();
            }
        };
    }
}
