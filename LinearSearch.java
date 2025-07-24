import java.util.ArrayList;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {1, 2, 4,4, 5};
        int tar = 4;
        System.out.println(searchIndexes(arr,tar,0,new ArrayList<Integer>()));
    }
    public static ArrayList<Integer> searchIndexes(int[] arr,int tar,int ind,ArrayList<Integer> ls){
              if(ind==arr.length){
                return ls;
              }
              if(arr[ind]==tar){
                ls.add(ind);
              }
              return searchIndexes(arr,tar,ind+1,ls);

    }

}

