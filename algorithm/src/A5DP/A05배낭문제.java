package A5DP;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

//이해못함아직
//배낭문제 : 여러개의 선택대상이 있고, 전체자원한도내에서 선택조합을 구성하여 최대값/최소값을 구하는 문제
public class A05배낭문제 {
//    주어진 데이터를 1번만 사용가능
//    평범한 배낭 - 백준, 벼락치기(14728) - 백준


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] strA = br.readLine().split(" "); // 입력 = BufferedReader, Scanner 버퍼드리더가 성능이 더좋음

        int N = Integer.parseInt(strA[0]); // 문자열 strA 배열 선언
        int K = Integer.parseInt(strA[1]); // 문자열 배열strA의 첫 번째 값을 정수로 변환해서 N에 저장하라
        int[][] arr = new int[N][2]; // 배열선언
        int[] dp = new int[K + 1]; // dp 배열선언
        //가방이 7개가있다 각 가방에 그때그때의 최대값 기록
        //전체 대상 arr값을 가지고 최대값 확정
        for (int i = 0; i < arr.length; i++) {
            // 맨 끝에
            // 처음부터하면 마치 두번쓰인 것처럼
            for (int j = K; j >= arr[i][0]; j--) {
                dp[j] = Math.max(dp[j], dp[j - arr[i][0]] + arr[i][1]);
            }
        }


        System.out.println(Arrays.toString(dp));

        //    주어진 데이터를 여러번 사용가능
        //    호텔 - 백준

    }
}