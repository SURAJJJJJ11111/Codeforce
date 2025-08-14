// A. Beautiful Year
import java.util.*;
public class _271A {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        while(true)
         
    { 
        n++;
        String year=String.valueOf(n);
         if(year.charAt(0)!=year.charAt(1)&&year.charAt(0)!=year.charAt(2)&&year.charAt(0)!=year.charAt(3)&&year.charAt(1)!=year.charAt(2)&&year.charAt(1)!=year.charAt(3)&&year.charAt(2)!=year.charAt(3)){
            System.out.println(year);
            break;

        }


        
    }
    }
}
