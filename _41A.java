	// 41A - Translation
import java.util.*;

public class _41A {

    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);
        String first = s1.next();
        String second = s1.next();
        String rev=new StringBuilder(first).reverse().toString();
        if(rev.equals(second)){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }

       
        // String reversed="";
        // for(int i=first.length()-1;i>=0;i--){
        //     reversed= reversed+first.charAt(i);
        // }
        // if(reversed.equals(second)){
        //     System.out.println("YES");
        // }
        // else{
        //     System.out.println("NO");
        // }

        s1.close();
    }
}
