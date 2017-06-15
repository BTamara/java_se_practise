package queueViaStack;

import java.util.Stack;

/**
 * Created by btamara on 2017.06.15..
 */
public class MyQueue {

    Stack<Integer> stack1;
    Stack<Integer> stack2;

    public  MyQueue(){
        this.stack1 = new Stack<>();
        this.stack2 = new Stack<>();
    }

    public int size(){
        return stack1.size() + stack2.size();
    }

    public void add(Integer input){
        stack1.push(input);
    }

    public Integer remove(){
        if(!stack2.isEmpty()){
            return stack2.pop();
        }
        if(stack2.isEmpty() || stack1.size()>0){
            while (!stack1.empty()){
                stack2.push(stack1.pop());
            }
            return stack2.pop();
        }
        return stack2.pop();
    }

}
