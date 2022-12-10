package fanxing.anonymousinnerclass;

import fanxing.generator.A8Generators;

import java.util.*;

/**
 * @author Demon
 * @date 2022/12/10
 * 实现4名服务员按顺序服务15名顾客（服务员随机，一对一服务）
 */
public class BankTeller {
    public static void serve(Teller t,A1Customer c){
        System.out.println(t + " serve " + c);
    }

    public static void main(String[] args) {
        Random random = new Random(47);
        Queue<A1Customer> line = new LinkedList<>();
        A8Generators.fill(line,A1Customer.generator(),15);
        List<Teller> tellers = new ArrayList<>();
        A8Generators.fill(tellers,Teller.generator(),4);
        line.forEach(x ->{
            serve(tellers.get(random.nextInt(tellers.size())),x);
        });
    }
}
