import java.util.*;
public class MakeItZero {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            int [] arr = new int[n];
            for(int i=0;i<n;i++){
                arr[i] = sc.nextInt();
            }
            if(n%2==0){
                System.out.println(2);
                System.out.println(1+" "+n);
                System.out.println(1+" "+n);
            }else{
                //4 operations
                System.out.println(4);
                //destroy even part
                System.out.println(1+" "+(n-1));
                System.out.println(1+" "+(n-1));

                //destroy odd part
                System.out.println((n-1)+ " "+n);
                System.out.println((n-1)+ " "+n);


            }
        }
    }
}
