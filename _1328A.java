	// 1328A - Divisibility Problem
import java.util.*;

public class _1328A {
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);
        int tt = s1.nextInt();
        while (tt-- > 0) {
            long a = s1.nextLong();
            long b = s1.nextLong();
            if(a%b==0){
                System.out.println("0");  
            }
            else{
                System.out.println(b-(a%b));
            }
        }
    }
}
