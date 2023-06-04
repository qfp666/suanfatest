package test.sorttest;

import allsort.sort.GuiBingSort;
import allsort.sort.KuaiSuSort;

import java.util.Arrays;

public class KuaiSuSortTest {

        public static void main(String[] args) {
            Integer [] a=new Integer[]{5,4,3,2,1};
           KuaiSuSort.sort(a);
            System.out.println(Arrays.toString(a));

        }


}
