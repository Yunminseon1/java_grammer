package A7이분탐색;

import java.util.Scanner;

public class A01BinarySearch {
    public static void main(String[] args) {
        // 이분탐색은 사전에 정렬된 데이터를 대상으로 log(n)의 복잡도의 검색을 수행하는 알고리즘이다.

        // 이분탐색문제는 이분탐색의 대상을 어떤것으로 설정할지가 핵심이다.
        // 응용상황 : target이 arr에 있다면 index값을 리턴하고, arr에 없다면 있어야할 자리 index를 리턴
        int [] arr = {1,3,5,7,9,11,13,15,17,19};
        int target = 17;
        int sum = 0;

        // start, end index를 두고 mid값 계산  (start+end)/2 = mid
        // mid의 값이 target보다 크다면 end = mid -1
        // mid의 값이 target보다 작다면 start = mid +1
        // mid의 값이 target과 일치하면 answer = mid; break;
        int start = 0;
        int end = arr.length - 1;
        int mid = 0;
        int answer = -1;

        while(start <= end){
            //start, end 중간값
            mid = (start + end) / 2;

            // mid 값이 target보다 크면 왼쪽 탐색
            if (arr[mid] > target) {
                end = mid - 1;
            }
            // mid 값이 target보다 작으면 오른쪽 탐색
            else if (arr[mid] < target) {
                start = mid + 1;
            }
            // 같으면 정답
            else {
                answer = mid;
                break;
            }
        }

        // import java.util.Scanner;
        // import Scanner

//        public class Main{
//            public static void main(String[] args){
//
//                 Scanner sc = new Scanner(System.in);
//                int A = in.nextInt();
//                int B = in.nextInt();
//
//                System.out.println(A+B);
//
//                in.close();
//            }
//        }

//        import java.util.Scanner;
        public class Main{
            public static void main(String[] args){
                Scanner sc = new Scanner(System.in);

                int n = sc.nextInt();

                int array1[] = new int[n];

                for (int i = 0; i<array1.length; i++){
                    array1[i] = sc.nextInt();
                }
                sc.close();

                int min = array1[0];
                int max = array1[0];

                for (int i = 0; i<array1.length; i++){
                    if (min>array1[i]) min = array1[i];
                    if (max<array1[i]) max = array1[i];
                }
                System.out.println(min+""+max);
            }
        }


    }
}
