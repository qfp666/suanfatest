package allsort.sort;

public class KuaiSuSort {
    public static void sort(Comparable[] a){
        int lo=0;
        int hi=a.length-1;
        sort(a,lo,hi);
    }

    //对数组a从lo到hi进行排序
    public static void sort(Comparable[] a,int lo,int hi){
            //安全性检验
        if(hi<=lo){
            return ;
        }
        //需要对lo到hi索引处的元素进行分组(左子组,右子组)
        int partition = partition(a, lo, hi);  //返回的是分组的索引,分界值变幻后的索引
        //让左子组有序
        partition(a, lo, partition - 1);
        //让右子组有序
        partition(a, partition+1, hi);
    }

    // 对数组中lo到hi进行分组 并返回分组界限对应的索引
    public static  int partition(Comparable[] a,int lo,int hi){
        //确定分界值
        Comparable key = a[lo];
        //定义左右指针
        int left = lo;
        int right = hi+1;
        //切分
        while(true){
           //先从右往左边扫描,移动right指针，找到一个比分解值小的元素，停止
           while(less(key,a[--right])){
               if(right==lo){
                   break;
               }
           }
           //再从左往右边扫描,移动left指针，找到一个比分解值大的元素，停止
           while(less(a[++left],key)){
               if(left==hi){
                   break;
               }
           }
           //判断left>=right 如果是 证明元素交换完毕,结束循环,如果不是,则交换元素
           if(left>=right){
               break;
           }else{
               each(a,left,right);
           }
        }
        //交换我们的分界值 返回分解值所在的索引
        each(a,lo,right);
        return right;
    }





    public static boolean less(Comparable a,Comparable b){
        return a.compareTo(b)<0;
    }

    public static void each(Comparable [] a,int i ,int j){
        Comparable temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
}
