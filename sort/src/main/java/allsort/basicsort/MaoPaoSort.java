package allsort.basicsort;

public class MaoPaoSort {

    public static void sort(Comparable [] a){
         for(int i=0;i<a.length-1;i++){
             for(int j=1;j<a.length-i;j++){
                if(big(a[j-1],a[j])){
                    each(a,j-1,j);
                }
             }
         }
    }
    public static boolean big(Comparable a,Comparable b){
        return a.compareTo(b)>0;
    }

    public static void each(Comparable [] a,int i,int j){
        Comparable temp = 0;
        temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

}
