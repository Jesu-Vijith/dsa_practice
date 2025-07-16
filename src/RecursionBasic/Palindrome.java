package RecursionBasic;

public class Palindrome {

    static int sum=0;
    static void palindrome(int n){
        if(n==0){
            return;
        }
        int rem=n%10;
        sum=sum*10+rem;
        palindrome(n/10);
    }

    public static void main(String[] args) {
        int qn=1231;
        System.out.println(qn);
        palindrome(qn);
        System.out.println(sum);
        System.out.println((qn==sum)?"Palindome":"Not a palindrome");
    }
}
