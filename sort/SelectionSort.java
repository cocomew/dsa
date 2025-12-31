package dsa.sort;

public class SelectionSort {

    public static  void sort(int[] a){
        int n = a.length;

        for(int i = 0 ; i<n-1;i++){
            int minIndex = i;

            for(int j = i+1; j<n;j++){

                if(a[j]<a[minIndex]){

                    minIndex = j;
                }
            }
            //swap
            int temp = a[minIndex];
            a[minIndex] = a[i];
            a[i] = temp;
        }
    }
}
