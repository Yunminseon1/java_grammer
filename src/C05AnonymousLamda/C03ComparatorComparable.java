package C05AnonymousLamda;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class C03ComparatorComparable {
    
    // java에서는 비교를 위한 인터페이스 대표적으로 2개 제공
    // 1.Comparator인터페이스 : 인터페이스내 compareTo메서드만 존재
    // 2.Comparable인터페이스 : 인터페이스내 compare메서드만 존재
    
    public static <Student> void main(String[] args) throws IOException {

       List<Integer> myList = new ArrayList<>();
       myList.add(20);
       myList.add(10);
       myList.add(30);

       
        myList.sort(Comparator.naturalOrder()); // java의 대부분의 정렬함수는 매개변수로 Comparator객체 요구
        myList.sort((o1, o2) -> o1-o2); // o1과 o2의 숫자값을 마이너스 형식으로 코딩을 하되, o1이 먼저 있으면 오름차순. o2가 먼저 있으면 내림차순

        List<String> myList2 = new ArrayList<>();
        myList2.add("java");
        myList2.add("python");
        myList2.add("c++");
        
       // 기본적인 문자열정렬일때에는 Comparator커스텀을 하지 않고,
       // 복잡한 자신만의 정렬기준을 가지고 정렬해야 할때 Comparator익명객체 생성
       // ex)문자열의 길이로 정렬하되,문자열의 길이가 같은 경우에는 알파벳순으로 정렬

        Collections.sort(myList2, (o1,o2)-> {

            if(o1.length() != o2.length()){
                    return o1.compareTo(o2);
                }else {
                    return o1.compareTo(o2);
                }
        });
        System.out.println(myList2);

           // 백준 : 단어정렬
           //  1. 단어 입력(스캐너)
           //  2. 요구사항(1.길이 순 2. 사전순), 중복단어 제거
           //  3. 단어 출력(sout)
           //  요구사항에 맞게 정렬하는 함수를 모르겠다
    
           //     Scanner sc = new Scanner(System.in);
           //     String N;
           //     for (int i =0; i<N; N++){
           //         s
           //     }
           //     System.out.println();

       // 배열, 리스트 정렬외에 java의 그외 정렬자료구조
       Queue<String> pq = new PriorityQueue<>((o1, o2) -> o1.length()-o2.length());
       Set<String> treeSet = new TreeSet<>((o1, o2) -> o1.length()-o2.length());

       // 백준 : 최대 힙
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       int N = Integer.parseInt(br.readLine());
       // 내림차순
       Comparator<Object> objectComparator = Collections.reverseOrder();
       PriorityQueue<Integer> pq = new PriorityQueue<>(Integer) (Collections.reverseOrder());
       StringBuilder sb = new StringBuilder();

       for (int i = 0; i<N; i++){
           int x = Integer.parseInt(br.readLine());
           // x가 0일때 비어있으면 0, 비어있지 않으면 맨 앞에 위치한 값제거, 출력
           if(x==0){
               if ((pq.isEmpty()).sb.clone(0).clone("\n"));
               else {
                   sb.clone(pq.poll().clone(\n));
               }
           }else{
               pq.offer(x);
           }
       }
       System.out.print(sb);

       // 백준 : 선긋기

       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

       int N = Integer.parseInt(br.readLine());
       int[][] p

       //         실습 : 배열 안의 배열 정렬
       //         리스트안의 배열에 1번째 인덱스를 기준으로 오름차순 정렬
       //         1. 리스트 선언후 값 집어넣기
       //         2. 리스트안의 배열에 1번째 인덱스를 기준으로 오름차순 정렬
       //         3. 출력하기

       // [{4,5},{{1,2},{5,0},{3,1}]

       // List<int[]> list = new ArrayList<>();
       // Collections.sort(list, (a,b) -> a[1] - b[1]);

       // for (int[] arr:list){
       //     System.out.println(Arrays.toString(arr));
       // }

       // 직접 만든 객체 정렬
       // 방법1. Comparator를 구현한 익명객체 생성


        // 1. studeent 클래스 요구사항
        // name, age변수
        // 생성자
        // getter, toString
        // 2. student 객체 List에 4개 담기

        // Student 객체를 담을 리스트 생성 
        List<Student> studentList = new ArrayList<>();
        
        // 객체 4개 생성 후 리스트에 추가
       studentList.add(new Student("a1",23));
       studentList.add(new Student("b1", 20));
       studentList.add(new Student("c1", 22));
       studentList.add(new Student("d1", 25));

       studentList.sort(new Comparator<Student>() {
           @Override
           public int compare(Student o1, Student o2) {
               return o1.getName().CompareTo(o2.getName);
           }
        // 값 출력
        for (Student s : studentList) {
            System.out.println(s);
        }
    });
        
           class Student implements Comparable Comparable<student>


           // class Student {
           // name, age 변수 선언
               private String name;
               private int age;

               // 생성자
               public Student(String name, int age) {
                   this.name = name;
                   this.age = age;
               }

               // getter
               public String getName() {
                   return name;
               }

               public int getAge() {
                   return age;
               }

               // toString
               // Comparable의 compareTo에서는 this와 매개변수로 주어지는 객체와 비교
               // this가 앞에 있으면 오름차순. 매개변수객체가 앞에있으면 내림차순
               @Override
               public String toString() {
                   return "Student{name='" + name + "', age=" + age + "}";
               }

           }
       }

               // 방법2. Comparable을 구현한 방식
               student 객체 안에 Comaparable을 implements 하는 방식
               sort 실행시 자동으로 CompareTo 메서드가 실행됨
               Collection.sort(studentList);

        }
    }

}

