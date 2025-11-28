// A. Calculating Function
import java.util.*;

public class _486A {
    public static void main(String[] args) {
        Scanner s1=new Scanner(System.in);
        long n=s1.nextLong();
 
        if(n%2==0){
            System.out.println(n/2);
        }else{
            System.out.println(-(n+1)/2);
        }
    }

    
}
