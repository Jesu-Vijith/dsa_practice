package LinearSearch;

public class LinearSearchNumberExists {
    static boolean linearSearch(int[]arr,int target){
        for(int num:arr){
            if(num==target){
                return true;
            }
        }
        return false;
    }


    public static void main(String[] args) {
        int[]arr={5,7,51,48,37,21,31,9,8,13,62,77,84};
        int target=19;
        boolean ans=linearSearch(arr,target);
        System.out.println(ans?"Element exists":"Element doesn't exists");
    }
}
