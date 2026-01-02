package A5DP;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class A03최대값최소값 {
    public static int main(String[] args) {

//        RGB 거리(백준)
//        int N;
//        static int[][] Cost;
//        static int[][] DP;
//
//        static final int RED = 0;
//        static final int GREEN = 1;
//        static final int BLUE = 2;
//
//        public static void main (String[]args) throws Exception {
//
//            final static int Red = 0;
//            final static int Green = 1;
//            final static int Blue = 2;
//
//            static int[][] Cost;
//            static int[][] DP;
//
//            public static void main (String[]args){
//                Scanner in = new Scanner(System.in);
//
//                int N = in.nextInt();
//
//                Cost = new int[N][3];
//                DP = new int[N][3];
//
//                for (int i = 0; i < N; i++) {
//                    Cost[i][Red] = in.nextInt();
//                    Cost[i][Green] = in.nextInt();
//                    Cost[i][Blue] = in.nextInt();
//                }
//                // DP의 첫번째 값(집)은 각 색상비용의 첫번째 값으로 초기화
//                DP[0][Red] = Cost[0][Red];
//                DP[0][Green] = Cost[0][Green];
//                DP[0][Blue] = Cost[0][Blue];
//            }
//            System.out.print(Math.min(Paint_cost(N - 1, Red), Math.min(Paint_cost(N - 1, Green), Paint_cost(N - 1, Blue))));
//        }
//        static int Paint_cost ( int N, int color){
//
//            // 만약 탐색하지 않은 배열이라면
//            if (DP[N][color] == 0) {
//
//                // color의 색에 따라 이전 집의 서로 다른 색을 재귀호출하여 최솟값과 현재 집의 비용을 더해서 DP에 저장한다
//                if (color == Red) {
//                    DP[N][Red] = Math.min(Paint_cost(N - 1, Green), Paint_cost(N - 1, Blue)) + Cost[N][Red];
//                } else if (color == Green) {
//                    DP[N][Green] = Math.min(Paint_cost(N - 1, Red), Paint_cost(N - 1, Blue)) + Cost[N][Green];
//                } else {
//                    DP[N][Blue] = Math.min(Paint_cost(N - 1, Red), Paint_cost(N - 1, Green)) + Cost[N][Blue];
//                }
//
//            }
//
//            return DP[N][color];
//        }
//

// 정수 삼각형 - 프로그래머스, 2096(백준)
//        int find ( int depth, int idx){
//            // 만약 맨 밑(깊이)의 행에 도달하면 해당 인덱스를 반환한다.
//            if (depth == N - 1) return dp[depth][idx];
//            // 만약 아직 탐색하지 않은 위치라면 다음 행의 양쪽 열 중 최댓값을 구함
//            if (dp[depth][idx] == null) {
//		/*
//		 바로 다음행의 인덱스와 그 오른쪽의 인덱스 중
//		 큰 값 찾아 dp에 현재 인덱스의 값과 더하여 저장
//		*/
//                dp[depth][idx] = max(find(depth + 1, idx), find(depth + 1, idx + 1)) + arr[depth][idx];
//            }
//            return dp[depth][idx];
//        }
//        for (int i = 1; i < n; i++) {
//            double[][] triangle;
//            for (int j = 0; j < triangle[i].length; j++) {
//                if (j == 0) {
//                    triangle[i][j] += triangle[i - 1][j];
//                } else if (j == i) {// 오른쪽 끝
//                    triangle[i][j] += triangle[i - 1][j - 1];
//                } else {
//                    triangle[i][j] += Math.max(triangle[i - 1][j], triangle[i - 1][j - 1]);
//
//                }
//                answer = Math.max(answer, triangle[i][j]);
//            }
//        }
//        return answer;
//    }


        // 백준 : 가장 긴 증가하는 부분 수열 4
        // 1. dp[i] = 1 로 초기화
        // 2. i보다 작은 j 탐색
        // 3. arr[i] > arr[j] 이면
        // 3.1 dp[i] = dp[j] + 1
        // 3.2 prev[i] = j
        // 4. dp 최대값 위치 찾기
        // 5. prev 배열을 따라가며 수열 복원
        // 6. 뒤집어서 출력

    }
}

