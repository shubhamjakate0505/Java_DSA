import java.util.*;

public class Ques {
    public static int countways(int n, int[] ways) {
        if (n == 0) {
            return 1;
        }
        if (n < 0) {
            return 0;
        }
        if (ways[n] != -1) { // already calculated
            return ways[n];
        }
        ways[n] = countways(n - 1, ways) + countways(n - 2, ways);
        return ways[n];
    }

    public static int countwaysTab(int n) {
        int[] dp = new int[n + 1];
        dp[0] = 1;

        // tabulation
        for (int i = 1; i <= n; i++) {
            if (i == 1) {
                dp[i] = dp[i - 1];
            } else {
                dp[i] = dp[i - 1] + dp[i - 2];
            }
        }
        return dp[n];
    }

    public static void main(String[] args) {
        int n = 5;
        int[] ways = new int[n + 1];
        Arrays.fill(ways, -1);
        System.out.println(countways(n, ways));
        System.out.println(countwaysTab(n));
    }
}
