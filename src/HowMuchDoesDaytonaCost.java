import java.util.*;
public class HowMuchDoesDaytonaCost {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while((t--) > 0){
            int n = sc.nextInt();
            int k = sc.nextInt();
            int[] arr = new int[n];
            for(int i =0 ;i<n;i++){
                arr[i] = sc.nextInt();
            }
            if(Arrays.stream(arr).anyMatch(x -> x == k)){
                System.out.println("Yes");
            }else{
                System.out.println("N0");
            }

        }
    }

}
