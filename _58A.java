// 58A - Chat room
import java.util.*;


public class _58A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine().toLowerCase();
        String target = "hello";
        int cnt = 0;
        for (int i = 0; i < input.length(); i++) {
            if (cnt<target.length()&&input.charAt(i) == target.charAt(cnt)) {
                cnt++;
            }

        }
        if (cnt == target.length()) {
            System.out.println("YES");

        } else {
            System.out.println("NO");
        }
    }

}
