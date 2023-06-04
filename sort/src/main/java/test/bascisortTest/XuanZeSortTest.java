package test.bascisortTest;

import allsort.basicsort.XuanZeSort;

public class XuanZeSortTest {
    public static void main(String[] args) {
        Comparable [] a= new Comparable[]{6,5,4,3,2,1};
        XuanZeSort.sort(a);
        for(Comparable b:a){
            System.out.println(b);
        }
    }
}
