package LeetCode;

public class L_275_H_Index_II {
    public int hIndex(int[] citations) {
        int start=0;
        int end=citations.length-1;
        int n=citations.length;
        int ans=0;
        while(start<=end){
            int mid=(start+end)/2;
            if(citations[mid]>=n-mid){
                ans=n-mid;
                end=mid-1;
            }
            else{
                start=mid+1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[]citations={1,1,2,3,4,5,7};
        //1,1,2,3,4,5,7
        L_275_H_Index_II ans=new L_275_H_Index_II();
        System.out.println(ans.hIndex(citations));
    }
}
