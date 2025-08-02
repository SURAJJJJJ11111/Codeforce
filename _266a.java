// 266A - Stones on the Table
import java.util.*;
public class _266a {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int num=s.nextInt();
        String a=s.next();
        int stone=0;
        char[] arr=a.toCharArray();
        for(int i=1;i<num;i++){
          if(arr[i]==arr[i-1]){
            stone++;
          }
        }
        System.out.println(stone);
    }
}
