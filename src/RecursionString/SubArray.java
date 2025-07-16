package RecursionString;

public class SubArray {
    static void subArr(int[]arr,int n){
       for(int i=0;i<n;i++){
           for(int j=i;j<n;j++) {
               for (int k = i; k <= j; k++) {
                   System.out.print(arr[k] + " ");
               }
               System.out.println();
           }

       }
    }
    public static void main(String[] args) {
       int[]arr={1,2,3,4};
       subArr(arr,arr.length);
    }
}

