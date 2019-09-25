import java.util.Scanner;
import java.util.ArrayList;
import java.lang.Math;
import java.util.Arrays;
 
public class Main{
    public static ArrayList<Integer> q;
    public static int[] dp;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int in = sc.nextInt();
        dp = new int[in+1];
        q = new ArrayList<Integer>();
        Arrays.fill(dp, 100000000);
        dp[0] = 0;
        calcq(1);
        for(int i=1; i<=in; i++) {
            for(int e : q) {
                if(i-e>=0) {
                    int val = dp[i-e]+1;
                    dp[i] = Math.min(val, dp[i]);
                }
            }
        }
        System.out.println(dp[in]);
        path(in);
    }
 
    public static void calcq (int n) {
        if(n>1000000) {
            return ;
        }
        q.add(n);
        calcq(n*10);
        calcq(n*10+1);
    }
    public static void path (int n) {
        if(n==0) {
            return;
        }
        for(int qu : q) {
            if(n-qu >=0 && dp[n-qu] == dp[n]-1) {
                System.out.print(qu+" ");
                path(n-qu);
                break;
            }
        }
    }
}