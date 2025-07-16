package StringPractice;

import java.util.*;

public class LilyHomework {
    public static int lilysHomework(List<Integer> arr) {
        int[] original = arr.stream().mapToInt(Integer::intValue).toArray();
        int[] ascSorted = original.clone();
        int[] descSorted = original.clone();

        Arrays.sort(ascSorted);
        Arrays.sort(descSorted);
        reverse(descSorted);

        int ascSwaps = countSwaps(original, ascSorted);
        int descSwaps = countSwaps(original, descSorted);

        return Math.min(ascSwaps, descSwaps);
    }

    private static int countSwaps(int[] original, int[] target) {
        int n = original.length;
        Map<Integer, Integer> indexMap = new HashMap<>();
        for (int i = 0; i < n; i++) {
            indexMap.put(target[i], i);
        }

        boolean[] visited = new boolean[n];
        int swaps = 0;

        for (int i = 0; i < n; i++) {
            if (visited[i] || indexMap.get(original[i]) == i)
                continue;

            int cycleSize = 0;
            int j = i;

            while (!visited[j]) {
                visited[j] = true;
                j = indexMap.get(original[j]);
                cycleSize++;
            }

            if (cycleSize > 1) {
                swaps += (cycleSize - 1);
            }
        }

        return swaps;
    }

    private static void reverse(int[] arr) {
        int left = 0, right = arr.length - 1;
        while (left < right) {
            int tmp = arr[left];
            arr[left++] = arr[right];
            arr[right--] = tmp;
        }
    }

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(3,4,2,5,1);
        System.out.println(lilysHomework(list));  // Output: 2
    }
}
