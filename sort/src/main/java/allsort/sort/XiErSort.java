package allsort.sort;

public class XiErSort {
    public static void sort(Comparable [] a){
        int h=1;
        while(h<a.length/2){
            h=2*h+1;
        }
        while(h>=1){
            //找到待插入的元素
            for(int i=h;i<a.length;i++){
                for(int j=i;j>=h;j-=h){
                    if(big(a[j-h],a[j])){
                        each(a,j-h,j);
                    }else{
                        break;
                    }
                }
            }
            h=h/2;

        }
    }

    public static boolean big(Comparable a,Comparable b){
        return a.compareTo(b)>0;
    }

    public static void each(Comparable [] a,int i,int j){
        Comparable temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
}
