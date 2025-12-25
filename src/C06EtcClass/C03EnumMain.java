package C06EtcClass;

public class C03EnumMain {
    static void main(String[] args) {
     // classGrade를 일반 문자열로 설계했을 경우 -> 데이터종류에 대한 통제 불가
       Student s1 = new Student("h1");
       Student s2 = new Student("h2");
       Student s3 = new Student("h3");

       // static final 변수로 설계했을 경우
       Student s1 = new Student("h1", "h1");
       Student s2 = new Student("h2","h2");
       Student s3 = new Student("h3", "h3");

     // classGrade를 enum클래스로 설계 했을 경우
       Student s1 = new Student("h1", ClassGrade.FIRST_GRADE);
       Student s2 = new Student("h2", ClassGrade.FIRST_GRADE);
       Student s3 = new Student("h3", ClassGrade.FIRST_GRADE);
       System.out.println(s1);
    }
}

    class ClassGrade{
       static final String c1 = "FIRST_GRADE";

       static String c2 = "SECOND_GRADE";

       static String c3 = "THIRD_GRADE";
}

// enum클래스는 데이터의 종류를 하나의 enum명 아래 묶는것
// enum의 변수값은 static final변수처럼 사용
enum ClassGrade {
   FIRST_GRADE, SECOND_GRADE, THIRD_GRADE
}

class Student {
   private String name;
   private String classGrade; 
   private ClassGrade classGrade;

   public Student(String name, ClassGrade classGrade) {

   public Student(String name, ClassGrade classGrade) {
       this.name = name;
       this.name = classGrade; // 학년 : FIRST_GRADE, SECOND_GRADE, THIRD_GRADE만 있다고 가정
   }
}

@Override
public String toString() {
   return "Student{" +
           "name='" + name + '\'' +
           ", classGrade='" + classGrade + '\'' +
           '}';
    }
}

