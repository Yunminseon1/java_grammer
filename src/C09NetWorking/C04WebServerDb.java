package C09NetWorking;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.charset.StandardCharsets;
import java.sql.*;

public class C04WebServerDb {
    public static void main(String[] args) throws IOException, SQLException {
//                사용자 : 크롬을 통해 http://localhost:8080?id=1 요청 get요청
//                서버 : DB에서 조회한 결과값을  문자열형식으로 응답 1)일반문자열 2)json
        ServerSocket serverSocket = new ServerSocket(8080);

        String url = "jdbc:mysql://localhost:3306/board?useSSL=false";
        String userName = "root";
        String password = "test1234";
        Connection myConnection = DriverManager.getConnection(url, userName, password);
        Statement st = myConnection.createStatement();


        System.out.println("서버시작");
        while(true){
            Socket socket = serverSocket.accept();
            BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            StringBuffer sb = new StringBuffer();
//            소켓안에 사용자의 요청정보가 담겨있는데 이제 까보겠다.
            String line = br.readLine();
            while(line != null && !line.isEmpty()){
                sb.append(line);
                sb.append("\n");
                line = br.readLine();
            }
            String requestString = sb.toString();
            String firstLine = requestString.split("\n")[0];
            String infos = firstLine.split(" ")[1];
            String id = "";
            if(infos.contains("?")){
                id = infos.split("=")[1];
            }

            ResultSet result = st.executeQuery("select * from post2 where id=" +"\'"+ id +"\'");//(안중요)jdbc안의 return값이 java.sql안의 ResultSet이라는 객체에 담겨옴

//            while(result.next()){
//                response += ("id : " + result.getInt("id"));
//                response += ("title : " + result.getString("title"));
//                response += ("content : " + result.getString("content"));
//                System.out.println(result.getInt(String response = "HTTP/1.1 200 OK\r\n\r\n" + "hello world java" + id));
//                System.out.println(result.getString("title"));
//                System.out.println(result.getString("contents"));
//            }

            //사용자의 요청 1.get 2.id
            //System.out.println(requestString);                              // 동적코딩
            ObjectMapper objectMapper = new ObjectMapper();
            String response = "HTTP/1.1 200 OK\r\n"
                    +"Content-Type: application/json; charset=utf-8" + "\r\n\r\n" + ;
            socket.getOutputStream().write(response.getBytes(StandardCharsets.UTF_8));
            socket.getOutputStream().flush();
            socket.close();
        }



        class Post{
            private int id;
            private String title;
            private String content;
        }

        class Post1{
            private int id1;
            private String title1;
            private String content1;
        }


    }
}
