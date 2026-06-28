import java.util.*;

public class minmax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int missing = -1, duplicate = -1;

        // ArrayList<Integer> freq = new ArrayList<>(n);
        int freq[] = new int[n+1];
        for (int i : arr) {
            freq[i]++;
        }
        for (int i =1; i <= n; i++) {
            if (freq[i] == 2) {
                duplicate = i;
            }
            if (freq[i] == 0) {
                missing = i;
            }
        }

        System.out.println("Missing: "+missing+" "+"Duplicate: "+duplicate);
    }

}
