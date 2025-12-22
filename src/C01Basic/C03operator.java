package C01Basic;

public class C03operator {
    public static void main(String[] args) {
//        산술연산자 : 사칙연산
//        int n1 = 8;
//        int n2 = 3;

//        // * : 곱셈 /: 나눗셈(몫)  % : 나머지
//        System.out.println("n1 * n2 = " + (n1 * n2));
//        System.out.println("n1 * n2 = " + (n1 / n2));
//        System.out.println("n1 * n2 = " + (n1 % n2));

//        대입연산자
//        int n = 7;
//        n += 7;
//        n -= 7;
//        n *= 7;
//        n %= 7;
//
//
//        int n1 = 7;
//        int n2 = 7;
//        int n3 = 7;
//
//        n1 = n1 -3;
//        n2 -= 3;
//        n3 =- 3;
//
//        System.out.println(n1);
//        System.out.println(n2);
//        System.out.println(n3);
//
//        int n4 = 10;
//        int n5 = 10;
//        n4 /= 3; //3
//        n5 %= 3; //1
//
//        System.out.println(n4);
//        System.out.println(n5);

//        증감연산자
//        int a = 10;
//        a = a+1; //11
//        System.out.println(a);
//        a += 1; //12
//        System.out.println(a);
//        a++; //13
//        ++a; //14
//        System.out.println(a);

        // a++ : 후위증감연산자. 현재 라인명령문이 실행되고 나서 1을 더함
        // ++a : 전위증감연산자. 현재 라인명령문이 실행되기 전에  1을 더함

        int b = 5;
        int c = b++; // c: 5
        int d = ++b; // d: 7

//        비교연산자 : ==, !=, >, >= 등
//        int n1 = 10;
//        int n2 = 20;
//        System.out.println(n1 == n2);
//        System.out.println(n1 != n2);
//        if(n1>n2){
//            System.out.println("n1이 n2보다 큽니다");
//        }

//        논리연산자 &&, ||, !
//        int n1 = 10;
//        int n2 = 20;
//        boolean b1 = !(n1>5 && n1<7);
//        System.out.println(b1);

        // 비트연산자: 컴퓨터의 2진체계에서의 연산방식. &, |, ^, <<, >>
        int n1 = 5;
        int n2 = 4;
        System.out.println(n1 & n2);
        System.out.println(n1 | n2);
        // n1의 값을 왼쪽으로 1칸옮긴다는 의미는 해당 숫자값에 2로 1번 곱한다는 의미
        System.out.println(n1 << 1); //10
        // n2의 값을 오른쪽으로 2칸옮긴다는 의미는 해당 숫자값에 2로 2번 나눈다는 의미
        System.out.println(n2 >> 2); //1

    }
}
