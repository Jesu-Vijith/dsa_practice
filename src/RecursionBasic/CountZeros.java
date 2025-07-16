package RecursionBasic;

public class CountZeros {
    public static void main(String[] args) {
        int num=301020;
        System.out.println(helper(num,0));
    }

    static int helper(int num,int zeroCount){
        return countZeros(num,zeroCount);
    }

    static int countZeros(int num,int zeroCount){
        if(num==0){
            return zeroCount;
        }
        int rem=num%10;
        if(rem==0){
            zeroCount++;
        }
        return countZeros(num/10,zeroCount);
    }
}
