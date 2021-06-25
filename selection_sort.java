import java.util.*;
public class selection_sort {
    public static void main(String[] args) {
        int a[]={13,1,-8,-88,99};
        int n=a.length;
        for(int i=0;i<n-1;i++){
            int min=i;//initialize by i, here first element like
            for(int j=i;j<n;j++){//yahaa loop utne hi time chalega jitne ith position pe hoga
                if(a[j]<a[min]){
                    min=j;
                }
            }
            int temp=a[i];
            a[i]=a[min];
            a[min]=temp;
        }
        for(int e:a){
            System.out.print(e+" ");
        }
    }
}
