import java.util.*;

public class fabi {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.print(series(i) + " ");
        }
System.out.println();
        System.out.println("nth term"+nthseries(n));

    }

    public static int series(int n) {
        if (n == 0 || n == 1)
            return n;
        return series(n - 1) + series(n - 2);
    }
    public static int nthseries(int n){
        if(n==0|| n==1){
            return n;
        }
        return nthseries(n-1)+nthseries(n-1);
    }
}