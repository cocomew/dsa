package dsa.linklist;

public class CLL {
    private int size;
    private Node tail;


   private static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    public CLL(){
        this.size =0;
        this.tail = null;
    }
    public void insertAtBegining(int data){
       Node node = new Node(data);
       if(tail == null){
           node.next = node;
           tail = node;
           size++;
           return;
       }
       node.next = tail.next;
       tail.next = node;
       size++;

    }

    public void insertAtEnd(int data){
       Node node = new Node(data);
       if(tail == null){
           node.next = node;
           tail = node;
       }else{
           node.next = tail.next;
           tail.next = node;
           tail = node;
       }
       size++;
       return;
    }

    public void insert(int data){
        insertAtEnd(data);
    }
    public void insert(int data, int index){
       if(index<0 || index> size){
              System.out.println("Index out of bounds");
              return;
       }

       if(index == size){
           insertAtEnd(data);
           return;
       }
       if(index ==0){
           insertAtBegining(data);
           return;
       }
       Node node = new Node(data);
       Node current = tail.next;
       for(int i = 0; i<index-1;i++){
              current = current.next;
       }
       node.next = current.next;
       current.next = node;
       size++;
       return;
    }

    public  void deletefrombegiing(){
       if(tail == null){
              System.out.println("List is empty");
              return;
       }
       if(tail.next == tail){
              tail = null;
       }
       else{
           tail.next = tail.next.next;

       }
         size--;

    }

    public void deleteFromend(){
         if(tail == null){
                  System.out.println("List is empty");
                  return;
         }
         if(tail.next == tail){
                    tail = null;

         }else{
             Node current = tail.next;
             while (current.next != tail){
                    current = current.next;
             }
                current.next = tail.next;
             tail = current;

         }
         size--;


   }

   public void delete(int index){
         if(index<0 || index>= size){
                  System.out.println("Index out of bounds");
                  return;
         }
         if(index ==0){
              deletefrombegiing();
              return;
         }
         if(index == size-1){
              deleteFromend();
              return;
         }
         Node current = tail.next;
         for(int i =0; i<index-1;i++){
                  current = current.next;
         }
         current.next = current.next.next;
         size--;



   }

   public int search(int data){
       Node current = tail.next;
       int index = 0;
       do{
           if(current.data == data)return index;
           current = current.next;
           index++;

       }while(current != tail.next);
       return -1;
   }


    public void printList() {
        if (tail == null) {
            System.out.println("List is empty");
            return;
        }

        Node current = tail.next;
        do {
            System.out.print(current.data + " -> ");
            current = current.next;
        } while (current != tail.next);

        System.out.println("(back to head)");
    }

}
