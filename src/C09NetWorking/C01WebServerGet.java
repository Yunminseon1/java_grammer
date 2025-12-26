package C09NetWorking;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.charset.StandardCharsets;

public class C01WebServerGet {
    static void main(String[] args) throws IOException {
       // 사용자 : 크롬을 통해 http://서버url 요청 get 요청(http 요청 문서조립 필요)
       // 서버 : "hello world java" 문자열을 응답 (http 응답 문서조립 필요)
       // 소켓이란 서버와 사용자가 통신을 하기 위한 네트워크통신의 끝점을 나타내는 개념
        ServerSocket serverSocket = new ServerSocket(8081);
        System.out.println("서버시작 ");
        while(true){
           // accept : 사용자의 연결 요청을 수락
           // socket 객체 안에는 사용자가 보내온 http 요청문서 및 사용자 정보(ip등)
            Socket socket = serverSocket.accept();
           // 사용자에게 서버의 응답메시지를 전송하는것이다.
            String response = "HTTP/1.1 200 OK\r\n\r\n" + "hello world java";
            socket.getOutputStream().write(response.getBytes(StandardCharsets.UTF_8));
           // flush란 일반적으로 변경 사항을 확정하는것을 의미한다.
            socket.getOutputStream().flush();
            socket.close();



        }
    }
}

