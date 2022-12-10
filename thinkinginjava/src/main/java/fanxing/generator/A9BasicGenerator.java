package fanxing.generator;

/**
 * @author Demon
 * @date 2022/12/10
 * 该类用于返回某类对象的生成器
 */
public class A9BasicGenerator<T> implements A5Generator<T> {
    private Class<T> type;
    public A9BasicGenerator(Class<T> type){
        this.type = type;
    }
    @Override
    public T next() {
        try {
            return type.newInstance();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    public static  <T> A5Generator<T> create(Class<T> type){
        return new A9BasicGenerator<>(type);
    }

    public static void main(String[] args) {
        A5Generator<A1Coffee> gen = A9BasicGenerator.create(A1Coffee.class);
        for (int i = 0; i < 5; i++) {
            System.out.println(gen.next());
        }
    }
}
