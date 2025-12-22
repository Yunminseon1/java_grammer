package C01Basic;

public class C02Variable {

    public static void main(String[] args) {

        // ----------------------------
        // 1. 문자형 char / 문자열 String
        // ----------------------------
        char c1 = '가';
        String st1 = "가";

        // 배열 초기값 확인
        char[] charArr = new char[10];
        String[] stArr = new String[10];

        System.out.println(stArr[0]);  // null 출력


        // ----------------------------
        // 2. 빈 문자열 vs null
        // ----------------------------
        String s1 = "";      // 빈 문자열
        String s2 = null;    // 값 없음

        System.out.println(s1.isEmpty()); // true
        // System.out.println(s2.isEmpty()); // NullPointerException 발생


        // ----------------------------
        // 3. 배열의 요소 접근
        // ----------------------------
        String[] stArr2 = new String[5];
        stArr2[1] = "helloworld1";
        stArr2[3] = "helloworld3";

        for (int i = 0; i < stArr2.length; i++) {
            if (stArr2[i] != null) {
                System.out.println(stArr2[i].length());
            } else {
                System.out.println("null");
            }
        }


        // ----------------------------
        // 4. 타입변환
        // ----------------------------
        // int → long
        int i1 = 10;
        long l1 = i1;

        // int → double
        int i2 = 10;
        double d2 = i2;
        System.out.println(d2);

        // double → int
        double d3 = 10.5;
        int i3 = (int) d3;
        System.out.println(i3);  // 10


        // ----------------------------
        // 5. 정수/정수 계산의 문제 (소수점 손실)
        // ----------------------------
        int a = 1;
        int b = 4;
        double d4 = a / b;       // 0.0
        double d5 = (double) a / b; // 0.25

        System.out.println(d4);
        System.out.println(d5);


        // ----------------------------
        // 6. char → int (문자 코드 변환)
        // ----------------------------
        char ch = 'a';
        int code1 = (int) ch;
        int code2 = ch;

        System.out.println(code1);
        System.out.println(code2);

        // 문자 비교 (유니코드 값 기준)
        System.out.println('a' > 'b');  // false


        // ----------------------------
        // 7. 문제) 알파벳 소문자 개수 세기
        // ----------------------------
        String text = "Hello Java World! abc xyz AAA bbbbb";

        int count = 0;

        for (int i = 0; i < text.length(); i++) {
            char ch2 = text.charAt(i);
            if ((ch2 >= 'a' && ch2 <= 'z')|| (ch2 >= 'A' && ch2 <= 'Z')) {
                count++;
            }
        }

        System.out.println("소문자 개수: " + count);

        // 변수와 상수
        // 변수: 재할당가능, 재선언은 불가능
        int a1 = 10;
        a1 = 20;
        // int a1 = 30;

        // 싱수: 값의 재할당 불가능. 정해진값(고정된값)을 사용시 상수 사용
        final double PI = 3.14;
        // PI = 3.15;

    }
}
