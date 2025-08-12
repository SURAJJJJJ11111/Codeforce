
// 520A - Pangram
import java.util.*;  

public class _520A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String word = sc.next().toLowerCase();
        Set<Character> alpha = new HashSet<>();
        for (char ch : word.toCharArray()) {
            if (ch <= 'z' && ch >= 'a') {
                alpha.add(ch);

            }
        }
        if (alpha.size() == 26) {
            System.out.println("YES");

        } else {
            System.out.println("NO");
        }

    }
}