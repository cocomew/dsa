package dsa.linklist;

public class DLL2 {
    private static  class Node{
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

    public void display(){
        Node c = head;
        while(c!=null){
            System.out.print(c.data + " <-> ");
            c = c.next;
        }
        System.out.println("null");

    }

    public void addB(int data){
        Node node = new Node(data);
        if(head==null){
            head = tail = node;
        }
        else{
            node.next = head;
            head.prev = node;
            head = node;
        }
        size++;
    }
    public  void addL(int data){
        Node node = new Node(data);
        if(tail == null){
            tail = head = node;
        }else{
            tail.next = node;
            node.prev = tail;
            tail = node;
        }
        size++;
    }
    public void add(int data){
        addL(data);
    }
    public void add(int data, int index){
        if(index<0 || index> size){
            System.out.println("Index out of bounds");
            return;
        }
        if(index == size){
            addL(data);
            return;
        }
        if(index == 0){
            addB(data);
            return;
        }
        Node node = new Node(data);
        Node c = head;
        for(int i = 0 ; i<index-1;i++){
            c= c.next;
        }

        node.next= c.next;
        node.prev = c;
        c.next = node;
        node.next.prev = node;
        size++;
    }

    public void deleteH(){
        if(head==null)return;
        if(head == tail){
            head = tail = null;
        }
        else{
            head = head.next;
            head.prev = null;
        }
        size--;
    }
    public void deleteL(){
        if(tail==null)return;
        if(tail == head){
            tail = head = null;
        }else{
            tail = tail.prev;
            tail.next = null;
        }
        size--;
    }
    public void deletebyvalue(int data){
        if(head==null)return;
        Node c = head;
        while(c!=null){
            if(c.data == data){
                if(c == tail){
                    deleteL();
                    return;
                }
                else if(c == head){
                    deleteH();
                    return;
                }
                else{
                   c.prev.next = c.next;
                     c.next.prev = c.prev;
                        size--;
                }
                return;
            }
            c = c.next;
        }
        System.out.println(data+" not found");

    }

    public void deletebyIndex(int index){
        if(index<0 || index>size){
            System.out.println("Index out of bounds");
            return;
        }
        if(index == 0){
            deleteH();
            return;
        }
        if(index == size-1){
            deleteL();
            return;}
        Node c = head;
        for(int i =0 ; i<index;i++){
            c= c.next;  }

        c.prev.next = c.next;
        c.next.prev = c.prev;
        size--;
    }


}
