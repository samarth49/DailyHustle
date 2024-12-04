import java.util.*;

public class Chemistry {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            sc.nextLine();
            String s = sc.nextLine();

            if (n - k == 0 || n - k == 1) {
                System.out.println("Yes");
                continue;
            }


            HashMap<Character, Integer> mp = new HashMap<>();
            for (char ch : s.toCharArray()) {
                mp.put(ch, mp.getOrDefault(ch, 0) + 1);
            }

            int oddCount = 0;
            for (int freq : mp.values()) {
                if (freq % 2 == 1) {
                    oddCount++;
                }
            }

            int availableOps = n - k;
            if (availableOps % 2 == 0) { // Even case
                if (oddCount > k) {
                    System.out.println("No");
                } else {
                    System.out.println("Yes");
                }
            } else { // Odd case
                if (Math.abs(oddCount - k) > 1) {
                    System.out.println("No");
                } else {
                    System.out.println("Yes");
                }
            }
        }
        sc.close();
    }
}
