public class RotatedBinarySearch {
    public static void main(String[] args) {
        int arr[] ={4,5,6,1,2,3};
        System.out.println(search(arr,0,arr.length-1,3));

    }
    public static int search(int[] arr,int s,int e,int tar){
            while(s<=e){
                int mid=s+(e-s)/2;
                if(arr[mid]==tar){
                    return mid;
                }
                else if(arr[s]<=arr[mid]){
                        if(tar>=arr[s] && tar<=arr[mid]){
                           return search(arr,s,mid-1,tar);
                        }
                        else{
                            return search(arr,mid+1,e,tar);
                        }
                }
                else{
                     if(arr[mid]<arr[s]){
                           if(tar<arr[s] && tar>arr[mid]){
                                 return search(arr,mid+1,e,tar);
                           }
                           else{
                            return search(arr,s,mid-1,tar);
                           }
                     }
                }
            }
            return -1;
    }
}
