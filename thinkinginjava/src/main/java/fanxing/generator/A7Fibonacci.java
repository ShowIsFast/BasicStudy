package fanxing.generator;

import java.util.Iterator;

/**
 * @author Demon
 * @date 2022/12/10
 * 实现斐波那契函数 f(n) = f(n-1)+f(n-2)
 */
public class A7Fibonacci implements A5Generator<Integer>,Iterable<Integer>{
    private int count = 0;
    public A7Fibonacci(){}
    private int size = 0;
    public A7Fibonacci(int size){
        this.size=size;
    }

    @Override
    public Integer next() {
        return f(count++);
    }
    public int f(int n){
        if(n<2)
            return 1;
        return f(n-1)+f(n-2);
    }

    public static void main(String[] args) {
        A7Fibonacci fibonacci = new A7Fibonacci();
        for (int i = 0; i < 18; i++) {
            System.out.print(fibonacci.next()+" ");
        }
        System.out.println("======");
        // 实现iterable
        for (Integer n : new A7Fibonacci(18)){
            System.out.print(n+ " ");
        }

    }

    @Override
    public Iterator<Integer> iterator() {
        return new FibonacciIterator();
    }
    private class FibonacciIterator implements Iterator<Integer>{


        @Override
        public boolean hasNext() {

            return count<size;
        }

        @Override
        public Integer next() {
            return A7Fibonacci.this.f(count++);
        }

        @Override
        public void remove() {
            throw  new UnsupportedOperationException();
        }
    }
}
