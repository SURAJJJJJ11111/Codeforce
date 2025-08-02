import java.util.Scanner;


public class _1030A {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int people=s.nextInt();
        boolean ishard=false;
        while(people>0){
            int choice=s.nextInt();
            if(choice==1){
               ishard=true;
               break;
            }
            people--;
        }
        if(ishard){
            System.out.println("hard");
        }
        else{
            System.out.println("easy");
        }
        s.close();
    }

}
