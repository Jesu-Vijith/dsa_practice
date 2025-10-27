package zoho;

//35. Matrix Addition
//Given n integer arrays of different size, find the addititon of numbers represented by the arrays
//I/P: 4
//        3 5 4 2
//        2 4 5
//        4 5 6 7 8
//        4 9 2 1
//        1 2
//O/P: 50856

import java.util.ArrayList;
import java.util.List;

public class AdditionOfMatrixNumbers {
    public static void main(String[] args) {
        List<Integer> ansList=new ArrayList<>();;
        int[][]matrix={
                {3,5,4,2},
                {2,4,5},
                {4,5,6,7,8},
                {4,9,2,1},
                {1,2}
        };
        int ans=0;
        for(int i=0;i<matrix.length;i++){
            int sum=0;
            for(int j=0;j<matrix[i].length;j++){
                sum=sum*10+matrix[i][j];
            }
            System.out.println(sum);
            ansList.add(sum);
        }
        System.out.println(ansList);
        for(int num:ansList){
            ans+=num;
        }
        System.out.println(3542+245+45678+4921+12);
        System.out.println(ans);
    }
}
