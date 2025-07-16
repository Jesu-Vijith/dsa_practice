package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayNormalProgram {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[]rollNumbers=new int[5];
        for(int i=0;i<5;i++){
            rollNumbers[i]=sc.nextInt();
        }
        for(int roll:rollNumbers){
            System.out.print(roll+" ");
        }
        System.out.println();
        System.out.println(Arrays.toString(rollNumbers));
    }
}
