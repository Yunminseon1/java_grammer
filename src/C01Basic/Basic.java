package C01Basic;

import java.util.Random;
import java.util.Scanner;

public class Basic {
    public static <Gugudan> void main(String[] args) {
       // 문제1
       int pear = 5;
       int apple = 6;
       int orange = 7;

       int total = pear + apple + orange;
       float avg= total / 24f;

       System.out.println("하루에 생산되는 과일의 총 갯수 :"+ total + "개");
       System.out.println("시간당 생산 갯수 :"+ avg + "개");

       // 문제2
       int result = 0;
       int n = 5;

       for (int i = 1; i <= n; i++) {
           result += i;
       }
       System.out.println("결과 :" + result);


       // 문제3
       int n1 = 0, n2 =0;
       int result = 0;

       n1 = 2;
       n2 = 5;

       if(n1 > n2){
           int n3 = n1;
           n1 = n2;
           n2 = n3;

       }
       for (int i = n1; i <= n2; i++){
           result += i;
       }
       System.out.println("결과:"+ result);

       // 문제4
       for(int i =1; i*3 <= 100; i++){
           System.out.println(i*3);
       }
       for (int i =1; i<=100; i++){
           if(i%3==0){
               System.out.println(i+"은 3의 배수입니다.");
           }
       }

         // 문제5
       for(int i =1; i<=10; i++){
           for(int j = 0; j <10; j++){
               int num = i + j;
               if(num > 10){
                   num -= 10;
                   System.out.printf("%d", num);
               }
               System.out.println();
           }
       }

       // 문제6
       for (int i = 0; i < 5; i++){
           for (int j = 0; j <4-i; j++){
               System.out.println(" ");
           }
           for (int j=0; j < 2*i+1; j++){
               System.out.println("*");
           }
           System.out.println();
       }

       // 문제7
       Scanner sc = new Scanner(System.in);
       // Sc치고 ctrl + space 치면 import까지 나옴. new도 똑같음
       System.out.println("정수 : ");

       int n = sc.nextInt();
       int i = 0;

       for(i = 2; i <= n; i++) {
           if(n %  i == 0) { //ex) 5를 2부터 3, 4, 5, 나눴을 때 나머지가 0인건 5. 그래서 소수이다.
               break;
           }// if
       }// for

       if(i == n) { // 입력받은 숫자 n과 i과 같은 숫자이면 소수
           System.out.println(n + "은 소수입니다.");
       }
       else {
           System.out.println(n + "은 소수가 아닙니다.");
       }

       // 문제8
       int[] coin = {500, 100, 50, 10};
       int money = new Random().nextInt(500) + 1;
       money *= 10;
       System.out.println("금액: "+ money);

       for (int i = 0; i < coin.length; i++){
           int res = money / coin[i];

           System.out.println(coin[i]+"원:" + res);
           money %= coin[i];
       }

       // 문제9
       int[] lotto = new int[6];

       outer : for(int i = 0; i < lotto.length;) {
           lotto[i] = new Random().nextInt(45) + 1; //1~45사이의 난수

           // 중복체크(경우의 수)
           for(int j = 0; j < i; j++) {
               if(lotto[i] == lotto[j]) {
                   continue outer;
               }// if
           }// inner
           System.out.print(lotto[i] + " ");

           i++;
       }// outer

       // 문제10
       String[][] str = new String[3][4];
       char ch = 'A';

       for(int i = 0; i < str.length; i++) {
           for(int j = 0; j < str[i].length; j++) {

               str[i][j] = "" + ch++;
               System.out.print(str[i][j] + " ");

           }

           System.out.println();

       }

       // 문제11
       char[][] ch = { {'A', 'B'},
               {'C', 'D', 'E'},
               {'F'} };


       for(int i = 0; i < ch.length; i++) {
           for(int j = 0; j < ch[i].length; j++) {
               System.out.print(ch[i][j] + " ");
           }// inner
           System.out.println();
       }// outer

       // 문제12
       int result = 0;
       float avg = 0;
       int cnt = 0;


       double[][] arr = new double[0][];
       for(int i = 0; i < arr.length; i++) {
           for(int j = 0; j < arr[i].length; j++) {
               result += arr[i][j];
               cnt++;

           }// inner

       }// outer
       System.out.println("총합 : "+ result);
       avg = (float)result / cnt;
       System.out.printf("평균 : "+ "%.2f", avg);
        
       // 문제13
       String str;
       int count = 0;

       System.out.println("입력: ");
       Scanner sc = new Scanner(System.in);
       str = sc.next();

       for(int i = 0; i < str.length(); i++){

           if(str.charAt(i) == 'a'){
               count++;
           }
       }
       System.out.println("a의 갯수 : " + count);//

      // 문제14
       String str = ""; // 원본 문장을 입력받을 객체
       String str2 = "";// 원본을 뒤집어서 저장할 객체

       System.out.print("입력 : ");
       Scanner sc = new Scanner(System.in);
       str = sc.next();

       // 키보드에서 받은 원본 문장을 뒤집어서 str2에 저장하는 코드
       boolean str;
       for(int i = str.length(); i > 0; i--){
           str2 += str.charAt(i-1);
       }

       if(str.equals(str2)){
           System.out.println(str + "은(는) 회문수 입니다.");
       }
       else{
           System.out.println(str + "은(는) 회문수가 아닙니다.");
       }

    }
}

