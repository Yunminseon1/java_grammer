package C01Basic;

import java.util.Scanner;

public class C04ifStatements {
    public static void main(String[] args) {

        // 도어락키 예제
        String answer = "1234";
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        if(input.equals(answer)) {
            System.out.println("문이 열렸습니다");
        }else{
             System.out.println("비밀번호가 틀렸습니다");
        }

//         교통카드 예제
//         System.out.println("현재 가지고 있는 돈은 얼마인가요?");
//         사용자가 가지고있는 돈을 int로 입력받는다.
//         10000이상이면 택시를 타시오 출력
//         10000미만~3000원 이상이면 버스를 타시오 출력
//         3000원 미만이면 걸어기시오 출력


//        Scanner sc = new Scanner(System.in);
//        int money = Integer.parseInt(sc.nextLine());

////       if else if 구문에서 조건식은 택1 즉 한 조건에 해당하면 실행후 구문밖으로 빠져나감.
//        if(money >= 10000) {
//            System.out.println("택시를 타시오");
//        }else if (money >= 3000){
//             System.out.println("버스를 타시오");
//        }
//        else {
//            System.out.println("걸어가시오");
//        }
//
//     if문을 독립적으로 따로 두고 싶은 경우에는 정확한 범위지정으롱해 if문이 중복되어 실행되지않게 해야함
//        if (money >= 10000) {
//            System.out.println("택시를 타시오");
//        }
//        if (money < 10000 && money >= 3000) {
//            System.out.println("버스를 타시오");
//        }
//        if (money < 3000) {
//            System.out.println("걸어가시오");
//        }

//      삼항 연산자 : 결과값 = 조건식?반환값1:반환값2

//        String answer = "1234";
//        Scanner sc = new Scanner(System.in);
//        String input = sc.nextLine();
//        String result = answer.equals(input)? "문이 열렸습니다." : "비밀번호가 틀렸습니다";
//        System.out.println(result);

//      switch 문 : if, else if, else if 등 여러조건식이 있을때 가독성있게 함
//      input과 case의 값들은 equal관계이고 구문마다 반드시 break를 넣어줘야함
//      default는 그외의 의미로서 else와 같은 의미

//        Scanner sc = new Scanner(System.in);
//        int input = Integer.parseInt(sc.nextLine());
//
//        switch (input){
//            case 1:
//                System.out.println("대출 업무입니다");
//                break;
//            case 2:
//                System.out.println("예금 업무입니다");
//                break;
//            case 3:
//                System.out.println("적금 업무입니다");
//                break;
//            default:
//                System.out.println("잘못된 적금입니다");
//        }

    }

}