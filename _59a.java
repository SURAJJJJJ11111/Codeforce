	// 59A - Word
import java.util.*;
public class _59a {
    public static void main(String[] args) {
        Scanner v=new Scanner(System.in);
        String s=v.next();
        int up=0;
        int low=0;

        for(int i=0;i<s.length();i++){
            char pl=s.charAt(i);
            if(Character.isUpperCase(pl)){
                up++;

            }else{
                low++;
            }
            }
            if(up>low){
                System.out.println(s.toUpperCase());
            }
            else{
                System.out.println(s.toLowerCase());
            }
        }

    }
    

