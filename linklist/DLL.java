package dsa.linklist;

public class DLL {

    private static class Node{
        int data;
        Node next;
        Node prev;
        Node(int data){
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }

    private Node head;
    private Node tail;
    private int size;

    public void InsertAtHead(int data){
        Node node = new Node(data);
        if(head == null){
            head = tail = node;
        }
        else{
            node.next = head;
            head.prev = node;
            head = node;
        }
        size++;
    }

    public void insertAtTail(int data){
        Node node = new Node(data);
        if(tail == null){
            tail = head= node;

        }else{
            tail.next = node;
            node.prev = tail;
            tail = node;
        }
        size++;

    }

    public void insert(int data){
        insertAtTail(data);
    }
    public void insert(int data, int index){
        if(index<0 || index>size){
            System.out.println("Index out of bounds")  ;
            return ;
        }
        if(index==0){
            InsertAtHead(data);
            return;
        }
        if(index == size){
            insertAtTail(data);
            return; }

        Node node = new Node(data);
        Node temp = head;
        for(int i =0; i<index-1 ;i++){
            temp = temp.next;
        }
        node.next = temp.next;
        node.prev = temp;
        temp.next.prev = node;
        temp.next = node;
        size++;

    }

    public void deletehead(){
        if(head == null){
            System.out.println("head is null");
            return;
        }
        if(head == tail){
            head = tail = null;
        }else{
            head = head.next;
            head.prev = null;
        }
        size--;
    }

    public  void Deletetail(){
        if(tail == null){
            System.out.println("tail is null");
            return;

        }
        if(tail == head){
            tail = head = null;
        }else{
            tail = tail.prev;
            tail.next = null;
        }
        size--;
    }
    public void deletebyValue(int data){
        if(head == null){
            System.out.println("head is null");
            return;
        }
        Node temp = head;
        while(temp != null){
            if(temp.data == data){
                if(temp==head){
                    deletehead();
                }
                else if(temp==tail){
                    Deletetail();
                }
                else{
                    temp.prev.next = temp.next;
                    temp.next.prev = temp.prev;
                    size--;
                }
                return;
            }
            temp = temp.next;
        }
        System.out.println("Data "+data+" is out of bounds");
    }
        public void displayForward(){
        Node current = head;
        System.out.println("Forward direction");
        while(current!=null){
            System.out.print(current.data+" <-> ");
            current = current.next;
            }
            System.out.println("null");
        return;
        }

        public void displayBackward(){
            Node current = tail;
            System.out.println("Backward direction");
            while(current!=null){
                System.out.print(current.data+" <-> ");
                current = current.prev;
            }
            System.out.println("null");
            return;
        }
}
