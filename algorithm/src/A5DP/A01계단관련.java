package A5DP;

import java.io.*;
import java.nio.Buffer;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.Scanner;


public class A01계단관련 {
    public static void main(String[] args) {
//         멀리뛰기 : 프로그래머스
//        class Solution{
//        public long solution ( int n){
//            long[] dp = new long[n + 2];
//            dp[0] = 0;
//            dp[1] = 1;
//            dp[2] = 2;
//
//            for (int i = 3; i <= n; i++) {
//                dp[i] = (dp[i - 1] + dp[i - 2]) % 1234567;
//            }
//
//            return dp[n];
//        }
//
//    }

//        계단오르기 : 백준
//    import java.io.*;
//    import java.util.*;
//    public class Main{
//        public static void main(String[] args)throws IOException{
//            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//            int N = Integer.parseInt(br.readLine());
//            int score[] = new int[N+1];
//            int dp[] = new int[N+1];
//
//            for(int i =1; i<=N; i++){
//                score[i] = Integer.parseInt(br.readLine());
//            }
//            dp[1] = score[1];
//            if(N>1) dp[2] = score[1] + score[2];
//            if(N>2) dp[3] = Math.max(score[1],score[2])+score[3];
//            for (int i =4; i<=N; i++){
//                dp[i] = Math.max(dp[i-3]+score[i-1], dp[i-2])+score[i];
//
//            }
//            System.out.println(dp[N]);
//        }


        // 백준 2156번(포도주 시식)
//        public class Main {
//
//            public static void main(String[] args) throws Exception {
//
//                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//
//                int N = Integer.parseInt(br.readLine());
//
//                int[] arr = new int[N + 1];
//                int[] dp = new int[N + 1];
//
//                for (int i = 1; i <= N; i++) {
//                    arr[i] = Integer.parseInt(br.readLine());
//                }
//
//                if (N >= 1) dp[1] = arr[1];
//                if (N >= 2) dp[2] = arr[1] + arr[2];
//
//                for (int i = 3; i <= N; i++) {
//                    dp[i] = Math.max(
//                            Math.max(dp[i - 1], dp[i - 2] + arr[i]),
//                            dp[i - 3] + arr[i - 1] + arr[i]
//                    );
//                }
//
//                System.out.println(dp[N]);
    }
}