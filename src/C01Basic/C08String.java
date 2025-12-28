package C01Basic;

import java.util.regex.Pattern;

public class C08String {
    public static void main(String[] args) {
       // String 선언 방법 2가지
       // 1. 객체선언방식
       String st1 = new String("hello world");
       String st2 = new String("hello world");


       // 2. 리터럴선언방식 : String pool을 사용하는 방식
       String st3 = "hello world";
       String st4 = "hello world";

       System.out.println(st1 == st2); //false
       System.out.println(st2 == st3); //true
       System.out.println(st1 == st3); //false

       // 참조자료형의 비교는 ==을 지양
       System.out.println(st1.equals(st3)); //true

       // .equals : 힙메모리의 문자열을 가져와서 equal 관계 비교
       String st1 = "hello1";
       String st2 = "Hello1";
       System.out.println(st1.equals(st2)); //false
       System.out.println(st1.equalsIgnoreCase(st2)); //true

       // length : 문자열의 길이 출력
       String st1 = "hello1 world1 java1";
       System.out.println(st1.length());

       // charAt(n) : 특정 index의 문자(char)값을 리턴
       char ch1 = st1.charAt(7);
       System.out.println(ch1);

       // a의 개수가 몇개인지 출력

       int total = 0;
       for (int i = 0; i < st1.length(); i++) {
           if (st1.charAt(i) == 'a') {
               total++;
           }
       }
       System.out.println(total);

       // toCharArray:String문자열을 char배열로 변환
       for ( char ch : st1.toCharArray()){
           if (ch == 'a' ) {
               total++;
           }
       }
       System.out.println(total);

       // indexof(문자열) : 특정 문자열의 위치(index) 반환. 가장 먼저 나오는 문자열의 위치 반환
       String st1 ="hello java java";
       System.out.println(st1.indexOf("java"));
       System.out.println(st1.lastIndexOf("java"));
       System.out.println(st1.contains("hello"));//true
       System.out.println(st1.contains("world"));//false

       // 문자열 더하기 : += 사용. 성능측면에서는 추후 배울 StringBuffer, StringBuilder를 사용
       String st1 = "hello";
       st1 += "world";
       st1 += "1"; // String에 char를 더하면  Strinf으로 변환
       System.out.println(st1);

     // 프로그래머스 - 플랫폼 사용법 (나머지구하기)

     // 프로그래머스 - 특정 문자 제거하기

       // substring(a,b) : a이상 b미만의 index의 문자를 잘라 반환한다
       String st1 = "hello world";
       System.out.println(st1.substring(0, 5));//hello
       System.out.println(st1.substring(6, st1.length()));//world

       // split: 특정문자를 기준으로 잘라서 문자배열로 만드는것.
       String a = "a:b:c:d";
       String[] arr = a.split(":");

       String b = "a b c  d";
       String[] arr2 = b.split("");
       String[] arr3 = b.split("\\s+");
       System.out.println(arr2.length);
       System.out.println(arr3.length);

           // null과 공백의 차이
       String st1 = null; //null은 문자열 아님
       String st2 = "";// 빈문자열은 문자열
       String st3 = " ";// 공백

       System.out.println(st1 == st2); //false
       System.out.println(st1.isEmpty());// Null PointerException 발생
       System.out.println(st2.isEmpty());//true
       System.out.println(st3.isEmpty());//false
         System.out.println(st3.isBlank());//true

       // 공백의 개수 세기
       String abc = "hello    world    java";
       int total = 0;
       for (int i = 0; i < abc.length(); i++) {
           if (abc.substring(i, i + 1).isBlank()) {
               total++;
           }
       }
       System.out.println(total);

       String my_string ="abcdef";
       String letter = "f";
       String answer = "";

       for (int i = 0; i < my_string.length(); i++) {
           // 한 문자씩 가져오기
           char ch = my_string.charAt(i);

           // letter의 첫 문자와 다르면 추가
           if (ch != letter.charAt(0)) {
               answer += ch;
           }
       }

       System.out.println(answer);

       // 프로그래머스 - 가운대 글자 가져오기
       String my_string = "abcdef";
       String s = "abcde";
       String answer = "";
       if (s.length() % 2 == 0) {

       } else {
           answer = s.substring(s.length() / 2, s.length() / 2 + 1);
       }

       System.out.println();


       // trim, strip : 문자열 양쪽 끝의 공백제거
       String st1 = " hello world  ";
       String st2 = st1.trim();
       String st3 = st1.strip();
       System.out.println(st2);

       // toUpperCase : 모든 문자열을 대문자로 변환, tLowerCase는 소문자로 변환.
       String st1 = "Hello";
       String st2 = st1.toUpperCase();
       String st3 = st1.toLowerCase();
       System.out.println(st2);
       System.out.println(st3);

       // replace(a,b) : a문자열을 b문자열로 대체
       String st1 ="hello world world";
       String st2 = st1.replace("world", "java");
       System.out.println(st2);

       // replaceAll(a,b) : replace와 사용법은 동일하다 차이점은 정규표현식을 쓸수있는것이 차이점이다
       String st1 = "01234ABc   한글123";

       // 한글제거
       String answer1 = st1.replaceAll("[가-힣]", "");
       System.out.println(answer1);

       // 알파벳 소문자제거
       String answer2 = st1.replaceAll("[a-z]","" );
       System.out.println(answer2);

       // 알파벳 제거
       String answer3 = st1.replaceAll("[A-Za-a]","" );
       System.out.println(answer3);

       // 공백제거
       String answer4 = st1.replaceAll(" ","" );
       System.out.println(answer4);
         String answer5 = st1.replaceAll("\\s+","" );
         System.out.println(answer5);

       // 전화번호 검증
       String number = "010-1234-1234";
       boolean check =  number.matches("//d{3}-//d{4}-//d{4}-$");
       if(check==false){
           System.out.println("형식이 잘못됐습니다. 다시 입력해주세요.");
       }

       // 이메일 검증
       String email = "abc1234@naver.com";
       boolean check = Pattern.matches("^[a-z0-9]$+[a-z]+.com$",email);
       System.out.println(check);


       // 문자열 조립 : StringBuffer, StringBuilder
       String arr[] = {"java", "pyhton", "javascript"};
       StringBuffer sb = new StringBuffer();
       String result = "";
       for(int i =0; i<arr.length; i++){
           sb.append(arr[i]);
           sb.append("\n"); // \n은 줄바꿈
       }
       sb.insert(0,"C++"); // 문자열 중간에 insert하는것은 성능저하를 발생
       sb.deleteCharAt(0); // 마지막 index를 삭제하는것 외에는 성능저하 발생
       result = sb.toString();
       System.out.println(result);

     // StringBuilder는 성능이 뛰어나지만, 동시성 문제있음(Thread -safe 하지않음)
     //   예를 들어 ) 쓰레드A가 append("hello") 쓰레드B가("world")
     //   이 두작업이 중간에 섞여 "heworllo" 이런식을 잘못된 값을 입력할수있음

       StringBuilder sb2 = new StringBuilder();// 실전코딩에서는 StringBuffer 사용

         문자열 뒤집기
       String st1 = "hello";
       for (int i =0; i<st1.length(); i++){
           sb2.append(st1.charAt(i));
       }
       StringBuilder sb3 = new StringBuilder(st1);
       System.out.println(sb2);
       sb3.reverse();
       System.out.println(sb3);


     // 프로그래머스 - 문자열밀기
       String st1 = "hello";
       String st2 = "ohell";

       // A를 StringBuilder 로변환

       // A에 마지막값을 앞으로 insert, 마지막값 제거
       // A와B를 비교

       StringBuilder sb3 = new StringBuilder(A);

       for(int  i = 0; i<A.length(); i++){
           sb.insert(0, sb2.length());
           sb2.deleteCharAt(sb2.length());
           count++;


       // 문자열 비교
       String st1 = "hello";
       String st2 = "dello";
       String st3 = "hello";
       String st4 = "hfllo";


       System.out.println(st1.compareTo(st2)); // 양수
       System.out.println(st2.compareTo(st1)); // 음수
       System.out.println(st1.compareTo(st3)); // 0
       System.out.println(st4.compareTo(st3)); // 양수


    }
}


