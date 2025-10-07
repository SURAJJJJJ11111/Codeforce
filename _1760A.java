import java.util.Scanner;
import java.util.*;
public class _1760A {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int tt = s.nextInt();
        while (tt-- > 0) {
            int a = s.nextInt();
            int b = s.nextInt();
            int c = s.nextInt();
            // if (a > b && a < c) {
            //     System.out.println(a);
            // } else if (b > a && b < c) {
            //     System.out.println(b);
            // } else {
            //     System.out.println(c);
          
            int arr[]={a,b,c};
            Arrays.sort(arr);
            System.out.println(arr[1]);
        }
    }
}
