package RecursionArray;

import java.util.ArrayList;
import java.util.Arrays;

public class LinearSearchWithRecursionOnMultipleOccurance {
    public static void main(String[] args) {
        int[]arr={3,2,1,1,18,9};
        int target=1;
        System.out.println(multipleOccurance(arr,target,0));
    }

    static ArrayList<Integer>list=new ArrayList<>();
     
    static ArrayList<Integer> multipleOccurance(int[]arr,int target,int index){
        if(arr[index]==target){
            list.add(index);
        }
        index++;
        return(index>arr.length-1)?list:multipleOccurance(arr,target,index);
    }
}
