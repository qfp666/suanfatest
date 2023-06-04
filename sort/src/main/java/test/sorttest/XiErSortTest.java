package test.sorttest;

import allsort.sort.XiErSort;

public class XiErSortTest {
    public static void main(String[] args) {
        Comparable [] a= new Comparable[]{6,5,4,3,2,1};
        XiErSort.sort(a);
        for(Comparable b:a){
            System.out.println(b);
        }
    }
}
