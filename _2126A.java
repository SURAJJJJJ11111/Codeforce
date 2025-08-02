// A. Only One Digit
import java.util.*;

public class _2126A {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int t=s.nextInt();
        while(t>0){
            int ew=s.nextInt();
            int min=9;
            while(ew>0){
                int d=ew%10;
                if(d==0){
                    min=0;
                    break;
                }
                if(d<min)min=d;
                ew/=10;

                

            }
            System.out.println(min);
            t--;

        }
    }
}
