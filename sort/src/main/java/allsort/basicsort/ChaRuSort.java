package allsort.basicsort;

public class ChaRuSort {

    public static void sort(Comparable [] a){
        for(int i=1;i< a.length;i++){
            for(int j=i;j>0;j--){
                   if (big(a[j-1],a[j])){
                           each(a,j-1,j);
                }
                }
            }
        }


    public static boolean big(Comparable a,Comparable b){
        return  a.compareTo(b)>0;
    }

    public static void each(Comparable [] a,int j,int i){
       Comparable temp=a[j];
       a[j] = a[i];
       a[i] = temp;

    }

}
