package allsort.sort;

public class GuiBingSort {


    //归并所需要的辅助数组
    private static Comparable[] assist;

    public static void sort(Comparable[] a){
        //初始化辅助数组assist
        assist = new Comparable[a.length];
        //定义两个变量lo和hi 分别记录数组最小索引和最大索引
        int lo=0;
        int hi=a.length-1;
        // 调用方法sort完成数组a中索引lo到hi中的排序
        sort(a,lo,hi);
    }

    //对数组a从lo到hi进行排序
    public static void sort(Comparable[] a,int lo,int hi){
          if(hi<=lo){
              return;
          }
          //对lo到hi进行分组
          int mid=lo+(hi-lo)/2;
          // 分完组后对组进行排序
          sort(a,lo,mid);
          sort(a,mid+1,hi);
          // 把组进行合并
          merge(a,lo,mid,hi);
    }

    // 对数组中 lo到mid 为一组 mid+1到hi为一组 对着两组数据进行归并
    public static void merge(Comparable[] a,int lo,int mid,int hi){
         //定义三个指针
         int p1=lo;
         int p2=mid+1;
         int p3=lo;

         //遍历，移动p1指针和p2指针，比较对应索引处的值，找出小的那个，放到辅助数组对应索引处
         while(p1<=mid&&p2<=hi){
             if(less(a[p1],a[p2])){
                 assist[p3++]=a[p1++]; //先赋值再++
             }else{
                 assist[p3++]=a[p2++];
             }
         }
         //遍历,如果p1的指针没有走完，那么顺序移动p1指针，把对应的元素放到辅助数组对应索引处
         while(p1<=mid){
              assist[p3++]=a[p1++];
          }
         //遍历,如果p2的指针没有走完，那么顺序移动p2指针，把对应的元素放到辅助数组对应索引处
         while(p2<=hi){
             assist[p3++]=a[p2++];
         }
         //把辅助数组的元素拷贝到原数组中
         for(int index=lo;index<=hi;index++){
             a[index]=assist[index];
         }
    }

    public static boolean less(Comparable a,Comparable b){
        return a.compareTo(b)<0;
    }

    public static void each(Comparable [] a,int i ,int j){
        Comparable temp = 0;
        temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
}
