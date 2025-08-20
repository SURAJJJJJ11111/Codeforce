	// 977A - Wrong Subtraction
import java.util.*;

public class _977A {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int steps=s.nextInt(); 
        for(int i=0;i<steps;i++){
         
         if(n%10!=0){
            n--;
         }  
         
            else{
                n/=10;
            }
        }
        System.out.println(n);
    }
}
