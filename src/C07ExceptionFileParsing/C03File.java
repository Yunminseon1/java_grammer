package C07ExceptionFileParsing;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.List;

public class C03File {
    static void main(String[] args) throws IOException {
        
        // 콘솔창에 키보드를 통한 입출력
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       String input = br.readLine();
       System.out.println(input);

       // 파일에서 읽기
       BufferedReader br2 = new BufferedReader(new FileReader("src/C07ExceptionFileParsing/test.txt"));
       String line = br2.readLine();
       System.out.println(line);
       while (line !=null){
           System.out.println(line);
           line = br2.readLine();
       }

       // 파일에서 읽기 : NIO패키지
       Path filePath = Paths.get("src/C07ExceptionFileParsing/test.txt");
       String st1 = Files.readString(filePath);  // readString : 문자열 전체를 통째로 read
       System.out.println(st1);
       List<String> st2 = Files.readAllLines(filePath);  // readAllLines : 문자열을 라인별로 split 하여 list형태로 저장
       System.out.println(st2);

        // 파일에 문자열 쓰기
        Path filePath = Paths.get("src/C07ExceptionFileParsing/test.txt");
        
        Files.write(filePath,"홍길동1".getBytes(), StandardOpenOption.CREATE_NEW); // 새로쓰기
        Files.write(filePath,"홍길동1\n".getBytes(), StandardOpenOption.WRITE); // 덮어쓰기
        Files.write(filePath,"홍길동2\n".getBytes(), StandardOpenOption.APPEND); // 추가쓰기





    }
}

