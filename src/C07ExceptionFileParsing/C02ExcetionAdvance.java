package C07ExceptionFileParsing;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class C02ExcetionAdvance {
    static void main(String[] args) {

      // 의도된 예외 강제 발생 : 특정 시점에 프로그램을 강제 중지시키기위한 목적
       Scanner sc = new Scanner(System.in);
       System.out.println("email을 입력해주세요");
       String email = sc.nextLine();
       System.out.println("password를 입력해주세요");
       String password = sc.nextLine();
       register(email, password);
       System.out.println("DB에 저장되는 코드");

       // Checked Exception의 처리방법

       // 방법1. throws를 통해 checked 예외처리를 위임받고, main에서도 throws(시스템 위임)
          String text = fileRoad("src/C07ExceptionFileParsing/test.txt");
          System.out.println(text);

       // 방법2.throws를 통해 checked 예외처리를 위임받고, 호출하는 쪽에서 예외처리를 한다.
       try{
           String text = fileRoad("src/C07ExceptionFileParsing/test.txt");
           System.out.println(text);
       }catch(IOException e){
           // 사용자에게 메시지 전달
           System.out.println("파일 처리 과정에서 에러가 발생했습니다.");
           e.printStackTrace();
       }


       // 방법3. checked예외를 try catch 하여 unchecked 예외 강제 발생 (DB롤백을 목적으로 처리)
       try {
           String text = fileRoad("src/C07ExceptionFileParsing/test.txt");
           System.out.println(text);
       } catch (RuntimeException e) {
           // 사용자에게 메시지 전달
           System.out.println("파일 처리 과정에서 에러가 발생했습니다.");
           e.printStackTrace();
       }

   }
// filePath 
   static String fileRoad(String path) throws IOException
   static String fileRoad(String path)  {
       Path filePath = Paths.get(path);
       String text = null;
       return text;
   }

   static boolean register(String email, String password) {
       if (password.length() >= 10) {
           return true;
       } else {
           // 예외를 강제 발생시킴으로써 이 시점에서 해당 메서드 강제 종료
           // 예외는 기본적으로 메서드를 호출한 쪽으로 전파
           throw new IllegalArgumentException("비밀번호가 너무 짧습니다.");
       }
       System.out.println("DB에 저장되는 코드");
       return check;
   }
}

}
