import java.util.*;

public class paac {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int tt=sc.nextInt();
        sc.nextLine();
        for(int i =0;i<tt;i++){
            String n=sc.nextLine()
            if(n.length()<10){
                System.out.println(n);
            }
            else{
                String b=n.substring(1,n.length()-1);
                System.out.println(n.charAt(0)+""+b.length()+""+n.charAt(n.length()-1));

            }


        }
    }
}
