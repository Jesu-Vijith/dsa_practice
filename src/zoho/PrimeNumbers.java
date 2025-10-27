package zoho;

public class PrimeNumbers {

    public static boolean isPrime(int n){
        if(n==1){
            return true;
        }
        int count=0;
        for(int i=1;i<=n;i++){
            if(n%i==0){
                count++;
            }
        }
        return count==2;
    }

    public static void main(String[] args) {
        int n=100;
        for(int i=1;i<=n;i++){
            if(isPrime(i)){
                System.out.println(i);
            }
        }
    }
}
