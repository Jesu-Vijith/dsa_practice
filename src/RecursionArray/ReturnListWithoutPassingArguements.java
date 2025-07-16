package RecursionArray;

import java.util.ArrayList;

public class ReturnListWithoutPassingArguements {
    public static void main(String[] args) {
        int[]arr={1,2,1,1,18,9};
        int target=1;
        System.out.println(findingAns(arr,target,0));
    }


    static ArrayList<Integer> findingAns(int[]arr,int target,int index){
        ArrayList<Integer>list=new ArrayList<>();
        if(index==arr.length){
            return list;
        }
        if(arr[index]==target){
            list.add(index);
        }
        ArrayList<Integer>ans=findingAns(arr,target,index+1);
        list.addAll(ans);
        return list;
    }
}
