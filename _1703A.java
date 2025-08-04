// 1703A - YES or YES?
import java.util.*;
public class _1703A {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int tt=sc.nextInt();
        while(tt-- >0){
            String s=sc.next().toLowerCase();
            if(s.contains("yes")){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }

        sc.close();
    }
}
