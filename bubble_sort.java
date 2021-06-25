import java.util.*;
public class bubble_sort {
    public static void main(String[] args) {
        int a[]={7,5,-3,-4,85};
        int n=a.length;//taking length of array
        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-1;j++){
                if(a[j+1]<a[j]){
                    int temp=a[j+1];
                    a[j+1]=a[j];
                    a[j]=temp;
                }
            }
        }
        for(int e:a){//using for each loop and store each array value in e
                System.out.print(e+" ");
        }
    }
}
