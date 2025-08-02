// A. Team
import java.util.*;
public class _231A{
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int q=s.nextInt();
        int cnt=0;
        while(q>0){
            int a=s.nextInt();
            int b=s.nextInt();
            int c=s.nextInt();
        if(a+b+c>=2){
cnt+=1;

        }
           q--; 
        }
        System.out.println(cnt);
    }
}