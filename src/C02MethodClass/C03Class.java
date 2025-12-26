package C02MethodClass;

import java.util.ArrayList;
import java.util.List;

public class C03Class {
    public static void main(String[] args) {
     // 클래스 메서드의 기본 호출 방식
        int result = Calculator.sum(10, 20);
        System.out.println(result);

       // 객체가 아닌 클래스사용의 문제점 : 고유의 변수, 고유의 메서드 사용 불가
       // A부서의 매출
        Calculator.sumAcc(20); // 20원 매출 발생
        System.out.println(Calculator.total);

       
        Calculator.sumAcc(30); // 30원 매출 발생
        System.out.println(Calculator.total);

      
        Calculator.sumAcc(40);  // 40원 매출 발생
        System.out.println(Calculator.total);

       
        System.out.println(Calculator.sumAcc(40)); // 누적매출 : 90원

       // B부서의 매출
       // 10원 매출 : 누적 10원

        System.out.println(Calculator.sumAcc(10)); // 100 -> 10이 되어야함

       // 20원 매출 : 누적 30원
        System.out.println(Calculator.sumAcc(20)); // 100 -> 30이 되어야함

       // 객체를 활용한 부서별 매출계산
       // 객체 생성 방법 : 클래스명 객체명 = new 클래스명();
        Calculator.CalculatorForInstance calA = new Calculator.CalculatorForInstance();
        calA.sumAcc(20);
        calA.sumAcc(30);
        calA.sumAcc(40);
        System.out.println(calA.total);
        Calculator.CalculatorForInstance calB = new Calculator.CalculatorForInstance();
        calA.sumAcc(10);
        calA.sumAcc(20);
        System.out.println(calB.total);

       // 클래스메서드 사용 예시
        System.out.println(Math.min(10,20));
       // 객체 사용 예시
        List<Integer> myList = new ArrayList<>();
    }

}

class Calculator {
       // static이 붙어있으면 클래스변수. 붙어있지않으면 객체변수
    static int total = 0;

    public static int sum(int a, int b) {
        return a + b;
    }

    public static int sumAcc(int a) {
        total += a;
        return a;
    }

    static class CalculatorForInstance {
        //    static이 붙어있으면 클래스변수. 붙어있지않으면 객체변수
        int total = 0;
        // 메서드에 static이 있는 경우는 클래스메서드
        // 클래스 메서드는 일반적으로 객체의 상태와 상관없는 독립적인 로직수행시에 사용
        // 클래스 메서드 호출시 : 클래스명.메서드명();
        public static int sum(int a, int b) {
            return a + b;
        }
       // 메서드에 static이 없는 경우는 객체 메서드
       // 객체 메서드 호출시 : 객체명.메서드명();

        public int sumAcc(int total) {
           // this는 객체를 지칭한다 일반적으로 매개변수와 객체변수를 이름을 구분짓기 위해서 사용.
            this.total += total;
            return this.total;
        }
    }
}

