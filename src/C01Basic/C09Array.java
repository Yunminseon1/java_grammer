package C01Basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.Scanner;

public class C09Array {
    public static void main(String[] args) throws IOException {
////        배열표현식 1. 배열 선언후 값 할당 방식
////        java의 배열 반드시 사전에 길이가 결정되어야함
////        int[] arr1 = new int[]; // 허용 안됨
//        int[] arr1 = new int[5];
//        arr1[0] = 10;
//        arr1[1] = 20;
//        int 배열의 경우 선언시 기본적으로 0으로 초기화. boolean은 false로 초기화. 참조자료형은 null로 초기화
//        arr1[2] = 30;
//        arr1[3] = 40;
//        arr1[4] = 50;

////        arr1[5] = 60; index out of bounces 에러가 발생


////        배열표현식 2. 리터럴방식
//         int[] arr2 = {10, 20, 30, 40, 50};


////        배열표현식 3. 명시적배열 생성 방식
//        int[] arr3 = new int[]{10, 20, 30, 40, 50};
//        int[] odds = {1, 3, 5, 7, 9};
//        System.out.println(odds);


////        배열표현식3. 활용예시 : 배열을 다른 메서드에 매개변수로 사용할경우.
//        List<int[]> myList = new ArrayList<>();
//        myList.add(new int[5]);
//        myList.add(new int[]{10, 20, 30, 40, 50});

////      myList.add({10,20,30,40,50}); //사용불가( 배열인지 아닌지 확인불가)


//        85, 65, 90으로 구성된 int 배열을 선언하고 총합과 평균을 구하시오

//        int[] arr = new int[3];
//        arr[0] = 10;
//        arr[1] = 20;
//        arr[2] = 30;
//        System.out.println(arr[0]+arr[1]+arr[2]);
//        System.out.println((arr[0]+arr[1]+arr[2])/3);

//        int[] arr = new int[]{85, 65, 90};
//        int sum = 0;
//        double avq = 0;
//        for(int i=0; i<arr.length; i++){
//            sum += arr[i];
//
//        }
//        double avg = (double)sum / arr.length;
//        System.out.println(sum);
//        System.out.println(avg);

//        배열의 최댓값, 최솟값
//        int[] arr = {10, 20, 30, 12, 8, 17};

////        최댓값을 구할때는 가장 작은 값을 설정.
//        int max = Integer.MIN_VALUE;
//        int min = Integer.MAX_VALUE;
//
//        for (int i = 0; i<arr.length; i++){
//            if (arr[i]>max){
//                max = arr[i];
//            }
//
//            if(arr[i]<min){
//                min = arr[i];
//            }
//            System.out.println(max);
//            System.out.println(min);
//        }

//        배열의 자리바꾸기
//        i,i+1이 자리바꿈
//        int[] arr = {20,10,30};
//        int temp = arr[0];
//        arr[0] = arr[1];
//        arr[1] = temp;
//        System.out.println(temp);

//        배열뒤집기
//        원시자료형은 호환성이 낮다
//        int[] arr = {10, 20, 30, 40, 50};
//        int[] newArr = new int[arr.length];
//        for (int i = 0; i < arr.length; i++) {
//            newArr[i] = arr[arr.length - 1 - i];
//
//        }
//        System.out.println(Arrays.toString(newArr));

//        배열의 정렬
//        String[] stArr = {"aaa", "abb", "abc", "acb"};
//        Arrays.sort(stArr);  // 오름차순 정렬
//        System.out.println(Arrays.toString(stArr));
//        Arrays.sort(stArr, Comparator.naturalOrder()); // 내림차순 정렬
//        System.out.println(Arrays.toString(stArr));
//        int[] arr = {17,12,20,10,15};
//        Arrays.sort(arr); // 오름차순  정렬
//        Arrays.sort(arr,Comparator.reverseOrder()); // 원시자료형은 Comparotor 사용 불가능

//        선택정렬 알고리즘 구현
//        구현로직 : 1) 2중for문을 사용하여 index마다 최소값 찾기 2) 현재위치와 자리체인지
//        int[] Arr = {17,12,20,10,15};
//        for (int i = 0; i<Arr.length; i++){
//            int minIndex = i;
//
//            // i 이후에는 최소값 인덱스 탐색
//            for (int j = i + 1; j<Arr.length; j++){
//                if(Arr[j] < Arr[minIndex]){
//                    minIndex = j;
//                }
//
//                int temp = Arr[i];
//                Arr[i] = Arr[minIndex];
//                Arr[minIndex] = temp;
//
//
//            }
//            System.out.println(Arrays.toString(Arr));
//        }

//        int[] Arr = {17, 12, 20, 10, 15};
//         방법 1
//        for (int i = 0; i < Arr.length; i++) {
//            int min = i;
//
//            for (int j = i + 1; j < Arr.length; j++) {
//                if (Arr[j] < Arr[min]) {
//                    min = j;
//                }
//            }
//
//            // 최소값을 현재 위치와 교환
//            int temp = Arr[i];
//            Arr[i] = Arr[min];
//            Arr[min] = temp;

//            방법2
//        int i;
//        for (i = 0; i < Arr.length; i++) {
//            for (int j = 1; j < Arr.length; j++) {
//
//            }
//
//        }
//        System.out.println((i + 1) + "회차: " + Arr.toString());

//        선택정렬의 복잡도는 : O(n^2). java 기본 내장 정렬 함수의 복잡도는 : O(n*log(n))


//        조합문제 : 모두 각기 다른 숫자의 배열이 있을 떄 만들어질수있는 두숫자의 조합을 출력하시오
//        ex) (10,20), (10,30), (10,50), (20,30), (20,40) ...
//        int[] arr = {10, 20, 30, 40, 50};
//
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = i + 1; j < arr.length; j++) {
//                System.out.println("(" + arr[i] + ", " + arr[j] + ")");
//            }

//        배열의 중복제거 : set 자료구조(중복X,순서X)활용
//        ex) 10,20,30,40만 남도록.
//        int[] arr = {10, 30, 20, 30, 10, 40}; // 중복값이 포함된 배열
//        Set<Integer> mySet = new HashSet<>(); //  set은 중복을 허용하지않는 자료구조
//        for (int a : arr) {  // 중복 숫자는 자동제거됨
//            mySet.add(a);
//        }
//        int[] answer = new int[mySet.size()]; // set에 있는개수만큼 배열생성
//        int index = 0;
//        for (int a : mySet) {
//            answer[index] = a;
//            index++;
//        }
//        Arrays.sort(answer); // 오름차순정렬 수행
//

//        프로그래머스 - 두 개 뽑아서 더하기(조합+중복제거)


//        //          1. numbers배열 입력받기
//        Scanner sc = new Scanner(System.in);
//        int[] numbers = {};
//
//        //          2. 2개 뽑아서 더하기
//        for (int i = 0; i < numbers.length; i++) {
//
//        }
//
//        //          3. 조합 + 중복제거
//        Set<Integer> mySet = new HashSet<>(); //  set은 중복을 허용하지않는 자료구조

//        배열의 검색 : 복잡도 O(n)
//        int[] arr = {1, 3, 6, 8, 8, 9, 11, 15};
//        int target = 11;
//
////        target이 몇번째 index에 있는지 출력
//        int index = -1;
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] == target) {
//                index = i;
//                break;
//            }
//        }
//        System.out.println(index);

//        이분탐색(이진검색) - binary search, 복잡도 log(n)
//        사전에 데이터가 오름차순 정렬되어 있는 경우에만 이분탐색 가능
//        int[] arr = {1, 3, 6, 8, 8, 9, 11, 15};
//        int target = 11;
//        int index = Arrays.binarySearch(arr, target);
//
////        찾고자 하는 값이 있으면 해당 index 리턴
////        찾고자 하는 값이 없으면 음수값 리턴
//        int index2 = Arrays.binarySearch(arr, 13);
//        System.out.println(index);
//        System.out.println(index2);

//        백준 - 수 찾기(1920)
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        StringTokenizer st;
//        // 1.N 입력
//        int N = Integer.parseInt(br.readLine());
//
//        // 2. N개의 수입력
//        int[] arr =


//         배열값 비교
//        int[]  arr1 = {10,20,30};
//        int[]  arr2 = {10,20,30};
//        System.out.println(arr1 == arr2); //false
//        System.out.println(arr1.equals(arr2)); //true

//       , 배열복사
////        Arrays.copyof(배열명 length), Arrays.copyofRange(배열명, start, end)
//        int[] arr = {1,4,6,7,8,9,1,2,4,6};
//        int[] arr1 = Arrays.copyOf(arr,4);
//        System.out.println(Arrays.toString(arr1));
//        int[] arr2 = Arrays.copyOfRange(arr, 3,6);
//        System.out.println(Arrays.toString(arr2));

//        Arrays.fill : 배열에 모든값을 변경(채우기)
//        String[] arr = new String[5];
//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = "";
//        }
//        Arrays.fill(arr, "");

//         2차원 배열의 선언과 값 할당
//         방법 1 . 선언후 할당 방식
//        {{1,2}, {1,2},{1,2}}
//        arr1[0][0] =1;
//        arr1[0][0] =1;
//        arr1[1][0] =1;
//        arr1[1][1] =2;
//        arr1[2][0] =1;
////        방법 2. 리터럴 방식
//        int[][] arr2 = {{1,2}, {1,2},{1,2}};

//    [3][4] 사이즈의 2차원배열을 선언하고, 1~12 까지 숫자값을 각 배열에 순차적으로 할당
//             {{1,2,3,4}, {5,6,7,8}, {9,10,11,12}}
//        int [][] arr = new int[3][4];
//        int num =1;
//
////      2중 for문으로 배열에 값 채우기
//        for(int i=0;  i < arr.length; i++){
//            for(int j = 0; j <arr[i].length; j++){
//                arr[i][j] = num; // num 저장
//                num++;          // num 증가
//            }
//        }
////        2차원배열의 출력
//        System.out.println(arr); //2차원배열의 heap 주소값;
//        System.out.println(Arrays.toString(arr)); // 각 1차원배열의 heap 주소값
//        System.out.println(Arrays.deepToString(arr)); // 각 1차원배열의 값을 출력

//        프로그래머스 - 행렬의 덧셈
//            Scanner sc = new Scanner(System.in);
//
////            행렬 크기 입력
//        System.out.println("행개수 입력:");
//        int n = sc.nextInt();
//
//        System.out.println("열 개수 입력:");
//        int m = sc.nextInt();
//
//        int[][] arr1 = new int[n][m];
//        int[][] arr2 = new int[n][m];
//
////        첫 번째 행렬 입력
//        System.out.println("첫 번째 행렬 입력:");
//        for (int i =0; i<n; i++){
//            for(int j = 0; j<m; j++){
//                arr1[i][j] = sc.nextInt();
//            }
//        }
//        int[][] result = new int[n][m];
//
//        //행렬 덧셈
//        for(int i =0; i < n; i++){
//            for(int j = 0; j<m; j++){
//                result[i][j] = arr1[i][j] + arr2[i][j];
//            }
//        }
//
////      결과 출력
//        System.out.println("행렬 덧셈 결과:");
//        for(int i =0; i<n; i++){
//            for(int j = 0; j < m; j++){
//                System.out.println(result[i][j] + "");
//            }
//            System.out.println();
//        }
//        sc.close();

//        프로그래머스 - k번째수
//        int[] answer = new int[commands.length];
//
//        for(int i=0; i < commands.length; i++){
//            int start = commands[i][0] -1; // 시작 인덱스
//            int end = commands[i][1]; // 끝 인덱스
//            int k = commands[i][2] -1; // k번째
//
////            1.array에서 start ~end -1 부분만 잘라내기
//            int[] temp = Arrays.copyOfRange(array,start,end);
//
////            2. 오름차순 정렬
//            Arrays.sort(temp);
//
////            3.k번째 숫자를 결과에 저장
//            answer[i] = temp[k];
//        }
//
//        return answer;

//        가변배열 : 2차원배열에서 각 1차원의 배열의 길이가 서로 다를 수있는 배열의 구조
        int[][] arr1 = {{1, 2}, {1, 2, 3}, {1, 2, 3, 4}};

//        배열 전체 길이는 반드시 사전할당되어야하지만 1차원배열의 길이는 추후 할당가능
        int[][] arr2 = new int[3][];
        arr2[0] = new int[2];
        arr2[1] = new int[3];
        arr2[2] = new int[4];



    }
}



