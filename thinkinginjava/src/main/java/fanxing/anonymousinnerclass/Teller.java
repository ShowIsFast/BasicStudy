package fanxing.anonymousinnerclass;

import fanxing.generator.A5Generator;

/**
 * @author Demon
 * @date 2022/12/10
 */
public class Teller {
    // static 该域属于类
    private static long counter = 1;
    private final long id = counter++;
    private Teller(){}
    public static A5Generator<Teller> generator(){
        return new A5Generator<Teller>() {
            @Override
            public Teller next() {
                return new Teller();
            }
        };
    }

    @Override
    public String toString() {
        return "Teller{" +
                "id=" + id +
                '}';
    }
}
