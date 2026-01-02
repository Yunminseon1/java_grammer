package A7이분탐색;

import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

// 이분탐색문제는 이분탐색의 대상을 어떤것으로 설정할지가 핵심
public class A02이분탐색활용문제 {
    // 백준 : 예산
    static int n;        // 지방의 개수
    static int[] arr;    // 각 지방의 예산 요청 배열

    // 상한액 h를 기준으로 총 배정 예산을 계산하는 함수
    static int f(int h) {
        int total = 0;   // 전체 예산 합을 저장할 변수

        // 모든 지방에 대해 예산 계산
        for (int i = 0; i < n; i++) {

            // 요청 예산(arr[i])이 상한액 h보다 작으면 그대로 사용
            // 요청 예산이 h보다 크면 h까지만 배정
            total += Math.min(arr[i], h);
        }

        // 계산된 전체 예산 반환
        public class main{
            public static void main(String[] args)throws IOException{
                //입력을 빠르게 받기위한 BufferedReader
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

                // 지방의 개수 N입력
                int n = Integer.parseInt(br.readLine());

                // 지방의 개수 N 입력
                int n = Integer.parseInt(br.readLine());

                //이분탐색의 범위 설정
                int left = 0;
                int right = -1;

                // 각 지방의 예산 요청을 저장할 배열
                int [] arr = new int[n];

                // 한 줄에 들어온 예산 요청들을 분리
                StringTokenizer st = new StringTokenizer(br.readLine());

                for (int i = 0; i<n; i++){
                    arr[i] =Integer.parseInt(st.nextToken());

                    // 상한값의 최대 후보 = 요청 예산 중최댓값
                    right = Math.max(right, arr[i]);
                }

                // 총 예산 M
                int m = Integer.parseInt(br.readLine());

                //이분탐색 시작
                while(left<= right){
                    // 중간값 = 이번에 시험해볼 예산 상한
                    int mid = (left+right)/2;

                    long buget = 0; // 현재 상한으로 계산한 전체 예산합

                    // 모든 지역에 대해 예산 계산
                    for (int i = 0; i<n; i++){
                        //요청 금액이 상한보다 크면 상한까지만 배정
                        if(arr[i] > mid)
                            budget += mid;
                        else
                            budget += arr[i];
                    }
                    // 총 예산이 전체 한도이하라면 -> 상한을 더 올려볼수있음
                    if(budget <= m){
                        left = mid +1;
                    }
                    // 총 예산이 초과되면 -> 상한을 낮춰야함
                    else{
                        right = mid -1 ;
                    }
                }

                //right 는 "조건을 만족하는 최대 상한값"
                System.out.println(right);
            }
        }

        // 과자 나눠주기 : 백준
        public class BJ16401{
            public static void main (String[] args) throws IOException{
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                StringTokenizer st = new StringTokenizer(br.readLine());

                int M = Integer.parseInt(st.nextToken());
                int N = Integer.parseInt(st.nextToken());

                int[] snack = new int[N];

                st = new StringTokenizer(br.readLine());
                for (int i=0; i<N; i++){
                    snack[i] = Integer.parseInt(st.nextToken());
                }

                Arrays.sort(snack);

                int left = 1;
                int right = snack[N-1];

                while(left<=right){
                    int mid =(left+right)/2;

                    int cnt = 0;
                    for (int i=0; i<N; i++){
                        if(snack[i]>=mid){
                            cnt += snack[i]/mid;
                        }
                    }

                    //조카의 수보다 많은 과자를 나누어줄수있다면 과자의 길이를 키울수있음
                    if(cnt>=M){
                        left = mid +1;
                    }else{
                        right = mid -1;
                    }
                    System.out.println(right);
                }
            }
        }

        // 입국심사 : 백준
    }
}

