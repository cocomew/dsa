package dsa.linklist;

public class SLL {
    private static  class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }

    }
        private Node head;

        private  int size;

        public void addB(int data){
            Node node  = new Node(data);
            if(head == null){
                head = node;
                size++;
                return;
            }
            node.next = head;
            head = node;
            size++;
        }

        public void addL(int data){
            Node node = new Node(data);
            if(head == null){
                head = node;
                size++;
                return;
            }
            Node c= head;
            while(c.next != null){
                c= c.next;
            }
            c.next= node;
            size++;

        }
        public void add(int data){
            addL(data);
        }
        public void add(int data, int index){
            if(index<0 || index>size){
                System.out.println("Invalid index");
                return;
            }

            if(index==0) {
                addB(data);
                return;
            }
            if(index==size){
                addL(data);
                return;
            }
            Node node = new Node(data);
            Node c = head;
            for(int i =0;i<index-1;i++){
                c= c.next;
            }
            node.next = c.next;
            c.next = node;
            size++;



        }


        public void display(){
            Node c = head;
            while(c != null){
                System.out.print(c.data+" -> ");
                c= c.next;
            }
            System.out.println(" null");
        }

        public void deleteF(){
            if(head == null)return;
            head = head.next;
            size--;
        }

        public void deleteL(){
            if(head == null)return;
            if(head.next==null){
                head = null;
                size--;
                return;
            }

            Node c = head;

            while(c.next.next != null){
                c= c.next;
            }
            c.next = null;
            size--;
        }
        public void delete(int data){
            if(head==null) return ;
            if(head.data == data){
                deleteF();
                return;
            }
            Node c = head;
            while(c.next!= null && c.next.data != data){
                c = c.next;
            }
            if(c.next!=null){
                c.next = c.next.next;
                size--;
            }
        }


        public void search(int data){
            Node c = head;
            int  index =0;
            while(c != null){
                if(c.data == data){
                    System.out.println("Element found at index: "+ index);
                    return;
                }
                c= c.next;
                index++;
            }
            System.out.println("Element not found");
        }
        public void deleteat(int index){
            if(index<0 || index>=size){
                System.out.println("Invalid index");
                return;
            }
            if(index==0){
                deleteF();
                return;
            }
            if(index==size-1){
                deleteL();
                return;
            }
            Node c = head;
            for(int i =0;i<index-1;i++){
                c= c.next;
            }
            c.next = c.next.next;
            size--;
        }
    }

