package RecursionString;

public class SubSet {
    static void generateSubsets(int[]arr, int n) {
        long powerSet = (long) Math.pow(2, n);
        for (int counter = 0; counter < powerSet; counter++) {
            for (int i = 0; i < n; i++) {
                if ((counter & (1 << i)) > 0)
                    System.out.print(arr[i] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[]args) {
        int []arr = { 1, 2, 3 };
        System.out.println("All the subsets are: ");
        generateSubsets(arr, arr.length);
    }
}

