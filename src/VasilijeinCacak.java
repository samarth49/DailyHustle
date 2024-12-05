import java.lang.reflect.Array;
import java.util.*;
public class VasilijeinCacak {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            long n = sc.nextLong();
            long k = sc.nextLong();
            long sum = sc.nextLong();
             long min = k * (k+1)/2;
             long max = k*(2*n - k +1)/2;

             if(sum>=min && sum <=max ){
                 System.out.println("yes");
             }else{
                 System.out.println("no");
             }


        }
    }
}
