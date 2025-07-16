package LinearSearch;

import java.util.Scanner;

public class LinearSearchStringIndex {
    static int linearSearch(String name,char target){
        for(int i=0;i<name.length();i++){
            if(name.charAt(i)==target){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        String name="Jesu Vijith";
        char target='h';
        System.out.println(linearSearch(name,target));
    }
}
