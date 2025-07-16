package Arrays;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Array2DNormalProgram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        int[][]arr={{2,3},
//                {4,5,6,7},
//                {8,9,1}};
        int[][] arr = new int[3][3];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }

        for(int k=0;k<arr.length;k++){
            System.out.println(Arrays.toString(arr[k]));
        }

        for(int[]ans:arr){
            System.out.println(Arrays.toString(ans));
        }

    }
}
