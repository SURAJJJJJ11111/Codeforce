	// 705A - Hulk
import java.util.*;

public class _705A {
 public static void main(String[] args) {
    Scanner scanner=new Scanner(System.in);
    int n=scanner.nextInt();
    StringBuilder sb=new StringBuilder();
    for(int i=0;i<n;i++){
        if(i%2!=1)
        {
            sb.append("I hate ");
        }
        else{
            sb.append("I love ");
        }    
        if(i==n-1){
            sb.append("it ");
        }
        else {
            sb.append("that ");
        }

    }
    System.out.println(sb.toString());
 }   
}
