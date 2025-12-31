package dsa.linklist;

import java.util.List;

//0 based singlylinked list implementation
public class SinglyLinkList {
    private Node head;
    private int size;

    private static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public void addFirst(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
        size++;
    }


    public void addAtlast(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
        }else{
            Node current = head;
            while(current.next !=null){
                current = current.next;
            }
            current.next = newNode;
        }
        size++;
    }

    public void add(int data){
        addAtlast(data);
    }
    public void add(int data,int index){
        if(index < 0 || index > size){
            System.out.println("Index out of bounds");
            return;
        }
        if(index ==0){
            addFirst(data);
            return;
        }
        if(index == size){
            addAtlast(data);
            return;
        }

        Node node = new Node(data);
        Node current = head;
        for(int i =0;i<index-1;i++){
            current = current.next;
        }
       node.next = current.next;
         current.next = node;
        size++;
    }

    public int getSize(){
        return size;
    }

    public void deleteFirst(){
        if(head == null)return;
        head = head.next;
        size--;
    }
    public void deleteLast(){
        if(head == null)return;
        if(head.next == null){
            head = null;
        }else{
            Node current = head;
            while(current.next.next != null){
                current = current.next;
            }
            current.next = null;
        }
        size--;
    }
    public void deletebyvalue(int data){
        if(head == null)return;
        if(head.data == data){
            deleteFirst();
            return;
        }
        Node current = head;
        while(current.next != null&& current.next.data!=data){
            current = current.next;

        }
        if(current.next !=null){
            current.next = current.next.next;
            size--;
        }
    }

    public int search(int data){
        Node temp = head;
        int index =0;
        while(temp !=null){
            if(temp.data == data)return index;
            temp = temp.next;
            index++;
        }
        return -1;
    }
    public void display() { System.out.print("LinkList: ");;Node temp = head; while (temp != null) { System.out.print(temp.data + " -> "); temp = temp.next; } System.out.println("null"); }

    public List<Integer> toList() {
        List<Integer> list = new java.util.ArrayList<>();
        Node current = head;
        while (current != null) {
            list.add(current.data);
            current = current.next;
        }
        return list;
    }

    public void buubSort(){
        int [] arr = new int[size];
        Node current = head;
        for(int i =0;i<size;i++){
            arr[i] = current.data;
            current = current.next;
        }


        int n = arr.length;
        for(int i = 0;i<n-1;i++){
            boolean swap = false;
            for(int j = 0 ;j<n-i-1;j++){
                if(arr[j]> arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swap = true;
                }
            }
            if(!swap){
                break;
            }
        }
        System.out.print("BubbleSort: ");
        for(int i: arr){
            System.out.print(i + " -> ");
        }
        System.out.println("null");
    }

    public void update(int oldValue, int newValue){
        Node current = head;
        while(current != null){
            if(current.data == oldValue){
                current.data = newValue;
                return;
            }
            current = current.next;
        }
    }

    public void sort(){
        if(head == null){
            System.out.println("List is empty");
            return;
        }
        for(Node i = head; i!=null; i=i.next){
            for(Node j = i.next; j!=null; j=j.next){
                if(i.data > j.data){
                    int temp = i.data;
                    i.data = j.data;
                    j.data = temp;
                }
            }
        }
    }

}