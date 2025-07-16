package RecursionBasic;

public class FibonacciNumbers {
    public static void main(String[] args) {
        //FibonacciNumbers.fibonacciNumbers(10,0,1)
        System.out.println(fibonacciNumbersByKunal( 40));
    }
    public static int fibonacciNumbersByKunal(int n){
        if(n<2){
            return n;
        }

        return fibonacciNumbersByKunal(n-1)+fibonacciNumbersByKunal(n-2);
    }


    public static void fibonacciNumbers(int num,int a,int b){
        if(num==0){
            return;
        }
        num--;
        System.out.println(a);
        int temp=a+b;
        a=b;
        b=temp;

        //tail recursion
        fibonacciNumbers(num,a,b);
    }
}
