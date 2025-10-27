package LeetCode;

public class L_2269_FindTheKBeautyOfANumber {
    public int divisorSubstrings(int num, int k) {
        String number=String.valueOf(num);
        int beauty=0;
        int left=0;
        int right=k-1;
        int n=number.length();
        while(right<n) {
            int temp = Integer.parseInt(number.substring(left, right + 1));
            if (temp != 0 && num % temp == 0) {
                beauty++;
            }
            right++;
            left++;
        }
        return beauty;
    }

    public static void main(String[] args) {
        L_2269_FindTheKBeautyOfANumber ans=new L_2269_FindTheKBeautyOfANumber();
        System.out.println(ans.divisorSubstrings(430043,2));
    }
}
