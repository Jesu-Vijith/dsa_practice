package RecursionBasic;

public class RecursionNto1 {
    public static void main(String[] args) {
        printNaturalNumbersTillOne(5);
        System.out.println("Over");
    }
    static void printNaturalNumbersTillOne(int n){
        if(n==0){
            return;
        }
        System.out.println(n);
        printNaturalNumbersTillOne(n-1);
        System.out.println(n);
    }
}
