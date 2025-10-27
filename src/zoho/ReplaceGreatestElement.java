package zoho;

import java.util.Arrays;

public class ReplaceGreatestElement {
    public static void main(String[] args) {
        int[]arr={16,17,4,3,5,2};
        int[]ans=new int[arr.length];
        ans[arr.length-1]=-1;
        int max=-1;
        int idx=arr.length-2;
        for(int i=arr.length-1;i>0;i--){
            if(arr[i]>max){
                max=arr[i];
                ans[idx]=max;
            }
            else{
                ans[idx]=max;
            }
            idx-- ;
        }
        System.out.println(Arrays.toString(ans));
    }
}
