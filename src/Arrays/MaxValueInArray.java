package Arrays;

public class MaxValueInArray {
    public static void main(String[] args) {
        int[]arr={1,2,4,5,0,7};
        int maxVal=maxValue(arr,2,4);
        System.out.println(maxVal);
    }
    static int maxValue(int[]arr,int index1,int index2){
        if (arr==null){
            return -1;
        }
        if(index1>index2){
            return -1;
        }
        if(arr.length==0){
            return -1;
        }
        int maxVal=arr[index1];
        for(int i=index1;i<=index2;i++){
            if(arr[i]>maxVal){
                maxVal=arr[i];
            }
        }
        return maxVal;
    }
}
