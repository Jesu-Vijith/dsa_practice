package LeetCode;

public class L_881_BoatsToSavePeople {

    public static int boatCount(int[]people,int limit){
        int min=0;
        int max=people.length-1;
        int boat=0;
        while(min<=max){
            if(min==max){
                boat+=1;
                max--;
            }
            else if(people[min]+people[max]<=limit){
                boat+=1;
                max--;
                min++;
            }
            else{
                boat+=1;
                max--;
            }
        }
        return boat;
    }

    public static void main(String[] args) {
        int[]people = {3,5,3,4};
        int limit = 3;
        System.out.println(boatCount(people,limit));
    }
}
