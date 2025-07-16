package RecursionArray;

public class IfArrayIsSorted {
    public static void main(String[] args) {
        int[]arr={ 5, 9, 15,14};
        System.out.println(arraySort(arr,0));
    }

    static boolean arraySort(int[]arr,int index){
        if(index==arr.length-1){
            return true;
        }
        return arr[index]<=arr[index+1] && arraySort(arr,index+1);

//        else if(arr[index]<=arr[index+1]){
//            return arraySort(arr,index+1);
//        }
//        else{
//            return false;
//        }
    }
}
