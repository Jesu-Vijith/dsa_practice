import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Dummy {
    public static void main(String[] args) {
//        int num=10;
        int a =10;
        int b=20;
        int c=30;
        int[]nums={1000000000,1000000000,1000000000,1000000000};
        int total=0;
        for(int num:nums){
            total+=num;
        }
        System.out.println(total);
    }
}