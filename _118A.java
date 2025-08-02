	// 118A - String Task
import java.util.*;
public class _118A {
    public static void main(String[] args) {
        Scanner s1=new Scanner(System.in);
        String str=s1.next();
        str=str.toLowerCase();
        StringBuilder b=new StringBuilder();
for(char c:str.toCharArray()){
    if("aeyiou".indexOf(c)==-1){
        b.append(".").append(c);
    }

}
        System.out.println(b);
    }
}
