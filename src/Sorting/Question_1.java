package Sorting;

public class Question_1 {
    public static void main(String[] args) {
        int[]arr={1,2,3,2,5};
        Question_1 m1=new Question_1();
        int[]ans=m1.findingPair(arr);
        for(int elem:ans){
            System.out.print(elem+" ");
        }
    }

    public int[] findingPair(int[]arr){
        for(int j=0;j<arr.length;j++){
            for(int i=0;i<j;i++){
                if(arr[i]+arr[j]==i+j){
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{-1,-1};
    }
}
