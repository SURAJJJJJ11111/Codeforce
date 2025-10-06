import java.util.*;

class _1829A {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String a = "codeforces";
        int tt = s.nextInt();
        while (tt-- > 0) {
        
        String target = s.next();
        int cnt = 0;
        for (int i = 0; i < 10; i++) {
            if (a.charAt(i) != target.charAt(i)) {
                cnt++;
            }
        }
        System.out.println(cnt);
    }
    }
}
