package C05AnonymousLamda;

import java.util.*;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class C04StreamApi {
    static <Student> void main(String[] args) throws NoSuchFieldException {
//        int[] arr = {20,10,4,12};
////        전통적인 방식의 데이터 접근방법은 메모리주소로 접근하는 방식이다.
//        for(int i=0; i< arr.length; i++){
//            System.out.println(arr[i]);
//        }

//        함수형 프로그래밍 방식 : 데이터와 객체 중심이 아닌, 입력에 따른 출력(연산작업 포함)만 존재하는 코딩스타일
//        streamApi : java에서 함수형프로그래밍을 지원하는 라이브러리
//        foreach는 스트림의 각 요소를 하나씩 소모하면서 동작을 수행

//        Arrays.stream(arr).forEach(a-> System.out.println(a));


//        스트림의 생성 : .stream()
//        List<String> myList = new ArrayList<>();
//        myList.add("java");
//        myList.add("python");
//        myList.add("C++");
//        Stream<String> stream1 = myList.stream();
//        String[] myArr = new String[]{"java", "python", "C++"};
//        Stream<String> stream2 = Arrays.stream(myArr);
//
////        원시자료형을 위한 stream객체가 별도로 존재
//        int[] intArr = {10,20,30,40,50};
//        IntStream stream3 = Arrays.stream(intArr);

//        stream의 중개연산(변환) : filter, map, sorted, distinct, mapToInt
//        int[] intArr = {10, 10, 30, 40, 50};
//
////        filter : 특정기준으로 대상을 필터링하여 새로운 스트림을 반환하는 중개연산
////        sum : 스트림의 요소를 하나씩 소모하여 총합을 구하는 메서드
//        int total = Arrays.stream(intArr).filter(a -> a >= 30).sum();
//        System.out.println(total);
//

////        map은 기존의 stream을 조작하여 새로운 스트림을 반환
//        int total2 = Arrays.stream(intArr).map(a -> a * a);
//        System.out.println(total2);

////      distinct : 중복제거
//        int total3 = Arrays.stream(intArr).distinct().sum();
//        System.out.println(total3);
////        sorted : 정렬
//        int [] sortedArr = Arrays.stream(intArr).sorted().toArray();
//        System.out.println(Arrays.toString(sortedArr));
////      mapToInt : intstream 형태로 변환해주는 map
//        String[] stArr = {"java", "python", "C++"};
//        Arrays.stream(stArr).map(a->a+="hello");
//
//        int totalLength = Arrays.stream(stArr).mapToInt(a->a.length()).sum();


        int[] arr = {1, 2, 3, 4, 5, 6};
////        실습1) arr에서 홀수만 남은 배열을 생성 후 배열출력
        int[] arr1 = Arrays.stream(arr).filter(a -> a % 2 == 1).map(a -> a * a).toArray();
        System.out.println(Arrays.toString(arr1));

//        // 나의 풀이과정
//        // 홀수만 남기기
//        int[] newArr1 = Arrays.stream(arr).filter(n -> n % 2 == 1).toArray();
//
//        //        실습2) arr에서 홀수만 걸러서 해당 홀수의 제곱값으 담은 배열을 출력
//        int[] newArr2 = Arrays.stream(arr).filter(n -> n % 2 == 1).map(a -> a * a).toArray();
//
//        //        실습3) arr에서 홀수만 걸러 제곱값을 구하고. 해당 숫자값을 오름차순한  순서로 배열을 출력
//        int[] newArr3 = Arrays.stream(arr).filter(n -> n % 2 == 1).map(a -> a * a).sorted().toArray();
//
//
//        System.out.println(Arrays.toString(newArr1));
//
//        System.out.println(Arrays.toString(newArr2));
//
//        System.out.println(Arrays.toString(newArr3));


//        stream의 소모 : foreach(출력), sum(합계),count, max, min, , reduce(누적연산), findFirst(stream의 첫번째 값 리턴)
//        int[] intArr = {10, 20, 30, 40};
//        Arrays.stream(intArr).forEach(a -> System.out.println(a));
//
//        int total = Arrays.stream(intArr).sum();
//        System.out.println(total);
//        int count = Arrays.stream(intArr).sum();
//

////        optional 객체 : 값이 있을수도있고, 없을수도있음을 명시한 객체
//        System.out.println(count);
//        int max = Arrays.stream(intArr).max().getAsInt();
//        int min = Arrays.stream(intArr).min().getAsInt();

//        reduce : 누적연산 -> reducr(초기값, 연산자)
//        int[] intArr = {10,20,30,40};
//        int accSum = Arrays.stream(intArr).reduce(0,(a,b)->a+b);
//        System.out.println(accSum);
//        int accMultiply = Arrays.stream(intArr).reduce(0,(a,b)->a+b);
//        System.out.print(accMultiply);
//        String[] stArr={"java","python","C++"};
//        String result = Arrays.stream(stArr).reduce("",(a,b)->a+b);
//        System.out.println(result);

//        findFirst : 첫번째 요소 반환
//        String firstValue = Arrays.stream(stArr).filter(a->a.length()>=5).findFirst().get();
//        System.out.println(firstValue);

//        Map<String,Integer> myMap = new TreeMap<>();
//        myMap.put("hello"10);
//        myMap.put("Java"20);
//        String firstkeyvalue = myMap.keySet().stream().findFirst().get();
//        System.out.println(firstkeyvalue);

//        배열로 변환시 주의사항 : 제네릭의 타입소거 -> 자바의 런타임 시점에 제네릭과 같은 타입이 제거되는 현상
//        제네릭의 타입소거로 인해, toArray를 통해 새로운 String배열을 만드는것은 불가하다.
//        글자가 5개이상인 문자만 배열 String api 사용하기
//        String[] stArr = {"hello", "java", "world"};
//        String[] answer = Arrays.stream(stArr).filter(s-> s.length() >= 5).toArray(String[]::new);
//        int[] intArr = {10,20};
//        int[] answer = stream.toArray(a->new String[a]);
//
////        메서드 참조 : 하나의 메서드만을 호출하는 경우에 매개변수를 제거하는 형식
////        형식 - "클래스명::메서드명", 조건 - 하나의 메서드(실행문)만을 호출하는경우
//        Arrays.stream(stArr).forEach(a-> System.out.println(a));
//        Arrays.stream(stArr).forEach(System.out::println); // 매개변수를 없앰


//        List<Student> myList = new ArrayList<>();
//        myList.add(new Student("Kim", 20));
//        myList.add(new Student("choi", 30));
//        myList.add(new Student("lee", 25));
//        myList.add(new Student("park", 35));
//
////                1)모든 객체의 평균나이(average 함수) 구하기
//        double avgAge = myList.stream().mapToInt(a->a.getAge).average().getAsDouble();
//        System.out.println("평균 나이: " + avgAge);
//
////                2) 정렬을 통한 가장 나이 어린 사람 찾기(sorted+findFirst)
//        Student youngest = myList.stream().sorted(new Comparator<Student>() {
//            @Override
//            public int compare(Student o1, Student o2)-> {o1.getAge() - o2.getAge();}
//        });
//            .sorted((a,b) -> a.getAge() - b.getAge()
//                .findFirst()
//                .orElse(null);
//            System.out.println("가장 어린 사람: " + youngest);
//
////                3) 30대인 사람들만의 이름만 모아서 새로운 String배열에 담기(map활용)
//
//        String[] namesIn30s = myList.stream()
//                .filter(s -> s.getAge() >= 30 && s.getAge() < 40) // 30대
//                .map(Student::getName)                            // 이름만 추출
//                .toArray(String[]::new);                          // 배열 변환
//
//        System.out.println(Arrays.toString(namesIn30s));

//        Optional 객체 : 특정개체에 값이 없을지도(null) 모른다는것을 명시적으로 표현한 객체
//          String st1 = null;
//        if(st1==null){
//            System.out.println("값이 없습니다.");
//        }
//        System.out.println(st1.length());
//        Optional<String> opt1 = Optional.ofNullable(null);
//        if (opt1.isPresent()){
//            System.out.println(opt1);
//        }else{
//            System.out.println("값이 없습니다.");
//        }

//        Optional 객체 생성 방법 3가지
        Optional<String> opt1 = Optional.empty(); // 비어있는 optional 객체 생성
        Optional<String> opt2_1 = Optional.ofNullable(null); // 비어있는 optional 객체 생성
        Optional<String> opt2_2 = Optional.ofNullable("hello");//  값이 있는 optional 객체 생성
        Optional<String> opt3 = Optional.of("hello"); // 값이 있는 optional 객체 생성

//      Optional 객체 처리방법 4가지.
//        방법1. isPresent()로 확인후에 get()
//        if(opt2_2.isPresent()){
//            System.out.println(opt2_2.get());
//        }else{
////            System.out.println(opt1.get()); // 에러발생
//                System.out.println("값이 없습니다.");
//
//        }

//       방법2.orElse() : 값이 있으면 있는값 리턴, 없으면 지정한 값 리턴
//        System.out.println(opt2_1.orElse("값이 없습니다"));
//        System.out.println(opt2_2.orElse("값이 없습니다"));

//        방법3. orElseget() : 값이 있으면 있는 값 return, 없으면 람다함수 실행
//        System.out.println(opt2_1.orElseGet() ->new String("값이 없습니다")));

//        방법4. orElseThrow() - 가장 많이 사용 값이 있으면 있는 값 return 없으면 지정한 예외(에러)강제 발생
//        웹 개발에서 값을 입력하는 사용자에게 적절한 메시지 전달과 목적과 의도된 코드 중단을 목표로 강제로 예외에러를 발생시키는 경우는 매우 일반적이다.
//        System.out.println(opt2_1.orElseThrow(()->new RuntimeException("값이 없습니다")));
//        System.out.println(opt2_1.get()); // 에러발생.(지양해야할 에러)

//        optional객체 처리 실습1)
//        List<Student> List = new ArrayList<>();
//        List.add(new Student("Kim", 20));
//        List.add(new Student("choi", 30));
//        List.add(new Student("lee", 25));
//        List.add(new Student("park", 35));
//        OptionalDouble optionalavg = List.stream().mapToInt(a -> a.getAge()).average();
//        double value1 = 0;
//        if (optionalavg.isPresent()) {
//            value1 = optionalavg.getAsDouble();
//            System.out.println(optionalavg.getAsDouble("value1"));
//        } else {
//            System.out.println("값이 없습니다 ");
//        }
////                optional 객체 처리방법2
//        double value2 = list.stream().mapToInt(a -> a.getAge()).average().orElseThrow(() -> new NoSuchElementException("값이 없습니다."));
//        System.out.println(value2);

//                optional객체 처리 실습2)
        List<Student> list = new ArrayList<>();
        list.add(new Student("Kim", 20));
        list.add(new Student("choi", 30));
        list.add(new Student("lee", 25));
        list.add(new Student("park", 35));
        System.out.println("조회하고자 하는 student의 index번호를 입력하시오");
        Scanner sc = new Scanner(System.in);
        int number = Integer.parseInt(sc.nextLine());
        Optional<Student> s1;
        if (list.size() <= number || number < 0) {
            s1 = Optional.empty();
        } else {
            s1 = Optional.of(list.get(number));
        }
        System.out.println(s1);
        System.out.println(s1.orElseThrow(() -> new NoSuchFieldException("없는 회원입니다")));

//        StreamApi/ Optional 위주 복습

    }
}
