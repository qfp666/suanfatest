package allsort.basicsort;

public class XuanZeSort {
    public static void sort(Comparable [] a) {
    for(int i=0;i<a.length;i++){
        int min=i;
        for(int j=i+1;j<a.length;j++){
            if(big(a[min],a[j])){
                min=j;    //找出最小的索引值
            }
        }
        each(a,min,i);   //然后交换位置
    }
    }

    public static boolean big(Comparable a,Comparable b){
        return a.compareTo(b)>0;
    }


    public static void each(Comparable [] a,int min ,int i){
        Comparable temp = 0;
        temp = a[i];
        a[i] = a[min];
        a[min] = temp;
    }
    }

