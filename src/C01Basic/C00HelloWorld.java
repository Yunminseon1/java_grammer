package C01Basic;

import java.math.BigDecimal;
// 클래스의 명명규칙
// 1) 반드시 public class 명과 파일 명이 일치해야함
// 2) 일반적으로 대문자 알파벳으로 시작
public class C00HelloWorld {

    public static void main(String[] args) {
//      1) main메서드는 java파일 실행시 실행의 시작점이자, 가장먼저 실행되는 메서드
//      2) public static void : 어디서든 접근 가능하고, 반환(리턴) 값이 없는 메서드
//      3) 메서드명, 변수명은 일반적으로 알파벳 소문자로 시작

        // 출력 예시 : sout
        System.out.println("hello world!");

        // 메서드 호출 : 메서드 호출시에는 메서드명()을 통해 호출
        System.out.println(method2());

        // 변수의 명명규칙
        // String myFirstName = "hongildong";
        // String my_first_name = "hongildong";

        // 정수 타입의 예
//        byte a = 127;
//        byte b = -128;

        // overflow / underflow
//        a++;
//        System.out.println(a);
//        b--;
//        System.out.println(b);

        // long 타입
//        long l1 = 10L;
//        long l2 = 20L;
//        System.out.println(l1 + l2);

        // 실수 타입
//        float f1 = 1.123f;
//        double d1 = 1.123;

        // double 오차 예시
//        double d2 = 0.1;
//        System.out.println(d2);

        // 반복 누적 오차 예시
//        double total = 0;
//        for (int i = 0; i < 1000; i++) {
//            total += 0.1;
//        }
//        System.out.println(total);

        // 해결방법 1: 정수로 변환하여 계산
//        double total2 = 0;
//        for (int i = 0; i < 1000; i++) {
//            total2 += (0.1 * 10);
//        }
//        System.out.println(total2 / 10);

        // 해결방법 2: BigDecimal 사용
//        double dd1 = 1.03;
//        double dd2 = 0.42;
//        System.out.println(dd1 - dd2);
//
//        BigDecimal b1 = new BigDecimal("1.03");
//        BigDecimal b2 = new BigDecimal("0.42");
//        BigDecimal result = b1.subtract(b2);
//
//        System.out.println(result);               // BigDecimal 값
//        System.out.println(result.doubleValue()); // double로 변환
    }

    public static int method2() {
        return 10;

    }



}

