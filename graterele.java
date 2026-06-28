import java.util.*;

public class graterele {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int cnt = 1;
        int max = arr[0];
        for (int i = 0; i < n - 1; i++) {
            if (arr[i] < arr[i + 1]) {
                cnt++;
                max = arr[i];
            }

        }
        System.out.println(cnt);
    }
}