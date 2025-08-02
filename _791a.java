import java.util.*;

public class _791a {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        int b=s.nextInt();
      int years=0;
      while(a<=b){
        a*=3;
        b*=2;
        years++;
      }

System.out.println(years);
    }
}
