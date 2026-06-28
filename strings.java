import java.util.*;

public class strings {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String s = "1221";
        System.out.println(s.charAt(1));
        StringBuilder nsc = new StringBuilder(s).reverse();
        int left = 0;
        int right = s.length();

        boolean flag = true;
        for (int i = 0; i < right; i++) {
            if (s.charAt(i)!= nsc.charAt(i)) {
                flag = false;
                break;
            }
            else{
                flag=true;
            }
        }

        if(flag){
            System.out.println("palindrome");
        }
        else{
            System.out.println("not palindorme");
        }
        // while(left<right){
        // if(s.charAt(left)==ncs.charAt(right)){

        // }
        // }
    }
}