package RecursionBasic;

public class ReverseUsingRecursion {
    public static void main(String[] args) {
        reverse(1234);
        reverseReturn(1234);
        System.out.println(sum);
    }
    static void reverse(int num){
        if(num%10==num){
            System.out.println(num);
            return;
        }
        System.out.print(num%10);
        reverse(num/10);
    }
    static int sum=0;
    static void reverseReturn(int num){
        if(num==0){
            return;
        }
        int rem=num%10;
        sum=sum*10+rem;
        reverseReturn(num/10);
    }
}
