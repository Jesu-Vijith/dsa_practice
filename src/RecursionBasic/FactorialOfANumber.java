package RecursionBasic;

public class FactorialOfANumber {
    public static void main(String[] args) {
        //Product of n factorial
        //System.out.println(factorialProduct(5));

        //Sum of n factorial
        //System.out.println(sumOfNFactorial(50));

        //sumOfDigits Factorial
        System.out.println(sumOfDigits(3729));
    }

    static int sumOfDigits(int n){
        if(n%10==n){
            return n;
        }
        int digit=n%10;
        n=n/10;
        return digit*sumOfDigits(n);
    }

    static int factorialProduct(int n){
        if(n<=1){
            return 1;
        }
        return n*factorialProduct(n-1);
    }

    static int sumOfNFactorial(int n){
        if(n<=1){
            return 1;
        }
        return n+sumOfNFactorial(n-1);
    }
}
