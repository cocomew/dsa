package dsa;

import java.util.ArrayList;

public class StackWithArrayList {
    private ArrayList<Integer> stack;
    public StackWithArrayList() {
        this.stack = new ArrayList<>();
    }

    public void push(int value) {
        stack.add(value);
    }
    public int pop() {
        if(stack.isEmpty()){
            System.out.println("Stack Underflow");
            return -1;
        }
       return stack.removeLast();

    }
    public int top(){
        if(stack.isEmpty()){
            System.out.println("Stack is empty");
            return -1;
        }
        return stack.getLast();
    }
    public boolean isEmpty(){
        return  stack.isEmpty();
    }
}
//StackWithArrayList stack = new StackWithArrayList();
//
//        stack.push(5);
//        stack.push(15);
//        stack.push(25);
//
//        System.out.println(stack.pop());  // 25
//        System.out.println(stack.top());
//        stack.pop();
//        System.out.println(stack.top());
//        stack.pop();
//        stack.pop();
//        stack.push(2);
//        System.out.println(stack.top());
