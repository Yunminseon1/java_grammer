package C01Basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class C01Inputoutput {

    public C01Inputoutput() throws IOException {
    }
   // 출력 : System.out 을 통해 콘솔(터미널명) 출력
   System.out.println(20);
   System.out.print("hello world");
   System,out.print("hello world2");

    public static void main(String[] args) throws IOException {

        // ===== BufferedReader + StringTokenizer =====
        // 입력 예: abc bcd efg
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       String input = br.readLine();
       String[] arr =input.split("");
       System.out.println(arr[0]);
       System.out.println(arr[1]);
       System.out.println(arr[2]);


        // 공백 기준으로 문자열을 분리
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
       // StringTokenizer를 통해 공백을 기준으로 문자열을 하나씩 잘라서 내부에 토큰화
        StringTokenizer st = new StringTokenizer(input);
        System.out.println(st.nextToken());
        System.out.println(st.nextToken());
        System.out.println(st.nextToken());

        br.close();
    }
}

