package allsort.sort;

public class DiGui {
    public static int  Digui(int  b){
        if(b==1){
            return b;
        }
       return b*Digui(b-1);
    }

}
