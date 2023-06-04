package test.bascisortTest;

import allsort.basicsort.MaoPaoSort;

public class MaoPaoSortTest {
    public static void main(String[] args) {
        Comparable [] a = new Comparable[]{5,4,3,2,1};
        MaoPaoSort.sort(a);
        for(Comparable b:a){
            System.out.println(b);
        }
    }
}
