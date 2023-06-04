package test.bascisortTest;

import allsort.basicsort.ChaRuSort;

public class ChaRuSortTest {
    public static void main(String[] args) {
        Comparable [] a = new Comparable[]{5,4,3,2,1};
        ChaRuSort.sort(a);
        for(Comparable b: a){
            System.out.println(b);
        }
    }
}
