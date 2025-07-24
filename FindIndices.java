import java.util.*;
public class FindIndices{
    public static void main(String[] args) {
        int arr[]={1,2,3,4,4,5};
        int tar=4;
       System.out.println(findAll(arr,tar,0));
    }
    public static ArrayList<Integer> findAll(int[] arr,int tar,int ind){
     ArrayList<Integer> ls=new ArrayList<>();
       if(ind==arr.length){
                return ls;
              }
              if(arr[ind]==tar){
                ls.add(ind);
              }
              ArrayList<Integer> ans= findAll(arr,tar,ind+1);
              ls.addAll(ans);
              return ls;
             
    }
}
