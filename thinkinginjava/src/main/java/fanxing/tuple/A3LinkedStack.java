package fanxing.tuple;

/**
 * @author Demon
 * @date 2022/12/10
 * 不实用linkedlist，使用范性实现内部链式存储结构
 */
public class A3LinkedStack<T>{
    private static class Node<U>{
        U item;
        Node<U> next;

        public Node() {
            item =null;
            next= null;
        }

        public Node(U item, Node<U> next) {
            this.item = item;
            this.next = next;
        }
        boolean end(){
            return next ==null;
        }
    }
    Node<T> top = new Node<>();
    public void push(T item){
        if(item == null)
            return;
        top = new Node(item,top);
    }
    public T pop(){
        T result = top.item;
        if(!top.end())
            top=top.next;
        return result;
    }

    public static void main(String[] args) {
        A3LinkedStack<String> linkedStack= new A3LinkedStack<>();
        for (String str:"slow is fast".split(" ")){
            linkedStack.push(str);
        }
        linkedStack.push(null);//实际没有存入
        linkedStack.push("bug");
        String s;
        while ((s=linkedStack.pop())!=null){
            System.out.println(s);
        }

    }

}
