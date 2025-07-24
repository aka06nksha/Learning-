public class RotatedBinarySearch {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6};
        
        System.out.println(BinarySearch(arr,0,arr.length-1,6));
        
    
}
public static int BinarySearch(int[] arr,int s,int e,int tar){
    while(s<=e){
         int mid=s+(e-s)/2;
         if(arr[mid]==tar){
            return mid;
         }
         else if(arr[mid]>tar){
            e=mid-1;
         }
         else{
            s=mid+1;
         }
}
return -1;
}
}
