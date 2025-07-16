package RecursionString.Permutations;

public class PermutationCount {
    public static void main(String[] args) {
//        System.out.println(permutationCount("","abcd",0));
        System.out.println(permutationCountWithoutPassingCount("","abcde"));
    }

    static int permutationCountWithoutPassingCount(String ans,String ques){
        if(ques.isEmpty()){
            return 1;
        }
        int count=0;
        char ch=ques.charAt(0);
        for(int i=0;i<=ans.length();i++){
            String f=ans.substring(0,i);
            String s=ans.substring(i,ans.length());
            count=count+permutationCountWithoutPassingCount(f+ch+s,ques.substring(1));
        }
        return count;
    }


    static int permutationCount(String ans,String ques,int count){
        if(ques.isEmpty()){
            return count+1;
        }
        char ch=ques.charAt(0);
        for(int i=0;i<=ans.length();i++){
            String f=ans.substring(0,i);
            String s=ans.substring(i,ans.length());
            count=permutationCount(f+ch+s,ques.substring(1),count);
        }
        return count;
    }
}
