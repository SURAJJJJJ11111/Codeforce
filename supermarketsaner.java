import java.util.*;
public class supermarketsaner {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int sum=1;
        while(n>0){
            int digit=n%10;
            sum*=digit;
            n/=10;
        }
        System.out.println(sum);
    }
    
}
