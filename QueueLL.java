package dsa;

public class QueueLL {

    private class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    private Node front;
    private Node rear;

    public void enqueue(int data){
        Node node = new Node(data);
        if(rear == null){
            front = rear = node;
            return;}
        rear.next = node;
        rear = node;
    }
    public int dequeue(){
        if(front == null){
            System.out.println("Queue is empty");
            return -1;
        }
        int data = front.data;
        front = front.next;
        if(front == null){
            rear = null;
        }
        return data;
    }
    public void display(){
        if(front == null){
            System.out.println("Queue is empty");
            return;
        }
        Node current = front;
        while(current != null){
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    public void peek(){
        if(front == null){
            System.out.println("Queue is empty");
            return;
        }
        System.out.println("Front element is: " + front.data);
    }
}
