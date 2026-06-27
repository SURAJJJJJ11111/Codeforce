import java.util.*;

public class findmissing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n-1];
        for (int i = 0; i < n-1; i++) {
            arr[i] = sc.nextInt();
        }
        
        long total = (long)n * (n + 1) / 2;
        long sum = 0;
       
            for (int x : arr) {
                sum += x;
            }
    
        int missingnumber = (int)(total - sum);
        System.out.println(missingnumber);
    }
}