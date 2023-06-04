package test.sorttest;


import allsort.sort.GuiBingSort;

import java.util.Arrays;


public class GuiBingTest {
    public static void main(String[] args) {
        Integer [] a=new Integer[]{5,4,3,2,1};
        GuiBingSort.sort(a);
        System.out.println(Arrays.toString(a));

    }

}
