import java.util.Arrays;
import java.util.Scanner;
import java.lang.Math;
    
public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] dp = new int[n+1];
        int[] l = new int[3];
        Arrays.fill(dp, -1000000);
        dp[0] = 0;
        for(int i=0; i<3; i++) {
            l[i] = sc.nextInt();
        }
        for(int k=0; k<=n; k++) {
            for(int len = 0; len < l.length; len++) {
                if(k-l[len]>=0) {
                    int val = dp[k-l[len]] + 1;
                    dp[k] = Math.max(val, dp[k]);
                }
            }
        }
        System.out.println(dp[n]);
    }
}