package dsa;

import dsa.linklist.*;
import dsa.sort.BubbleSort;
import dsa.sort.InsertionSort;
import dsa.sort.SelectionSort;

import java.util.Scanner;

public class Root {

    public static void main(String[] args) {
       SinglyLinkList dll = new SinglyLinkList();
         dll.add(100);
         dll.add(90);
        dll.add(80);
        dll.add(70);
        dll.add(60);
        dll.display();
        dll.sort();
        dll.display();






    }
}
