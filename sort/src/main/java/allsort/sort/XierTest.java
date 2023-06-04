package allsort.sort;

import java.util.Arrays;

public class XierTest {

    public static void main(String[] args) {
        Comparable[] a=new Comparable[]{5,4,3,2,1};
        sort(a);
        System.out.println(Arrays.toString(a));
    }

    public static void sort(Comparable[] a){
        int h=1;
        while(h<a.length/2){
            h=h*2+1;
        }
        while(h>=1) {
            for (int i = h; i < a.length; i++) {
                for (int j = i; j >= h; j -= h) {
                    if (bigger(a[j - h], a[j])) {
                        each(a, j - h, j);
                    }
                }
            }
            h=h/2;
        }
    }
    public static Boolean bigger(Comparable i,Comparable j){
        return i.compareTo(j)>0;
    }

    public static void each(Comparable[] a,int  i,int  j){
        Comparable temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }


}
