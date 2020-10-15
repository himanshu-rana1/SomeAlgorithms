package TopAlgorithms;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class QuickSort {

    public List<Integer> qSort(List<Integer> list, int start, int end){
        if(start == end)
            return list.subList(start,end);
        int index = partition(list, start, end);
        qSort(list, 0, index-1);
        qSort(list, index+1, end);
        return list;
    }

    public int partition(List<Integer> list, int start, int end){
        int p,i,j;
        p= start;
        i=start;
        j=start+1;

        while(j <= end){
            if(list.get(p) > list.get(j)){
                i++;
                int temp = list.get(j);
                list.set(j,list.get(i));
                list.set(i, temp);
            }
            j++;
        }

        int temp = list.get(i);
        list.set(i,list.get(p));
        list.set(p, temp);

        return i;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size");
        int size  = sc.nextInt();
//        String s = sc.next();
//        int size1 = Integer.parseInt(s);
        List<Integer> list = new ArrayList<>(size);

        for(int i =0; i<size; i++)
            list.add(sc.nextInt());

        //Collections.sort(list);
        QuickSort quickSort = new QuickSort();
        quickSort.qSort(list, 0, list.size()-1);

        for(int i: list)
            System.out.println(list.get(i));
    }
}
