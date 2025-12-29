	// 281A - Word Capitalization
import java.util.*;
public class _281a {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String str=s.next();
       String first=str.substring(0,1).toUpperCase();
       String rest=str.substring(1);
       System.out.println(first+rest); 
        s.close();
    }
    
}
