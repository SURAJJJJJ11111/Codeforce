//	96A - Football
import java.util.*;

public class _96A {
    public static void main(String[] args) {
        Scanner s1=new Scanner(System.in);
        String s=s1.nextLine();
        if(s.contains("0000000")||s.contains("1111111"))
        {
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
s1.close();
    }
}
