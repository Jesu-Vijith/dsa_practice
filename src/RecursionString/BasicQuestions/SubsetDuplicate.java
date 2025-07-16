package RecursionString.BasicQuestions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SubsetDuplicate {
    public static void main(String[] args) {
        int[]arr={2,1,2};
        Arrays.sort(arr);
        List<List<Integer>> list=subSetDuplicate(arr);
        for(List<Integer>list1:list){
            System.out.println(list1);
        }
    }

    static List<List<Integer>> subSetDuplicate(int[]arr){
        List<List<Integer>> outerList=new ArrayList<>();
        List<Integer> list=new ArrayList<>();
        outerList.add(list);
        for(int i=0;i<arr.length;i++){
            int start=0;
            if(i>0 && arr[i]==arr[i-1]){
                start=outerList.size()-1;
            }
            int n=outerList.size();
            for(int j=start;j<n;j++) {
                List<Integer> innerList = new ArrayList<>(outerList.get(i));
                innerList.add(j);
                outerList.add(innerList);
            }
        }
        return outerList;
    }
}
