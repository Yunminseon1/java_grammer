package A5DP;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Stack;
import java.util.StringTokenizer;

public class A04문자열수열 {
    public static void main(String[] args) throws IOException {
//    가장 긴 증가하는 부분 수열(11053) : 백준
        // 수열 A가 주어짐 10 20 10 30 20 50 길이 4
        // 입력받을 수단
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // parseInt() String타입의 숫자를 int타입으로 변환해주는 역할, readLine()은 입력받은 숫자 그대로를 리턴
        int n = Integer.parseInt(br.readLine());
        // 배열선언 하는방법  : int [] arr = new int[5];
        int[] arr = new int[n + 1];
        int[] dp = new int[n + 1];

        // StringTokenizer - 문자열, 문자열 구분자, 토큰테스트
        StringTokenizer st = new StringTokenizer(br.readLine());
        // for문 arr[1] = Integer.parseInt(st.nextToken(1)
        for (int i = 1; i <= n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
            dp[i] = 1;
        }
        int max = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j < i; j++) {
                if (arr[i] > arr[j]) dp[i] = Math.max(dp[i], dp[j] + 1);
            }
        }
        System.out.println(Arrays.stream(dp).max());
    }

    // 가장 긴 증가하는 부분 수열4 : 백준(DP+ 역추적)
    // => 별도의 배열을 하나 더만들어서 직전의 값을 기록해두어야한다.
    public class Main {
    private static void main(String[] args)throws Exception{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int n = Integer.parseInt(br.readLine());

    StringTokenizer st = new StringTokenizer(br.readLine());
    int [] arr = new int[n];
            for(int i=0; i<n; i++) {
                arr[i] = Integer.parseInt(st.nextToken());
            }
            int[] dp = new int[n];
            dp[0] = 1;
            int lis = 1;
            for(int i=1; i<n; i++) {
                dp[i] = 1;
                for(int j=0; j<i; j++) {
                    if(arr[i] > arr[j]) {
                        dp[i] = Math.max(dp[i], dp[j]+1);
                        lis = Math.max(lis, dp[i]);
                    }
                }
            }

            StringBuilder sb = new StringBuilder();
            sb.append(lis+"\n");

            Stack<Integer> s = new Stack<>();
            for(int i=n-1; i>=0; i--) {
                if(dp[i] == lis) {
                    s.push(arr[i]);
                    lis--;
                }
            }

            while(!s.isEmpty()) {
                sb.append(s.pop()+" ");
            }
            System.out.println(sb.toString());
    }
    }
}