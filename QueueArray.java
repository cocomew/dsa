package dsa;

public class QueueArray {

    private Node front;
    private Node rear;
    private int size;

    private static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // Add element to queue
    public void enqueue(int data) {
        Node node = new Node(data);

        if (rear == null) {   // empty queue
            front = rear = node;
        } else {
            rear.next = node;
            rear = node;
        }
        size++;
    }

    // Remove element from queue
    public int dequeue() {
        if (front == null) {
           System.out.println("Queue is empty");
           return -1;
        }

        int value = front.data;
        front = front.next;

        if (front == null) { // queue becomes empty
            rear = null;
        }
        size--;
        return value;
    }

    // Peek front element
    public int peek() {
        if (front == null) {
            System.out.println("Queue is empty");
            return -1;
        }
        return front.data;
    }

    public boolean isEmpty() {
        return front == null;
    }

    public int size() {
        return size;
    }

    // Display queue
    public void display() {
        Node curr = front;
        System.out.print("Queue: ");
        while (curr != null) {
            System.out.print(curr.data + " <- ");
            curr = curr.next;
        }
        System.out.println("null");
    }
}
