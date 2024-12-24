package cn.com.my;

public class Sort {
    public static void selectSort(Sortable[] a){
        Sortable tmp;
        int l=a.length-1;
        for(int i=0;i<l;i++){
            for(int j=i+1;j<l+1;j++) {
                if(a[j].compare(a[i])>0) {
                    tmp = a[i];
                    a[i]=a[j];
                    a[j]=tmp;
                }
            }
        }

    }
}
