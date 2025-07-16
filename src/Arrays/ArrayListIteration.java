package Arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListIteration {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ArrayList<Integer>list=new ArrayList<>();
        for(int i=0;i<5;i++){
            list.add(sc.nextInt());
        }
        for(Integer num:list){
            System.out.print(num+" ");
        }
    }
}
