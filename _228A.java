import java.util.*;

public class _228A {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < 4; i++)
            set.add(sc.nextInt());
        System.out.println(4 - set.size());
    }

}
