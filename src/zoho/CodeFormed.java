package zoho;


import java.util.HashMap;

//40. Given a number, print all the code that can be formed with z={a=1, .., z=26}.
//        1123
//        {1, 1, 2, 3} = aabc
//{11, 2, 3} = kbc
//{1, 1, 23} = aaw
//{11, 23} = kw
public class CodeFormed {
    public static void main(String[] args) {
        HashMap<Integer,Character>map=new HashMap<>();
        for(int i=1;i<=26;i++){
            char ch=(char)('a'+i-1);
            map.put(i,ch);
        }
        StringBuilder ans= new StringBuilder();
        int input=1123;
        while(input!=0){
            int digit=input%10;
            ans.insert(0, map.get(digit));
            input=input/10;
        }
        System.out.println(ans);
    }
}
