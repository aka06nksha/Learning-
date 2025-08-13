
import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] arr={5,4,1,2,3,6};
        mergesort(arr,0,5);
        System.out.println(Arrays.toString(arr));
    }
    public static void mergesort(int[] arr,int low,int high){
        if(low>=high){
            return ;
        }
        int mid=(low+high)/2;
      mergesort(arr,low,mid);
      mergesort(arr, mid+1, high);
       ms(arr,low,mid,high);
    }
    public static void ms(int[] arr,int low,int mid,int high){

          int[] temp=new int[high-low+1];
          int i=low,j=mid+1,k=0;
          while(i<=mid&& j<=high){
            if(arr[i]<=arr[j]){
                temp[k]=arr[i];
                i++;
            }
            else if(arr[i]>arr[j]){
                temp[k]=arr[j];
                j++;
            }
             k++;
          }
          while(i<=mid){
            temp[k++]=arr[i];
            i++;
          }
          while(j<=high){
            temp[k++]=arr[j];
            j++;
          }
          for(int m=0;m<temp.length;m++){
            arr[low+m]=temp[m];
          }
    }
}
