package DSA_patterns.Maths;

public class PowerTillNValuesWithBaseTwo {
    public void powerValues(int n){
        int []arr=new int[n];
        arr[0]=1;
        System.out.println(arr[0]);
        for(int i=1;i<arr.length;i++){
            arr[i]=arr[i-1]*2;
            System.out.println(arr[i]);
        }
    }

    public static void main(String[] args) {
        PowerTillNValuesWithBaseTwo p1=new PowerTillNValuesWithBaseTwo();
        int n=10;
        p1.powerValues(10);
    }
}
