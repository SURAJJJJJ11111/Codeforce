
import java.util.*;

public class countsunday {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String day = sc.nextLine();
        int n = sc.nextInt();
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
            if (day.equals(days[i])) {
                date = i;
                break;
            }
        }
        int counter = 0;
        for (int i = 0; i < n; i++) {
            if (date == 6) {
                counter++;
            }
            date = (date + 1) % 7;
        }
        System.out.println(counter);
    }
}
