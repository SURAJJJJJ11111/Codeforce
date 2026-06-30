import java.util.*;/**
 * Innerfreqword
 */
public class Innerfreqword {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
String para=sc.nextLine();
String[] ar=para.toLowerCase().split(" ");
int n=sc.nextInt();
HashMap<String,Integer> freq=new HashMap<>();
for(String s:ar) {
    freq.put(s,s.length());
}

Arrays.sort(ar, Collections.reverseOrder());
for(int i =0;i<n;i++){

   System.out.print(ar[i]);
   
}
    }
}

