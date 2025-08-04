package LeetCode;

public class L_1346_CheckIfN {
    public boolean checkIfExist(int[] arr) {
        for(int i=0;i<arr.length;i++){
            for(int j=arr.length-1;j>=0;j--){
                if(i==j){
                    continue;
                }
                if(arr[i]==2*arr[j]){
                    return true;
                }
            }
        }
        return false;
    }
}
