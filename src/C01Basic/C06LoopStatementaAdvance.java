package C01Basic;

import java.util.Arrays;
import java.util.Scanner;

public class C06LoopStatementaAdvance {


    public static void main(String[] args) {

//        1부터 20까지 수중에 짝수의 총합을 구하여라
        int a = 10;
        int total = 0;
        for (int i = 1; i < 21; i++) {
            if (i % 2 == 0) {
                total += i;
            }
            System.out.println(total);
        }

//        두수의 최대공약수 찾기

//        int a = 24;
//        int b = 36;
//        int min = a > b ? b : a; // Math.min(a,b);
//        int answer = 0;
//        for (int i = 1; i < min + 1; i++) {
//            if (a % i == 0 && b % i == 0)   {
//                answer = i;
//            }
//        }
//
//        for (int i = min; i > 0; i--) {
//            if(a%i==0 && b%i==0){
//                answer = i;
//                break;
//            }
//
//        }
//        System.out.println(answer);

//      소수인지 여부 판별. 소수란 1과 자신을 제외한 숫자로 나누어지지 않는 1보다 큰 수
//
//        Scanner sc = new Scanner(System.in);
//        int input = Integer.parseInt(sc.nextLine());
//        boolean check = false;
//        for (int i=2; i<=input; i++){
//            if(input % i ==0){
//                check = true;
//                break;
//            }
//        }
//        if(check || input ==1){
//            System.out.println("소수가 아닙니다.");
//        }else{
//            System.out.println("소수입니다.");
//        }

//        int[] arr = {1,3,5,7};
//
//        for(int i=0; i<arr.length; i++){
//            System.out.println(arr[i]);
//        }     일반 for문을 통한 배열접근


//      향상된(enhanced for문, for each문 )을 통한 배열 접근 방식

//        for(int a : arr){
//            System.out.println(a);
//        }

//      일반for문을 통한 arr의 저장된 값 변경
//        for(int i =0; i<arr.length; i++){
//            arr[i] += 10;
//        }

////      참조형변수(객체타입)는 기본적으로 변수를 통한 출력시에 메모리값이 출력
////      그래서, 내장된 메서드를 통해 힙메모리안의 객체값을 보기좋게 출력 할수 있음

//
//
//        System.out.println(Arrays.toString(arr));
//
////      향상된 for문을 통한 arr의 저장된 값 변경 -> 원본의 값 변경 불가
//        for (int a : arr){
//            a += 10;
//        }

//      자바 변수의 유효범위: {}
//        int num1 = 10;
//        if(true){
//            num1 = 20;
//            int num2 =30;
//        }
// 하위 영역의 블록(중괄호)에서 정의된 변수는 상위블록에서는 접근불가

//        num2 = 40;

//        // for문은 사용했던 변수명을 for문이 끝난 이후에 또다른 for문에서 재선언이 가능.
//        for (int i=0; i<10; i++){
//            System.out.println(i);
//        }
//        for (int i=0; i<10; i++){
//            System.out.println(i);
//        }

//      다중 for문
//      2~9단 까지 모든 구구단 한꺼번에 출력
//      2단입니다.를 먼저 출력후에 2x1=2 2x2=4 2x3=6
//      3단입니다.를 먼저 출력후에 3x1=3 3x2=6 3x3=9

//        for (int i = 2; i <= 9; i++) {  // 2단 ~ 9단
//            System.out.println(i + "단입니다.");
//
//            for (int j = 1; j <= 9; j++) {   // 각 단의 1~9 출력
//                System.out.println(i + " x " + j + " = " + (i * j));
//            }
//
//            System.out.println(); // 단과 단 사이 공백
//        }

//      라벨문: 반복문에 이름을 붙이는것
//        loop1:
//        for(int i=0; i<10; i++){
//            boolean check = false;
//            for(int j = 0; j < 10; j++){
//                if(true){
//// 원하는 for문을 라벨링을 통해 break 또는 continue 까지 시킬수있음
//                   break loop1;
//                }
//            }
//        }
    }
}
