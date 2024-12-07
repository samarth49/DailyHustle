import java.util.*;
public class JellyfishandUndertale {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0 ){
            int a = sc.nextInt();
            int b = sc.nextInt();
            int n = sc.nextInt();
            int [] arr = new int[n];
            HashSet<Integer> st = new HashSet<>();
            for(int i=0;i<n;i++){
                arr[i] = sc.nextInt();
                st.add(arr[i]);
            }
            int ptr=0;
            int sum=0;
            int rem=b;
            int[] arr1 = st.stream().mapToInt(Integer::intValue).toArray();

            while(b>=0 && ptr<arr1.length){
                //each time b will decrement
               int currentTime = b;
               int choose = arr1[ptr++];
               int temp = currentTime+choose;
               if(temp > a){
                   rem = a-1;
               }else{
                   rem = currentTime+choose-1;
               }
               b=rem;
               sum+=rem;
            }
            System.out.println(sum);

        }
    }
}
