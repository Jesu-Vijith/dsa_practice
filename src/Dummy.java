import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Dummy {
    public static void main(String[] args) {
        int[]arr={1,2,3,2};
        List<List<Integer>>list=ownTry(arr);
        System.out.println(list);
    }

    private static List<List<Integer>> ownTry(int[]arr){
        Arrays.sort(arr);
        List<List<Integer>>outer=new ArrayList<>();
        outer.add(new ArrayList<>());
        int start=0;
        int end=0;
        for(int i=0;i<arr.length;i++){
            start=0;
            if(i>0 && arr[i]==arr[i-1]){
                start=end;
            }
            end=outer.size();
            int n=outer.size();
            for(int j=start;j<n;j++){
                List<Integer>inner=new ArrayList<>(outer.get(j));
                inner.add(arr[i]);
                outer.add(inner);
            }
        }
        return outer;
    }
}