import java.util.*;
public class LongestDivisorsInterval {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            long n = sc.nextLong();
            long ans;
            for (long i=1; ;i++){
                if(n%i!=0){
                    ans = i-1;
                    break;
                }
            }
            System.out.println(ans);

        }
    }
}

