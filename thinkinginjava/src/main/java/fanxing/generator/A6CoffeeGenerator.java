package fanxing.generator;

import java.util.Iterator;
import java.util.Random;

/**
 * @author Demon
 * @date 2022/12/10
 * 可随机生成不同类型的coffee对象
 */
public class A6CoffeeGenerator implements A5Generator<A1Coffee>,Iterable<A1Coffee> {
    private Class[] types = {A2Latte.class,A3Mocha.class,A4Cappuccino.class};
    private Random random = new Random(47);
    public A6CoffeeGenerator(){

    }
    int size = 0;
    public A6CoffeeGenerator(int size){
        this.size= size;
    }
    public A1Coffee next(){
        try {
            return (A1Coffee) types[random.nextInt(types.length)].newInstance();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    @Override
    public Iterator<A1Coffee> iterator() {
        return new CoffeeIterator() ;
    }
    class CoffeeIterator implements Iterator<A1Coffee>{
        int count = size;

        @Override
        public boolean hasNext() {
            return count>0;
        }

        @Override
        public A1Coffee next() {
            count--;
            return A6CoffeeGenerator.this.next();
        }

        @Override
        public void remove() {
            throw new UnsupportedOperationException();
        }

    }

    public static void main(String[] args) {
        //  普通循环遍历
        A6CoffeeGenerator gen = new A6CoffeeGenerator();
        for (int i = 0; i < 5; i++) {
            System.out.println(gen.next());
        }
        // 实现iterable接口 构造函数和counter-- 作为末端哨兵
        for (A1Coffee c : new A6CoffeeGenerator(5)){
            System.out.println(c);
        }

    }
}
