package dsa;

import dsa.linklist.*;
import dsa.sort.BubbleSort;
import dsa.sort.InsertionSort;
import dsa.sort.SelectionSort;

import java.util.Scanner;

public class Root {

    public static void main(String[] args) {
        SinglyLinkList list = new SinglyLinkList();
        list.add(10);
        list.add(20);
        list.add(30,1);
        list.addFirst(5);
        list.add(-10);
list.addAtlast(100);
list.add(400);
list.add(399);
list.display();
list.buubSort();
list.display();





    }
}
