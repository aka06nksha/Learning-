public class BinarySearchRecursion {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6};
        
        System.out.println(BinarySearch(arr,0,arr.length-1,7));
        
    
}
public static int BinarySearch(int[] arr,int s,int e,int tar){
    while(s<=e){
         int mid=s+(e-s)/2;
         if(arr[mid]==tar){
            return mid;
         }
         else if(arr[mid]>tar){
            return BinarySearch(arr, s,mid-1,tar);
         }
         else{
            return BinarySearch(arr, mid+1, e, tar);
         }
}
return -1;
}
}
