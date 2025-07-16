package PatternUsingRecursion;

public class Pattern {
    public static void main(String[] args) {
//        pattern1(10,0);
        pattern2(10,0);
    }

    static void pattern1(int n,int col){
        if(col<n){
            System.out.print("*");
            col++;
            pattern1(n,col);

        }
        else{
            System.out.println();
            n--;
            if(n>0){
                pattern1(n,0);
            }
        }
    }

    static void pattern2(int n,int col){ //n=5,col=0
       if(n==0){
           return;
       }
        if(col<n){
            pattern2(n,col+1);
            System.out.print("*");
        }
        else{
            pattern2(n-1,0);
            System.out.println();
        }
    }
}
