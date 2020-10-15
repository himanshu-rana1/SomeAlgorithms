package TopAlgorithms;

import java.util.Scanner;

public class MergeSort {

    public void mSort(int[] a, int p, int q){
        if(p<q){

        }
    }

    public static void main(String[] args) {
        System.out.println("Enter Size");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] a = new int[size];
        for(int i=0; i<size; i++){
            a[i] = sc.nextInt();
        }

        MergeSort mergeSort = new MergeSort();
        mergeSort.mSort(a, 0, size-1);
    }
}
