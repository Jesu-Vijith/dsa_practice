package LinearSearch;

public class FindingMaximumNumberIn2DArray{

    static int linearSearch(int[][]arr){
        int maxVal=arr[0][0];
        for(int[]row:arr){
            for(int col:row){
                if(col>maxVal){
                    maxVal=col;
                }
            }
        }
        return maxVal;
    }

    public static void main(String[] args) {
        int[][]arr={
                {1,2,3},
                {4,5,16,7},
                {8,9}
        };
        int ans=linearSearch(arr);
        System.out.println(ans);
    }
}
