package LeetCode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class L_2024 {
    public int maxConsecutiveAnswers(String answerKey, int k) {
        int left=0;
        int n=answerKey.length();
        int trues=0;
        int falses=0;
        int length=0;
        int maxFreq=0;
        for(int right=0;right<n;right++){
            char rightChar=answerKey.charAt(right);
            if(rightChar=='T')trues++;
            else falses++;
            maxFreq= Math.max(trues, falses);
            while((right-left+1)-maxFreq>k){
                char leftChar=answerKey.charAt(left++);
                if(leftChar=='T')trues--;
                else falses--;
                maxFreq= Math.max(trues, falses);
            }
            length=Math.max(right-left+1,length);
        }
        return length;
    }

    private int maxFreq(int[]freqArray){
        int freq=0;
        for (int j : freqArray) {
            if (j > freq) {
                freq = j;
            }
        }
        return freq;
    }

    public static void main(String[] args) {
        String answerKey = "TTFTTFTT";
        int k = 1;
        L_2024 ans=new L_2024();
        System.out.println(ans.maxConsecutiveAnswers(answerKey,k));
    }
}
