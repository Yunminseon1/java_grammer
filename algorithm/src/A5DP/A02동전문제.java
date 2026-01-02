package A5DP;

import java.util.Arrays;

public class A02동전문제 {
    public static void main(String[] args) {
//        1,4,5의 동전이 있을떄, 조합하여 13을 만들수있는 최소갯수
        int[] arr = {1,4,5};
        int target = 13; // 12 에서 1더하는 경우, 9에서 4더하는경우, 8에서 5더하는 경우


//       n원을 만드는  최소동전수 : min (dp[N-a], dp[N-b], dp[N-c])
        int[] dp = new int[target + 1];
        Arrays.fill(dp, 10000);
        dp[0] = 0;

        for (int i = 1; i<= target; i++){
            for (int coin : arr){
                if(i-coin>=0){
                    dp[i] = Math.min(dp[i], dp[i-coin]+1);
                }
            }
        }
        System.out.println(dp[target]);
    }
}
