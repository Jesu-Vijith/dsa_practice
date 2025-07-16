package RecursionArray;

public class LinearSearchWithRecursion {
    public static void main(String[] args) {
        int[]arr={3,2,1,18,9};
        int target=-1;
        System.out.println(indexUsingLs(arr,target,0));
    }
    static int indexUsingLs(int[]arr,int target,int index){
        if(arr[index]==target){
            return index;
        }
        index++;
        return (index>arr.length-1)?-1:indexUsingLs(arr,target,index);
    }
}
