
import java.util.*;

public class countsunday {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String day = sc.nextLine();
        // String rev= new StringBuilder(day).reverse().toString();

        // if(day.equals(rev)){
        // System.out.println("palindrome");
        // }
        // else {
        // System.out.println("not plaidrome");
        // }
        int date = 0;
        String days[] = { "mon", "tues", "wedn", "thru", "frid", "satr", "sund" };
        for (int i = 0; i < days.length; i++) {
            if (day.equals(days)) {
                date = i;
                break;
            }
        }

        System.out.println(date);
    }
}
