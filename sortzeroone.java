import java.util.*;
public class sortzeroone {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        // Arrays.sort(arr);
        // for(int i:arr){
        //     System.out.print(i+ " ");
        // }

int left=0;
int right=arr.length;
while(left<right){
    if(arr[left]<arr[right]){
        int temp=arr[left];
        arr[left]=arr[right];
        arr[right]=temp;
    }
    left++;
    right--;
}


    }
}
