package LeetCode;

public class L_941_MountainArray {

    public boolean isValidMountain(int[]arr){
        int max=Integer.MIN_VALUE;
        int pivot=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                pivot=i;
                max=arr[i];
            }
        }
        if(pivot==0 || pivot==arr.length-1){
            return false;
        }
        for(int j=1;j<=pivot;j++){
            if(arr[j]<=arr[j-1]){
                return false;
            }
        }
        for(int k=pivot+1;k<arr.length;k++){
            if(arr[k]>=arr[k-1]){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[]arr={3,5,5};
        L_941_MountainArray ans=new L_941_MountainArray();
        System.out.println(ans.isValidMountain(arr));
    }
}
