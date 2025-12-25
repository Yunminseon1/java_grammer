package C07ExceptionFileParsing;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class C04Json {
    public C04Json() {
    }

    static void main(String[] args) throws IOException {
//   외부의 json파일을 java의 클래스(객체) 변환 : json 파싱(역직렬화)
//        Path filePath = Paths.get("src/C07ExceptionFileParsing/myjson1.json");
////    readString : 문자열전체를 통째로 read
//        String st1 = Files.readString(filePath);
//        System.out.println(st1);

//        Jacskon 라이브러리(spring엔 기본적으로 탑재, java에서는 별도로 추가)의 ObjectMapper 클래스를  통한 객체로 파싱
//        ObjectMapper o1 = new ObjectMapper();
////        Map으로 일괄적으로 String, String 으로 파싱
//        Map<String, String> myMap = o1.readValue(st1, Map.class);
//        System.out.println(myMap);
//        System.out.println(myMap.get("name"));
//        내가 직접만든 객체로 파싱
//        Student myStudent = o1.readValue(st1, Student.class);
//        System.out.println(myStudent);
//        System.out.println(myStudent.getName());
//        System.out.println(myStudent.getId());
//    }
////     실제값의 setting은 private 변수이므로 직접 접근 불가.
////     자바의 reflection 기술을 통해 런타임시점에 private 변수로 직접접근가능.
////     다만, 필드값을 유추할수있도록 (getter 메서드 + 기본 생성자)를 생성해야함.
//
//    class Student{
//        private long id;
//        private String name;
//        private String classNumber;
//        private String city;
//

//    }
//
//    public Student() {
//    }
//
//    @Override
//    public String toString() {
//        return "C04Json{}";

//        List 형식으로 지정되는 json파싱 : 트리구조의 JsonNode로 변환
//        Path filePath = Paths.get("src/C07ExceptionFileParsing/myjson1.json");
//        String st1 = Files.readString(filePath);
//        System.out.println(st1);
//
//        ObjectMapper o1 = new ObjectMapper();
//        List<Student> studentList = o1.readValue(st1,List<Student>);
//        JsonNode jsonNodes = o1.readTree(st1);
//        List<Student> StudentList = new ArrayList<>();
//        for (JsonNode j : jsonNodes){
//            Student s1 = o1.readValue(j.toString(),Student.class);
//            studentList.add(s1);
//        }
//        System.out.println(studentList);
    }

//    json직렬화 : 객체 -> json.
//    ObjectMapper o1 = new ObjectMapper();
//    Student s1 = new Student(1, "h1", "1", "seoul");
//    String result = o1.writeValueAsString(s1);
//    System.out.println(s1);
//    System.out.println(result);

}
