package C02MethodClass;

// 재귀함수 대표적인 기본 예시: 누적합계, 팩토리얼, 피보나치 수열 -> 모두 재귀로 푸는것을 권고하지 않음.
public class C12RecursiveExample {
    static void main(String[] args) {
////   1~10까지 누적합계(for문 활용)
//        int total = 0;
//        for (int i = 0; i < 11; i++) {
//            total += 1;
//        }
//        System.out.println(total);
//

////        1~10까지 누적합계(for문 활용)
//        int total = 0;
//        for(int i = 0; i < 11; i++){
//            total+=1;
//
//        }
//        System.out.println(total);

////        1~10까지 누적합계(재귀함수)
//        int total2 = sumAcc(1, 10);
//        System.out.println(total2);


//        1~10까지 누적합계(재귀함수)
//        int total2 = sumAcc(1,10);
//        System.out.println(total2);


        //    1~5 까지 누적곱(factorial) - for문
//        factorial();
//        f(n) = n * f(n - 1);
//        f(5) = 5 * (f4);
//        f(4) = 4 * (f3);
//        System.out.println(factorial(5));
//    }
//
//    public static int factorial2(int start, int end) {
//        if (start > end) {
//            return start * factorial(start + 1);
//        }
//        return start + sumAcc(start + 1, end);
//    }
//
//    public static int factorial(int n) {
//        int total2 = 1;
//        for (int i = 1; i <= n; i++) {
//            total2 *= i;
//        }
//        return end * factorial(end - 1);
//    }
//
//    public static int sumAcc(int start, int end) {
//        if (end == 1) {
//            return 1;
//        }
//        return start + sumAcc(start + 1, end);
//    }

//    피보나치 수열
//    1 1 2 3 5 8 13 21 34 ...
//    피보나치 수열의 10번째 값은?
//    풀이1 : for문 만을 이용
        int n1 = 1;
        int n2 = 1;
        int n3 = 0;
        for (int i = 2; i <= 11; i++) {
            n3 = n1 + n2;
            n1 = n2;
            n2 = n1;
        }

//        피보나치 수열
//        1 1 2 3 5 8 13 21 34 ...
//        피보나치 수열의 10번째 값은?
//        풀이1 : for문 만을 이용
//        int n1 = 1;
//        int n2 = 1;
//        int n3 = 0;
//        for(int i =2; i<=11; i++){
//            n3 = n1 +n2;
//            n1 = n2;
//            n2 = n1;
//
//        }

//  풀이2. dp알고리즘(기억하기 - 메모이제이션 알고리즘)을 활용한 풀이법
//   점화식 : f(n) = f(n-1)+f(n+2)
        int[] dp = new int[10];
        dp[0] = 1;
        dp[1] = 1;
        for (int i = 2;
             i < 10; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }

//  풀이2. dp알고리즘(기억하기 - 메모이제이션 알고리즘)을 활용한 풀이법
//        점화식 : f(n) = f(n-1)+f(n+2)
//        int[] dp = new int[10];
//        dp[0] = 1;
//        dp[1] = 1;
//        for (int i = 2; i<10; i++){
//            dp[i] = dp[i-1] +dp[i-2];
//        }

    }

    //    풀이3 : 재귀함수를 이용한 풀이법
    public static int fibonacci (int n){
        if (n <= 2) {
            return 1;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

//    풀이3 : 재귀함수를 이용한 풀이법
//    public static int fibonacci (int n){
//        if(n<=2){
//            return 1;
//        }
//        return fibonacci(n-1)+ fibonacci(n - 2);
//    }

}

