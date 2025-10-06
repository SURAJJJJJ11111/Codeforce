import java.util.*;

public class _1374A {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int tt = s.nextInt();
        while (tt-- > 0) {
            int n = s.nextInt();
            String g = s.next();
            int balance = 0;
            int minbal = 0;
            for (char c : g.toCharArray()) {
                if (c == '(') {
                    balance++;
                } else {
                    balance--;
                }
                minbal = Math.min(minbal, balance);
            }
            System.out.println(Math.abs(minbal));
        }
    }
}
