package zoho;

import java.util.Arrays;

public class Fibonacci {

    public int[] fibonacci(int n){
        int[]ans=new int[n];
        int a=0;
        int b=1;
        for(int i=0;i<n;i++){
            ans[i]=a;
            int temp=a;
            a=b;
            b=b+temp;
        }
        return ans;
    }

    public static void main(String[] args) {
        int n=10;
        Fibonacci fibo=new Fibonacci();
        System.out.println(Arrays.toString(fibo.fibonacci(10)));
    }
}
