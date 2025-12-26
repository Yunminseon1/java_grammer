package C09NetWorking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.charset.StandardCharsets;
import java.sql.Struct;

public class C02WebServerGet {
    static void main(String[] args) throws IOException {
       // 사용자 : 크롬을 통해 http://localhost:8081?id=1 get 요청(http 요청 문서조립 필요)
       // 서버 : "hello world java + id" 문자열을 응답 (http 응답 문서조립 필요)

        ServerSocket serverSocket = new ServerSocket(8081);
        System.out.println("서버시작 ");
        while(true){

            Socket socket = serverSocket.accept();
            BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            StringBuffer sb = new StringBuffer();
            String line = br.readLine();
            while(line != null && !line.isEmpty()){
                sb.append(line);
                sb.append("\n");
                line = br.readLine();
            }
            String requestString = sb.toString();
            String firstline = requestString.split("\n")[0];
            String infos = firstline.split("")[1];
            String id ="";
            if(infos.contains("?")){
                id = infos.split("=")[1];
            }
            System.out.println(id);
            String response = "HTTP/1.1 200 OK\r\n\r\n" + "hello world java" + id;
            socket.getOutputStream().write(response.getBytes(StandardCharsets.UTF_8));

            socket.getOutputStream().flush();
            socket.close();



        }
    }
}

