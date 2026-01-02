package A6투포인터;

import java.io.*;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

// 정렬을 하면 안되는경우
// start<= end의 조건
// start와 end가 같이 출발
public class A03수열의범위 {
    // 두수의 합 : 백준
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int N = Integer.parseInt(br.readLine());
    int[] arr = new int[N];
    for(
    int i = 0; 1<i<1000000;i++)

    {
        int X = Integer.parseInt(br.read());

        Arrays.sort(arr);

        int left = 0;
        int right = N - 1;
        int count = 0;

    }

    while(left<right)

    {
        int sum = arr[left] + arr[right];

        if (sum == x) {
            count++;
            left++;
            right--;
        } else if (sum < X) {
            left++;
        } else {
            right--;
        }
        System.out.println(count);
    }
    // 수들의합2(2003) : 백준
    // 1. 입력 = BufferedReader or Scanner
    // 2. StringTokenizer문자열을 공백 기준으로 분리
    // 3. Integer.parseInt가 뭐지?문자열 → 정수 변환
    // 4. throws Exception 이 뭐지?예외 처리를 JVM에게 위임
    // 5. readLine() 입력한줄을 문자열로 읽어오는 함수

    public class main(String[] args)throws

    Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int X = Integer.parseInt(br.readLine());

        Arrays.sort(arr);

        int left = 0;
        int right = N - 1;
        int count = 0;

        while (left < right) {
            int sum = arr[left] + arr[right];

            if (sum == X) {
                count++;
                left++;
                right--;
            } else if (sum < X) {
                left++;
            } else {
                right--;
            }
        }
        System.out.println(count);
    }

    // 백준 2750번 수 정렬하기
    // 1. 입력 = BufferedReader br = new BufferedReader(System.in)
    // 2. 출력 = System.out.println(" ")
    // 3. 배열 선언
    // 4. 이중 for문
    // 5. arr[j]를 temp에 대입
    // 6. arr[i]를 j에 대입
    // 7. temp를 arr[i]에 대입
    // 시간복잡도는 O(n^2)
    public class Main {
        public static void main(String[] args) throws IOException {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            int N = Integer.parseInt(br.readLine());
            int[] arr = new int[N];
            for (int i = 0; i < N; i++) {
                arr[i] = Integer.parseInt(br.readLine());
            }
            Arrays.sort(arr);

            for (int i = 0; i < N; i++) {
                System.out.println(arr[i]);
            }
        }
    }

    // 수들의합2(2003): 백준
    // 1. 입력 받기
    // 2. 수열을 split으로 분리
    // 3.

    class main {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int[] arr = new int[n];
        st  =new

        StringTokenizer(br.readLine());
        for(
        int i = 0;
        i<n;i++)

        {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int s = 0, e = 0, sum = 0, cnt = 0;
        while(true){
            if (sum >= m) {
                sum -= arr[s++];
            } else if (e = n) break;
            else {
                sum += arr[e++];
            }
            if (sum == m) {
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}





// 잘했다 민선아 일단 학원 출석한거부터 오늘 하루 절반은 성공한거다
// 문제풀이를 즐겨보자 틀려도 상관없으니까 자신감있게 해

// 연속된부분수열의합 : 프로그래머스
// 1.수열 입력 BufferedReader 사용
// 2.정렬
// 3.
class Solution {
    public int[] solution(int[] sequence, int k) {
        int N = sequence.length;
        int left = 0, right = N;
        int sum = 0;
        for (int L = 0, R = 0; L < N; L++) {
            while (R < N && sum < k) {
                sum += sequence[R++];
            }

            if (sum == k) {
                int range = R - L - 1;
                if ((right - left) > range) {
                    left = L;
                    right = R - 1;
                }
                sum -= sequence[L];
            }
            int[] answer = {left, right};

            return answer;
        }
    }
}

// 숫자의 표현 프로그래머스
 class solution{
    public int solution(int n){
        int answer = 0;

        for (int i =1; i<=n; i++){
            int sum = 0;

            // 현재 i부터 n까지 자연수를 더해가면서 합을 게싼
            for (int j = 1; j<=n; j++){
                sum += j;
            }
            // 현재 i부터 n까지 자연수를 더해가면서 합을계산
            if(sum == n){
                answer++;
                break;
            }

            //합이 주어진 n보다 크면 내부 반복문 종료
            if(sum > n) break;
        }
    }
    return answer;

    // 백준 2512번 예산
    // import java.io.BufferedReader;
    // import java.io.IOException;
    // import java.io.InputStreamReader;
    // import java.util.StringTokenizer;

    public class Main{
        public static void main(String[] args) throws IOException{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            // 입력을 빠르게 받기 위한 bufferedReader
            int n = Integer.parseInt(br.readLine());

            // 이분 탐색의 범위 설정
            int left = 0, right = -1;
            // 각 지방의 예산 요청을 저장할 배열
            int[] arr = new int[n];
            // 한줄에 들어온 예산 요청들을 분리
            StringTokenizer st = new StringTokenizer(br.readLine());

            for (int i = 0; i<n; i++){
                arr[i] = Integer.parseInt(st.nextToken());
                // 상한값의 최대 후보 = 요청 예산 중 최댓값
                right = Math.max(right,arr[i]);
            }

            // 총 예산 M
            int m = Integer.parseInt(br.readLine());
            // 이분탐색 시작
            while (left <= right){
                // 중간값 = 이번에 시험해볼 예산 상한
                int mid = (left+ right)/2;
                long budget = 0; // 현재  상한(mid)으로 계산한 전체예산 합
                // 모든 지역에 대해 예산 계산
                for (int i = 0; i<n; i++){
                    // 요청 금액이 상한보다 크면 상한까지만 배정
                    if(arr[i]>mid) budget +=mid;
                    else budget += arr[i];
                }
                // 총 예산이 전체 한도 이하라면 -> 상한을 더올려볼수있음
                if (budget <= m){
                    left = mid +1;
                    // 총 예산이 초과되면 -> 상한을 낮춰야함
                }else{
                    right = mid -1;
                }
            }
            System.out.println(right);
        }
    }

    // import java.io.BufferedReader;
    //import java.io.IOException;
    //import java.io.inputStreamReader;
    // import java.util.LinkedList;
    // import java.util.StringTokenizer;

    class PointXYZ{
        int height;
        int row;
        int col;

        public PointXYZ(int height, int row, int col){
            this.height = height;
            this.row = row;
            this.col = col;
        }
    }
    public class Main{
        static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // 6방향을 나타내기 위한 배열
        static int rowArr[] = {-1,0,1,0,0,0};
        static int colArr[] = {0,1,0,-1,0,0};
        static int m,n,h;
        static int arr[][];
        static Queue<PointXYZ> queue = new LinkedList<>();

        public static void main(String[] args) throws IOException{
            StringTokenizer st = new StringTokenizer(br.readLine());
            m = Integer.parseInt(st.nextToken());
            n = Integer.parseInt(st.nextToken());
            h = Integer.parseInt(st.nextToken());

            arr = new int[h+1][n+1][m+1];

            for (int i = 1; i<=h; i++){
                for(int j =1; j<=n; j++){
                    st = new StringTokenizer(br.readLine());
                    for (int k = 1; k<=m; k++){
                        arr[i][j][k] = Integer.parseInt(st.nextToken());
                        // bfs를 시작하는 노드를 큐에 추가
                        if(arr[i][j][k] == 1) queue.add(new PointXYZ(i,j,k));
                    }
                }
            }
        }
    }
}

