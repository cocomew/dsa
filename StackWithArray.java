package dsa;

public class StackWithArray {
    private  int[] stack;
    private int top;
    private int capacity;

    public StackWithArray(int capacity) {
        this.capacity = capacity;
        this.stack = new int[capacity];
        this.top =-1;

    }


    public void push(int data){
        if(top == capacity-1){
            System.out.println("Stack Overflow");
            return;
        }
        stack[++top] = data;
    }
    public int pop(){
        if(top ==-1){
            System.out.println("Stack Underflow");
            return -1;
        }
        return stack[top--];
    }
    public  int top(){
        if(top == -1){
            System.out.println("Stack is empty");
            return -1;
        }
        return stack[top];
    }
    public boolean isEmpty(){
        return top == -1;
    }
    public boolean isFull(){
        return top == capacity -1;
    }
}
// System.out.println("Welcome to the Data Structures and Algorithms package!");
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter Size of Stack:");
//        int size = sc.nextInt();
//        StackWithArray stack = new StackWithArray(size);
//        stack.push(10);
//        stack.push(20);
//        stack.push(30);
//        System.out.println("Top element is: " + stack.top());
//        System.out.println("Popped element is: " + stack.pop());
//        System.out.println("Is stack empty? " + stack.isEmpty());
//        System.out.println("Is stack full? " + stack.isFull());
//
//        sc.close();