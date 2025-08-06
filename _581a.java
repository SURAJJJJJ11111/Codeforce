// 581A - Vasya the Hipster

import java.util.*;

public class _581a {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int fashionday = Math.min(a, b);
        int samecolor = Math.abs(a - b) / 2;
        System.out.println(fashionday + " " + samecolor);   
        sc.close(); 
    }

}
