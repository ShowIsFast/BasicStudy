package fanxing;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * @author Demon
 * @date 2022/12/10
 * 该工具类用于调用select方法随机获取对象
 */
public class RandomList<T> {
    private List<T> storage = new ArrayList<>();
    private Random random = new Random(47);
    public void add(T item){
        storage.add(item);
    }
    public T select(){
        return storage.get(random.nextInt(storage.size()));
    }

    public static void main(String[] args) {
        RandomList<String> randomList = new RandomList<>();
        for (String str : "slow is fast".split(" ")){
            randomList.add(str);
        }
        for (int i = 0; i < 3; i++) {
            System.out.println(randomList.select());
        }
    }
}
