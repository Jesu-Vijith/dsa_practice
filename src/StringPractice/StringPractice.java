package StringPractice;

import java.util.*;

public class StringPractice {
    public static int lilysHomework(List<Integer> arr) {
        int swapCount=0;
        int minIndex=0;
        int[]newArr = arr.stream().mapToInt(Integer::intValue).toArray();
        for(int i=0;i< newArr.length;i++) {
            minIndex = i;
            for (int j = i; j < newArr.length; j++) {
                if (newArr[j] < newArr[minIndex]) {
                    minIndex = j;
                }
            }
            if(minIndex!=i) {
                int temp = newArr[minIndex];
                newArr[minIndex] = newArr[i];
                newArr[i] = temp;
                swapCount++;
            }
        }
        System.out.println(Arrays.toString(newArr));
        return swapCount;
    }


    public static void main(String[] args) {
        List<Integer>list=new ArrayList<>();
        list.add(3);
        list.add(4);
        list.add(2);
        list.add(5);
        list.add(1);
        System.out.println(lilysHomework(list));
    }
}
