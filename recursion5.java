import java.util.*;
public class recursion5 {
    public static void subsequences(int ind, int n, int[] arr, ArrayList<Integer> current) {
        if (ind == n) {
            System.out.println(current);
            return;
        }
        current.add(arr[ind]);
        subsequences(ind + 1, n, arr, current);
        current.remove(current.size() - 1);
        subsequences(ind + 1, n, arr, current);
    }

    public static void main(String[] args) {
        int arr[] = {0, 1, 2};
        ArrayList<Integer> current = new ArrayList<>();
        subsequences(0, 3, arr, current);
    }
}
