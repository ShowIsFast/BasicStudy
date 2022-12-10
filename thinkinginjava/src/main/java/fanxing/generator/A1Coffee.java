package fanxing.generator;

/**
 * @author Demon
 * @date 2022/12/10
 */
public class A1Coffee {
    private static long counter = 0;
    private final long id = counter++;
    public String toString(){
        return getClass().getSimpleName()+" "+id;
    }
}

