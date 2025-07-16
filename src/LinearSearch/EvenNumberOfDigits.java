package LinearSearch;

public class EvenNumberOfDigits {
    static int numberOfDigits(int num){
        int count=0;
        while(num!=0){
            num=num/10;
            count++;
        }
        return count;
    }
    static int evenNumberOfDigits(int[]arr){
        int ansCount=0;
        for (int num:arr){
             int digit=numberOfDigits(num);
             if(digit%2==0){
                 ansCount++;
             }

        }
        return ansCount;
    }
    public static void main(String[] args) {
        int[]nums={12,345,2,6,7896,77,463,8565};
        System.out.println(evenNumberOfDigits(nums));
    }
}
