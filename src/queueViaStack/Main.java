package queueViaStack;

/**
 * Created by btamara on 2017.06.15..
 */
public class Main {

    public static void main(String[] args) {
        MyQueue myQueue = new MyQueue();
        myQueue.add(1);
        myQueue.add(2);
        myQueue.add(3);
        myQueue.remove();
        myQueue.add(4);
        myQueue.remove();
        System.out.println(myQueue.stack1);
        System.out.println(myQueue.stack2);
        myQueue.add(5);
        myQueue.remove();
        myQueue.remove();
        System.out.println(myQueue.stack1);
        System.out.println(myQueue.stack2);
    }
}
