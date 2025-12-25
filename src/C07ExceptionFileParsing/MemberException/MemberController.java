package C07ExceptionFileParsing.MemberException;

import java.util.List;
import java.util.Scanner;

// 사용자와 인터페이싱(입출력)하는 계층
public class MemberController {
    public static void main(String[] args) {

       Scanner sc = new Scanner(System.in);
       MemberService memberService = new MemberService();
       String input;

       while (true) {
           System.out.println("1번: 회원가입, 2번: 회원상세조회, 3번: 회원목록조회, 4번: 로그인");
           input = sc.nextLine();

           if (input.equals("1")) {
               System.out.println("회원가입 서비스입니다.");

               System.out.println("이름을 입력해주세요");
               String name = sc.nextLine();

               System.out.println("email을 입력해주세요");
               String email = sc.nextLine();

               System.out.println("비밀번호를 입력해주세요");
               String password = sc.nextLine();

               // 사용자의 입력값 단순검증
               if(password.length() <10 || email.length()<10){  
                   System.out.println("입력값이 너무 짧습니다.");
                   return;
               }
               // 예외처리 : 예외발생시, 예외의 원인과 함께 로그인실패 원인 출력
               memberService.login(email, password);  
               System.out.println("로그인 성공입니다.");
               // 회원가입 시 예외 처리
               try {
                   memberService.register(name, email, password);
               } catch (Exception e) {
                   System.out.println(e.getMessage());
               }

               } else if (input.equals("2")) {
               System.out.println("회원상세조회 서비스입니다.");

               System.out.println("회원 Id값을 입력해주세요");
               try {
                   Long id = Long.parseLong(sc.nextLine());
                   Member member = memberService.findById(id);
                   System.out.println(member);
               } catch (Exception e) {
                   System.out.println(e.getMessage());
               }

               } else if (input.equals("3")) {
               System.out.println("회원목록조회 서비스입니다.");
               List<Member> memberList = memberService.findAll();
               System.out.println(memberList);


              } else if (input.equals("4")) {
               System.out.println("로그인 서비스입니다.");

              } else {
               System.out.println("잘못된 입력입니다.");
           }
       }
    }
}

