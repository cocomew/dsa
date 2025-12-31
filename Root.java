package dsa;

import dsa.linklist.*;
import dsa.sort.BubbleSort;
import dsa.sort.InsertionSort;
import dsa.sort.SelectionSort;

import java.util.Scanner;

public class Root {

    public static void main(String[] args) {
        DLL2 s = new DLL2();
        s.add(10);

        s.add(20);
        s.add(30,1);
        s.add(40,0);
        s.add(50,4);
        s.addB(6);
        s.addL(70);
        s.display();





    }
}
