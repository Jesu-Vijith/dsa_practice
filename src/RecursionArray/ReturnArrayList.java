package RecursionArray;

import java.util.ArrayList;

public class ReturnArrayList {
    public static void main(String[] args) {
        int[]arr={1,2,1,1,18,9};
        ArrayList<Integer>list=new ArrayList<>();
        int target=1;
        System.out.println(findingOccurance(arr,list,target,0));
    }

    static ArrayList<Integer> findingOccurance(int[]arr,ArrayList<Integer> list,int target,int index){
        if(arr[index]==target){
            list.add(index);
        }
        index++;
        return(index>arr.length-1)?list:findingOccurance(arr,list,target,index);
    }
}
