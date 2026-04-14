package DynammicProgramming.Leetcode;

public class L_991_BrokenCalculator {

    public int brokenCalc(int startValue,int target){
        return calculate(startValue,target,0,startValue);
    }
    public int calculate(int startValue,int target,int operations,int currentValue){
        if(currentValue==target){
            return operations;
        }
        if(currentValue>target){
            return calculate(startValue,target,operations++,currentValue--);
        }
        if(currentValue<startValue){
            return calculate(startValue,target,operations++,currentValue*2);
        }
        return Math.min(calculate(startValue,target,operations++,currentValue*2),calculate(startValue,target,operations++,currentValue--));
    }


    public static void main(String[] args) {
        L_991_BrokenCalculator calculator=new L_991_BrokenCalculator();
        int startType=2,target=3;
        System.out.println(calculator.brokenCalc(2,3));
        String word="ABCD";

    }
}
