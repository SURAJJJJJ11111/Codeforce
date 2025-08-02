// A. Tram
import java.util.Scanner;
public class _116A {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int stops=s.nextInt();
        int passanger=0;
        int maxcap=0;
        while(stops>0){
            int exit=s.nextInt();
            int enter=s.nextInt();
            passanger-=exit;
            passanger+=enter;
            if(passanger>maxcap){
                maxcap=passanger;
            }
            stops--;

        }
        System.out.println(maxcap);
s.close();
    }
    
}
