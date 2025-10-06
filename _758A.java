import java.util.*;

public class _758A {
    public static void main(String arg[]) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        int arr[] = new int[t];
        for (int i = 0; i < t; i++) {
            arr[i] = s.nextInt();
        }
        int max=arr[0];
        for(int i =0;i<t;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        int total=0;
        for(int i =0;i<t;i++){
            total+=max-arr[i];
        }
System.out.println(total);
        // for (int i = 0; i < t; i++) {
        //     System.out.println(arr[i]);
        // }

    }

}
