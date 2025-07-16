package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Swap {

    public static void swap(int index1,int index2,int[] arr){
        int temp=arr[index1];
        arr[index1]=arr[index2];
        arr[index2]=temp;
    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int[]arr=new int[5];
        for(int i=0;i<5;i++){
            arr[i]=scanner.nextInt();
        }
        System.out.println(Arrays.toString(arr));
        swap(0,2,arr);
        System.out.println(Arrays.toString(arr));

    }
}

