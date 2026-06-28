import java.util.*;

public class excersisesummary {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=7;
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int sum=0;
        for(int i=0;i<n;i++){
            sum+=arr[i];
        }
int avg=sum/7;
System.out.println("excersice summary");
System.out.println("Total workout time "+sum);
System.out.println("avg workout time"+avg);

    }
}
