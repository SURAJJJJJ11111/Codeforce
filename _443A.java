// 443A - Anton and Letters
import java.util.*;

public class _443A {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String inp = input.substring(1, input.length() - 1).trim();
        if (inp.length() == 0) {
            System.out.println(0);
            return;
        }
        Set<String> ret = new HashSet<>();
        String[] letter = inp.split(", ");

        for (String c : letter) {
            ret.add(c);

        }
        System.out.println(ret.size());
        sc.close();
    }
}
