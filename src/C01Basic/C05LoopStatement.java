package C01Basic;

import java.util.Scanner;

public class C05LoopStatement {
    public static void main(String[] args) {

     // while문의 조건식에 변화를 주지않으면 while문은 기본적으로 무한루프를 지향
     // 아래 while문은 10번 반복되는 반복문

       int a = 0;
       while (a<10){
           System.out.println("hello world");
           a=a+1;
       }

     while 문을 활용하여 2~10까지 출력
       int b = 3;
       while(b < 11){
           System.out.println(b);
           b++;
       }

       int c = 2;
       while (true){
           System.out.println(c);
           c++;
           if(c>10){
             // break 키워드를 통해 가장 가까이에 있는 반복을 즉시 종료
               break;
           }
       }

       // 반복되는 도어락키 예제
       // 만약 비밀번호를 맞추면 즉시종료, 5회 입력을 초과할때까지 맞추지못하면 종료
       // 5회입력을 초과할때까지 맞추지못하면 종료 -> 비밀번호 5회 초과 출력
       String answer = "1234";
       Scanner sc = new Scanner(System.in);

       int count = 0; // 입력 횟수

       // 무한반복문
       while (true) {
           System.out.print("비밀번호 입력: ");
           String input = sc.nextLine();
           count++; // 입력 횟수 증가

           // 비밀번호 맞음 → 즉시 종료
           if (input.equals(answer)) {
               System.out.println("비밀번호가 맞습니다. 문이 열립니다!");
               break;
           }

           // 5회 초과 → 종료
           if (count >= 5) {
               System.out.println("비밀번호 5회 초과! 잠금되었습니다.");
               break;
           }

           System.out.println("비밀번호가 틀렸습니다. 다시 입력하세요.");
       }

       // 입력한 숫자의 구구단 단수 출력 ex)2를 입력 -> 2x1=2 2x2=4 ... 2x9=18

       while (true) {
           Scanner sc = new Scanner(System.in);
           int input = Integer.parseInt(sc.nextLine());
           int count = 1;
           while (count < 10) {
               System.out.println(input + "X" + count + "=" + input * count);
               count++;
           }
       }


        // do while  문은 무조건 1번은 실행되는 while문
       int a = 11;
       do {
           System.out.println("hello world");
       }
       while (a < 10);

        // for문 : 초기식, 조건식, 증감식이 모두 포함돼어있는 반복문
       for (int i=1; i<10; i++){
           System.out.println("hello world");
       }

         // 1부터 10중에 홀수만 출력하기

         // continue: 반복문의 증감, 조건식으로 이동하는 명령어. 즉, continue 하위의 명령문을 더이상 실행하지않음
       for (int i = 0; i < 11; i++) {
           if (i % 2 == 1) {
               // continue는 코드의 가독성과 직관성을 위해 사용
               continue;
           }
           System.out.println(i);
       }
    }

}
